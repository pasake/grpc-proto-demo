
import {
    GrpcService,
    HttpRequestDelegate,
} from "../../../grpc"

import {
    Timestamp,
} from "../../../google/protobuf/timestamp"

export interface GenReportCredentialRequest {
}

export interface GenReportCredentialResponse {
    startTime: Timestamp
    
    expiredTime: Timestamp
    
    requestId: string
    
    credentialsRsp: CredentialsDto
    
    configRsp: CosConfigDto
    
}

export interface CredentialsDto {
    tmpSecretId: string
    
    tmpSecretKey: string
    
    sessionToken: string
    
}

export interface CosConfigDto {
    appid: string
    
    bucket: string
    
    region: string
    
    keyPrefix: string
    
}

/* 商品服务 */
export class ReportService extends GrpcService {
    constructor(host: string, httpRequestDelegate: HttpRequestDelegate) {
        super(host, httpRequestDelegate)
    }
    async genReportCredential(request: GenReportCredentialRequest): Promise<GenReportCredentialResponse> {
        const path = '/insole.app.report.ReportService/GenReportCredential'
        return await this.call(path, request) as GenReportCredentialResponse
    }
    
}

