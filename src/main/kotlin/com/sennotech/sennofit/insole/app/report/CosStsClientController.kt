package com.sennotech.sennofit.insole.app.report

import com.sennotech.sennofit.insole.app.report.generated.Report
import com.sennotech.sennofit.insole.app.report.generated.ReportServiceGrpc
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

/**
 * @author 严鸿豪
 * @create 2019-01-29 17:43
 */
@GRpcService
class CosStsClientController(private val service: CosStsClientService) :
        ReportServiceGrpc.ReportServiceImplBase() {

    override fun genReportCredential(request: Report.GenReportCredentialRequest?,
            responseObserver: StreamObserver<Report.GenReportCredentialResponse>?) {
        val result = service.reportCredential
        responseObserver!!.onNext(result)
        responseObserver.onCompleted()
    }
}
