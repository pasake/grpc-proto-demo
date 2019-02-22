package com.sennotech.sennofit.sku

import com.sennotech.euler.common.exceptions.SennofitExceptions
import com.sennotech.euler.common.grpc.interceptors.AccessContextServerInterceptor
import com.sennotech.euler.common.grpc.interceptors.EulerExceptionServerInterceptor
import com.sennotech.euler.common.grpc.interceptors.RequestLoggerServerInterceptor
import com.sennotech.euler.common.grpc.interceptors.RequestUuidServerInterceptor
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService
import com.sennotech.sennofit.insole.app.sku.generated.*

/**
 * @author 严鸿豪
 * @create 2019-02-20 17:59
 */
@GRpcService(
        interceptors = [
            AccessContextServerInterceptor::class,
            EulerExceptionServerInterceptor::class,
            RequestLoggerServerInterceptor::class,
            RequestUuidServerInterceptor::class
        ]
)
class SkuController(
        private val skuService: SkuService
) : SkuServiceGrpc.SkuServiceImplBase() {

    override fun createSku(request: CreateSkuRequest?, responseObserver: StreamObserver<SkuDetailResponse>?) {
        if (request == null)
            throw SennofitExceptions.RequestIsNull("4503f1a8-17ba-493f-8c26-4e46634274cc")

        val result = skuService.create(request)
        responseObserver?.apply {
            onNext(SkuDetailResponse.newBuilder().setSkuDetail(result).build())
            onCompleted()
        }
    }

    override fun listSku(request: ListSkuRequest?, responseObserver: StreamObserver<ListSkuResponse>?) {
        if (request == null)
            throw SennofitExceptions.RequestIsNull("735442f7-d536-429e-80bd-d1330b2b57ad")

        val result = skuService.list(request)
        responseObserver?.apply {
            onNext(ListSkuResponse.newBuilder().addAllItems(result).build())
            onCompleted()
        }
    }

    override fun getSku(request: GetSkuRequest?, responseObserver: StreamObserver<SkuDetailResponse>?) {
        if (request == null)
            throw SennofitExceptions.RequestIsNull("21d29c0e-7d7e-46d0-9faf-2541acce44e2")

        val sku = skuService.getSku(request)
        responseObserver?.apply {
            onNext(SkuDetailResponse.newBuilder().setSkuDetail(sku).build())
            onCompleted()
        }
    }
}
