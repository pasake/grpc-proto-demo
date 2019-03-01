package com.sennotech.sennofit

import com.sennotech.euler.common.util.logger
import com.sennotech.sennofit.insole.app.SennofitInsoleAppApplication
import com.sennotech.sennofit.insole.app.order.*
import com.sennotech.sennofit.insole.app.order.OrderDetail
import com.sennotech.sennofit.insole.app.order.generated.*
import com.sennotech.sennofit.insole.app.sku.SkuEntity
import com.sennotech.sennofit.insole.app.sku.SkuRepository
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import org.junit.runner.RunWith
import org.lognet.springboot.grpc.context.LocalRunningGrpcPort
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * @author 严鸿豪
 * @create 2019-02-22 15:06
 */
@SpringBootTest(
        classes = [SennofitInsoleAppApplication::class],
        webEnvironment = SpringBootTest.WebEnvironment.NONE
)
@RunWith(SpringRunner::class)
//@ActiveProfiles(profiles = ["test"])
class OrderServiceTest {

    private val log = logger()

    private lateinit var channel: ManagedChannel
    private lateinit var stub: OrderServiceGrpc.OrderServiceBlockingStub

    @LocalRunningGrpcPort
    var runningPort: Int = 0

    @get:Rule
    var exceptionRule = ExpectedException.none()

    @Before
    fun setupChannels() {
        channel = ManagedChannelBuilder
                .forAddress("localhost", runningPort)
                .usePlaintext()
                .build()

        stub = OrderServiceGrpc.newBlockingStub(channel)

//        orderRepository.saveAll(arrayListOf(
//                orderEntity(10086, 1008611),
//                orderEntity(10087, 1008711),
//                orderEntity(10088, 1008811)
//        ))
    }

    @After
    fun shutdownChannels() {
        channel.shutdown()
    }

    @Test
    fun contextLoads() {
        log.debug("contextLoads")
    }

    @Test
    fun `create order`() {
        val skuIdentify = skuRepository.findAll()[0].id!!
        val items = listOf<OrderItemDetailRequest>(
                OrderItemDetailRequest.newBuilder().apply {
                    shoesSize = 41
                    quantity = 1
                    skuId = skuIdentify
                }.build(),
                OrderItemDetailRequest.newBuilder().apply {
                    shoesSize = 41
                    quantity = 2
                    skuId = skuIdentify
                }.build(),
                OrderItemDetailRequest.newBuilder().apply {
                    shoesSize = 41
                    quantity = 3
                    skuId = skuIdentify
                }.build()
        )

        val addressDetail = AddressDetail.newBuilder().apply {
            customerName = "yan"
            customerPhone = "18270834644"
            shippingAddress = "广东省 深圳市 南山区 宝源路 1008611号"
        }.build()

        val reportDetailRequest = ReportDetail.newBuilder().apply {
            gait = "gail"
            frontPosture = "front"
            sidePosture = "side"
            leftFoot = "left"
            rightFoot = "right"
        }.build()

        val request = CreateOrderRequest.newBuilder().apply {
            address = addressDetail
            addAllOrderItems(items)
            reportDetail = reportDetailRequest
        }.build()

        stub.createOrder(request)
    }


    @Test
    fun `find one order`() {
        val r = stub.getOrder(GetOrderRequest.newBuilder()
                .setId(orderRepository.findAll()[0].orderIdSenno!!).build())
        log.info(r.toString())
    }

    @Autowired
    lateinit var orderRepository: OrderRepository

    @Test
    fun `list order`() {
        val r = stub.listOrder(ListOrderRequest.getDefaultInstance())

        log.info(r.orderItemsList.toString())
        log.info("size " + r.orderItemsCount)
    }

    private fun orderEntity(orderIdRedis: Long, orderIdSenno: Long): OrderEntity {
        return OrderEntity(
                orderIdRedis = orderIdRedis,
                orderIdSenno = orderIdSenno,
                orderDetail = OrderDetail(
                        orderNo = "orderNo",
                        items = arrayListOf(
                                OrderItem(
                                        shoesSize = 12,
                                        quantity = 1,
                                        skuEntity = SkuEntity(
                                                skuName = "skuName",
                                                oriPrice = 1000,
                                                curPrice = 500,
                                                picUrl = "picUrl"
                                        )
                                )
                        )
                ),
                shippingAddress = ShippingAddress(
                        phone = "phone",
                        name = "name",
                        address = "address"
                ),
                report = Report(
                        gait = "gait",
                        sidePosture = "side",
                        frontPosture = "front",
                        leftFoot = "left",
                        rightFoot = "right"
                )
        )
    }

    @Autowired
    lateinit var skuRepository: SkuRepository
}