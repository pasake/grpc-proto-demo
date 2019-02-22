package com.sennotech.sennofit

import com.sennotech.euler.common.util.logger
import com.sennotech.sennofit.insole.app.order.generated.*
import com.sennotech.sennofit.insole.app.sku.generated.SkuServiceGrpc
import com.sennotech.sennofit.order.OrderRepository
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.lognet.springboot.grpc.context.LocalRunningGrpcPort
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.ArrayList

/**
 * @author 严鸿豪
 * @create 2019-02-22 15:06
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class OrderServiceTest {

    private val log = logger()

    private lateinit var channel: ManagedChannel
    private lateinit var stub: OrderServiceGrpc.OrderServiceBlockingStub

    @LocalRunningGrpcPort
    var runningPort: Int = 0

    @Before
    fun setupChannels() {
        channel = ManagedChannelBuilder
                .forAddress("localhost", runningPort)
                .usePlaintext()
                .build()

        stub = OrderServiceGrpc.newBlockingStub(channel)
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
        val items = listOf<OrderItemDetailRequest>(
                OrderItemDetailRequest.newBuilder().apply {
                    shoesSize = 41
                    quantity = 1
                    skuId = "5c6fa89150d8222f507b3d81"
                }.build(),
                OrderItemDetailRequest.newBuilder().apply {
                    shoesSize = 41
                    quantity = 2
                    skuId = "5c6fa89150d8222f507b3d81"
                }.build(),
                OrderItemDetailRequest.newBuilder().apply {
                    shoesSize = 41
                    quantity = 3
                    skuId = "5c6fa89150d8222f507b3d81"
                }.build()
        )

        val addressDetail = AddressDetail.newBuilder().apply {
            customerName = "yan"
            customerPhone = "18270834644"
            shippingAddress = "广东省 深圳市 南山区 宝源路 1008611号"
        }.build()

        val request = CreateOrderRequest.newBuilder().apply {
            address = addressDetail
            addAllOrderItems(items)
        }.build()

        val id = stub.createOrder(request).id
        orderRepository.deleteById(id)
    }

    @Test
    fun `find one order`() {
        val r = stub.getOrder(GetOrderRequest.newBuilder().setId("5c6fb0b650d822378cc147b8").build())
        log.info(r.toString())
    }

    @Autowired
    lateinit var orderRepository: OrderRepository
}