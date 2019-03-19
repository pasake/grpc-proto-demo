package com.sennotech.sennofit.insole.app.report

import com.sennotech.base.common.grpc.ContextKeys
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
 * @create 2019-01-29 17:43
 */
@GRpcService(
        interceptors = [
            AccessContextServerInterceptor::class,
            SennoExceptionServerInterceptor::class,
            RequestLoggerServerInterceptor::class,
            RequestUuidServerInterceptor::class
        ]
)
class CosStsClientController(private val service: CosStsClientService,
        private val reportService: ReportService) :
        ReportServiceGrpc.ReportServiceImplBase() {

    override fun genReportCredential(request: Report.GenReportCredentialRequest?,
            responseObserver: StreamObserver<Report.GenReportCredentialResponse>?) {
        val result = service.reportCredential
        responseObserver!!.onNext(result)
        responseObserver.onCompleted()
    }

    override fun accountProfile(request: Report.AccountProfileRequest?,
            responseObserver: StreamObserver<Report.AccountProfileResponse>?) {
        val accessContext = ContextKeys.accessContext.get()
                ?: throw SennofitExceptions.AccountIdIsNull("0622a1f1-6976-43f5-a3e1-be76b50cbcd0")
        val accountId = accessContext.accountContext.accountId

        responseObserver?.apply {
            onNext(Report.AccountProfileResponse.newBuilder().setAccountId(accountId).build())
            onCompleted()
        }
    }

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
