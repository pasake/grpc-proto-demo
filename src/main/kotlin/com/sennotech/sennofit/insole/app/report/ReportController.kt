package com.sennotech.sennofit.insole.app.report

import com.sennotech.base.common.grpc.interceptors.AccessContextServerInterceptor
import com.sennotech.base.common.grpc.interceptors.RequestLoggerServerInterceptor
import com.sennotech.base.common.grpc.interceptors.RequestUuidServerInterceptor
import com.sennotech.base.common.grpc.interceptors.SennoExceptionServerInterceptor
import com.sennotech.sennofit.common.exceptions.SennofitExceptions
import com.sennotech.sennofit.insole.app.report.generated.Report
import com.sennotech.sennofit.insole.app.report.generated.ReportServiceGrpc
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

/**
 * @author 严鸿豪
 * @create 2019-03-15 11:20
 */
@GRpcService(
        interceptors = [
            AccessContextServerInterceptor::class,
            SennoExceptionServerInterceptor::class,
            RequestLoggerServerInterceptor::class,
            RequestUuidServerInterceptor::class
        ]
)
class ReportController(
        private val reportService: ReportService
) : ReportServiceGrpc.ReportServiceImplBase() {

    override fun uploadProfile(request: Report.UploadProfileRequest?,
            responseObserver: StreamObserver<Report.UploadProfileResponse>?) {
        if (request == null)
            throw SennofitExceptions.RequestIsNull("4503f1a8-27ba-493f-8c26-4e46624274cc")
        val rsp = reportService.uploadProfile(request)

        responseObserver?.apply {
            onNext(Report.UploadProfileResponse.newBuilder().setAccountId(rsp).build())
            onCompleted()
        }
    }
}