package com.sennotech.sennofit.order

import com.google.protobuf.StringValue
import com.sennotech.euler.common.grpc.ContextKeys
import com.sennotech.euler.common.util.logger
import com.sennotech.euler.order.client.OrderClient
import com.sennotech.euler.order.generated.AddOrderItemRequest
import com.sennotech.euler.order.generated.CreateOrder
import com.sennotech.sennofit.Exceptions
import com.sennotech.sennofit.insole.app.order.generated.*
import com.sennotech.sennofit.insole.app.sku.generated.SkuDetail
import com.sennotech.sennofit.sku.SkuRepository
import org.apache.commons.lang3.StringUtils
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.text.SimpleDateFormat
import java.util.*
import javax.annotation.PostConstruct

/**
 * @author 严鸿豪
 * @create 2019-02-22 10:43
 */
@Service
class OrderService(
        private val orderRepository: OrderRepository,
        private val skuRepository: SkuRepository,
        private val redisTemplate: RedisTemplate<String, String>,
        private val orderClient: OrderClient
) {
    private val log = logger()

    @PostConstruct
    fun init() {
        val orderCount = orderRepository.count()
        val orderCountRedis = redisTemplate.opsForValue().get("order_counter")

        if (StringUtils.isEmpty(orderCountRedis) || orderCountRedis!!.toLong() < orderCount)
            redisTemplate.opsForValue().set("order_counter", orderCount.toString())
    }

    @Transactional
    fun createOrder(request: CreateOrderRequest, accessToken: String): String {
        log.info("create order: $request")

        //判断库存
        if(redisTemplate.opsForValue().get("insole_stock")?.toInt() == 0)
            throw Exceptions.StockShortage("c22a5297-daea-4628-a510-15374e5e57e2")

        //取第一个订单项的描述和标题
        val sku = skuRepository.findById(request.orderItemsList[0].skuId).orElseThrow {
            Exceptions.SkuNotFound("0a2150cc-9973-4482-a7f0-962b287e9b53")
        }
        val createOrderResponse = orderClient.createOrder(com.sennotech.euler.order.generated.CreateOrderRequest.newBuilder().apply {
            createOrder = CreateOrder.newBuilder().apply {
                orderCreatorAccountId = ContextKeys.accountInfo.id.get()!!
                organizationId = request.organizationId
                description = sku.desc
                title = sku.skuName
            }.build()
        }.build())

        val orderIdInSenno = createOrderResponse.orderId

        val orderEntity = orderEntity(accessToken, request, orderIdInSenno)
        return orderRepository.save(orderEntity).id!!
    }

    fun listOrder(request: ListOrderRequest?) {
    }

    fun getOrder(request: GetOrderRequest?): OrderDetailResponse {
        val entity = orderRepository.findById(request!!.id).orElseThrow {
            Exceptions.OrderNotFound("2692294a-6fbe-4f34-83aa-187584c3f333")
        }
        return convertResponse(entity)
    }

    private fun convertResponse(orderEntity: OrderEntity): OrderDetailResponse {
        val addressDB = orderEntity.shippingAddress
        val items = orderEntity.orderDetail?.items?.map {
            OrderItemDetailResponse.newBuilder().apply {
                shoesSize = it.shoesSize
                quantity = it.quantity
                sku = SkuDetail.newBuilder().apply {
                    val skuEntity = it.skuEntity
                    skuName = skuEntity.skuName
                    curPrice = skuEntity.curPrice
                    oriPrice = skuEntity.oriPrice
                    id = skuEntity.id
                    picUrl = skuEntity.picUrl
                }.build()
            }.build()
        }

        return OrderDetailResponse.newBuilder().apply {
            orderDetail = com.sennotech.sennofit.insole.app.order.generated.OrderDetail.newBuilder().apply {
                address = AddressDetail.newBuilder().apply {
                    customerPhone = addressDB.phone
                    customerName = addressDB.name
                    shippingAddress = addressDB.address
                }.build()
                addAllOrderItems(items)
                id = orderEntity.id
            }.build()
        }.build()
    }

    private fun orderIncr(): Long {
        return redisTemplate.opsForValue().increment("order_counter", 1)!!
    }

    private fun orderNoGen(orderIdInRedis: Long): String {
        return "Sennofit-" +
                SimpleDateFormat("yyyyMMdd").format(Date()) +
                orderIdInRedis.toString()
    }

    private fun orderEntity(accessToken: String, request: CreateOrderRequest, orderIdInSenno: Long): OrderEntity {
        val items = request.orderItemsList
        val address = request.address
        val orderIdInRedis = orderIncr()
        return OrderEntity(
                accessToken = accessToken,
                shippingAddress = ShippingAddress(
                        phone = address.customerPhone,
                        address = address.shippingAddress,
                        name = address.customerName
                ),
                orderDetail = OrderDetail(
                        orderIdInRedis = orderIdInRedis,
                        orderIdInSenno = orderIdInSenno,
                        orderNo = orderNoGen(orderIdInRedis),
                        orderStatus = "unpaid",
                        items = items.map {
                            val sku = skuRepository.findById(it.skuId).orElseThrow {
                                Exceptions.SkuNotFound("6339df93-011d-4ad5-9f1a-4863d36ada13")
                            }

                            orderClient.addOrderItem(
                                    AddOrderItemRequest.newBuilder().apply {
                                        orderId = orderIdInSenno
                                        orderItem = com.sennotech.euler.order.generated.OrderItem.newBuilder().apply {
                                            thumbnail = StringValue.newBuilder().setValue(sku.picUrl).build()
                                            title = StringValue.newBuilder().setValue(sku.skuName).build()
                                            unitPrice = sku.curPrice
                                            quantity = it.quantity
                                            totalPrice = sku.curPrice * it.quantity
                                            currency = StringValue.of("RMB")
                                            detailType = "sennofit.insole.app"
                                            detailId = orderIdInRedis
                                        }.build()
                                    }.build()
                            )

                            OrderItem(
                                    shoesSize = it.shoesSize,
                                    quantity = it.quantity,
                                    skuEntity = sku
                            )
                        }
                )
        )
    }
}