package com.sennotech.sennofit.insole.app.stock

import com.sennotech.base.common.grpc.interceptors.AccessContextServerInterceptor
import com.sennotech.base.common.grpc.interceptors.RequestLoggerServerInterceptor
import com.sennotech.base.common.grpc.interceptors.RequestUuidServerInterceptor
import com.sennotech.base.common.grpc.interceptors.SennoExceptionServerInterceptor
import com.sennotech.sennofit.common.exceptions.SennofitExceptions
import com.sennotech.sennofit.insole.app.stock.generated.*
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService
import org.springframework.data.redis.core.RedisTemplate
import javax.annotation.PostConstruct

/**
 * @author 严鸿豪
 * @create 2019-02-22 18:12
 */
@GRpcService(
        interceptors = [
            AccessContextServerInterceptor::class,
            SennoExceptionServerInterceptor::class,
            RequestLoggerServerInterceptor::class,
            RequestUuidServerInterceptor::class
        ]
)
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

        if (request.updateStockRequest.number < 0)
            throw Exceptions.StockInValid("f6d76d19-5c17-4ea4-bdf1-c67ae9e25796")

        redisTemplate.opsForValue().set("insole_stock", request.updateStockRequest.number.toString())

        responseObserver?.apply {
            onNext(UpdateStockResponse.getDefaultInstance())
            onCompleted()
        }
    }

    override fun stock(request: StockRequest?, responseObserver: StreamObserver<StockResponse>?) {
        if (request == null)
            throw SennofitExceptions.RequestIsNull("4894d04b-51e5-47f3-9005-3d09b5baeaf2")

        val stock = redisTemplate.opsForValue().get("insole_stock") ?: "0"
        responseObserver?.apply {
            onNext(StockResponse.newBuilder().setStock(stock.toInt()).build())
            onCompleted()
        }
    }
}