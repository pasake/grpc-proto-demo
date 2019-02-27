package com.sennotech.sennofit.insole.app.stock

import com.sennotech.euler.common.exceptions.SennofitExceptions
import com.sennotech.euler.common.grpc.interceptors.AccessContextServerInterceptor
import com.sennotech.euler.common.grpc.interceptors.RequestLoggerServerInterceptor
import com.sennotech.euler.common.grpc.interceptors.RequestUuidServerInterceptor
import com.sennotech.euler.common.grpc.interceptors.SennoExceptionServerInterceptor
import com.sennotech.euler.common.util.logger
import com.sennotech.sennofit.insole.app.stock.generated.StockServiceGrpc
import com.sennotech.sennofit.insole.app.stock.generated.UpdateStockRequest
import com.sennotech.sennofit.insole.app.stock.generated.UpdateStockResponse
import io.grpc.stub.StreamObserver
import jdk.nashorn.internal.runtime.regexp.joni.Config.log
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
}