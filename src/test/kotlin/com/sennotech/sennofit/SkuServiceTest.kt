package com.sennotech.sennofit

import com.sennotech.euler.common.util.logger
import com.sennotech.sennofit.insole.app.sku.generated.CreateSkuRequest
import com.sennotech.sennofit.insole.app.sku.generated.GetSkuRequest
import com.sennotech.sennofit.insole.app.sku.generated.ListSkuRequest
import com.sennotech.sennofit.insole.app.sku.generated.SkuServiceGrpc
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.lognet.springboot.grpc.context.LocalRunningGrpcPort
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * @author 严鸿豪
 * @create 2019-02-20 18:19
 */
@SpringBootTest
@RunWith(SpringRunner::class)
class SkuServiceTest {

    private val log = logger()

    private lateinit var channel: ManagedChannel
    private lateinit var stub: SkuServiceGrpc.SkuServiceBlockingStub

    @LocalRunningGrpcPort
    var runningPort: Int = 0

    @Before
    fun setupChannels() {
        channel = ManagedChannelBuilder
                .forAddress("localhost", runningPort)
                .usePlaintext()
                .build()

        stub = SkuServiceGrpc.newBlockingStub(channel)
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
    fun `create sku`() {
        val response = stub.createSku(CreateSkuRequest.newBuilder().apply {
            skuName = "SennoFit Sports-迪卡波"
            oriPrice = 19900
            curPrice = 9900
            skuUrl = "https://insole-1255704943.cos.ap-hongkong.myqcloud.com/production/goods/Tekapo.png"
        }.build())
        log.info(response.toString())
    }

    @Test
    fun `list sku`() {
        val response = stub.listSku(ListSkuRequest.getDefaultInstance())
        log.info(response.toString())
    }

    @Test
    fun `get sku`(){
        try {
            val sku = stub.getSku(GetSkuRequest.newBuilder().setId("1").build())
        } catch (e:Exception) {
            println(e)
        }
    }
}