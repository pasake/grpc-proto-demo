package com.sennotech.sennofit.insole.app.order

import com.sennotech.base.common.grpc.interceptors.AccessContextServerInterceptor
import com.sennotech.base.common.grpc.interceptors.RequestLoggerServerInterceptor
import com.sennotech.base.common.grpc.interceptors.RequestUuidServerInterceptor
import com.sennotech.base.common.grpc.interceptors.SennoExceptionServerInterceptor
import com.sennotech.sennofit.common.exceptions.SennofitExceptions
import com.sennotech.sennofit.insole.app.order.generated.*
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

/**
 * @author 严鸿豪
 * @create 2019-02-22 11:44
 */
@GRpcService(
        interceptors = [
            AccessContextServerInterceptor::class,
            SennoExceptionServerInterceptor::class,
            RequestLoggerServerInterceptor::class,
            RequestUuidServerInterceptor::class
        ]
)
class OrderController(
        private val orderService: OrderService
) : OrderServiceGrpc.OrderServiceImplBase() {
    override fun createOrder(request: CreateOrderRequest?, responseObserver: StreamObserver<CreateOrderResponse>?) {
        if (request == null)
            throw SennofitExceptions.RequestIsNull("3fafcef4-b781-45dc-8d4f-e9856641fc59")

        var response = orderService.createOrder(request)

        responseObserver?.apply {
            onNext(CreateOrderResponse.newBuilder().setOrderId(response).build())
            onCompleted()
        }
    }

    override fun listOrder(request: ListOrderRequest?, responseObserver: StreamObserver<ListOrderResponse>?) {
        if (request == null)
            throw SennofitExceptions.RequestIsNull("442398f8-a6ec-4638-b1d9-5bb151935b74")

        orderService.listOrder(request)

        responseObserver?.apply {
            onNext(ListOrderResponse.getDefaultInstance())
            onCompleted()
        }
    }

    override fun getOrder(request: GetOrderRequest?, responseObserver: StreamObserver<OrderDetailResponse>?) {
        if (request == null)
            throw SennofitExceptions.RequestIsNull("8d3f2c88-79f0-4c2b-bfd5-1936db537acc")

        responseObserver?.apply {
            onNext(orderService.getOrder(request))
            onCompleted()
        }
    }
}