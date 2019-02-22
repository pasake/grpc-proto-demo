package com.sennotech.sennofit.stock

import com.sennotech.euler.common.exceptions.SennofitExceptions
import com.sennotech.sennofit.insole.app.stock.generated.StockServiceGrpc
import com.sennotech.sennofit.insole.app.stock.generated.UpdateStockRequest
import com.sennotech.sennofit.insole.app.stock.generated.UpdateStockResponse
import io.grpc.stub.StreamObserver
import org.springframework.data.redis.core.RedisTemplate
import javax.annotation.PostConstruct

/**
 * @author 严鸿豪
 * @create 2019-02-22 18:12
 */
class StockController(
        private val redisTemplate: RedisTemplate<String, String>
) : StockServiceGrpc.StockServiceImplBase() {

    @PostConstruct
    fun init() {
        val stock = redisTemplate.opsForValue().get("insole_stock") ?: "100"
        redisTemplate.opsForValue().set("insole_stock", stock)
    }

    override fun updateStock(request: UpdateStockRequest?, responseObserver: StreamObserver<UpdateStockResponse>?) {
        if (request == null)
            throw SennofitExceptions.RequestIsNull("b868be10-b5f3-46d5-b5be-4d3dbfbf2aeb")

        redisTemplate.opsForValue().set("insole_stock", request.number.toString())

        responseObserver?.apply {
            onNext(UpdateStockResponse.getDefaultInstance())
            onCompleted()
        }
    }
}