
import {
    GrpcService,
    HttpRequestDelegate,
} from "../../../grpc"

export interface UpdateSkuRequest {
    skuName: string
    
    oriPrice: number
    
    curPrice: number
    
    id: string
    
}

export interface UpdateSkuResponse {
}

export interface CreateSkuRequest {
    skuName: string
    
    skuUrl: string
    
    oriPrice: number
    
    curPrice: number
    
}

export interface SkuDetailResponse {
    skuDetail: SkuDetail
    
}

export interface SkuDetail {
    skuName: string
    
    picUrl: string
    
    oriPrice: number
    
    curPrice: number
    
    id: string
    
    desc?: string
    
}

export interface ListSkuResponse {
    items: Array<SkuDetail>
    
}

export interface ListSkuRequest {
}

export interface GetSkuRequest {
    id: string
    
}

/* 商品服务 */
export class SkuService extends GrpcService {
    constructor(host: string, httpRequestDelegate: HttpRequestDelegate) {
        super(host, httpRequestDelegate)
    }
    async createSku(request: CreateSkuRequest): Promise<SkuDetailResponse> {
        const path = '/insole.app.sku.SkuService/CreateSku'
        return await this.call(path, request) as SkuDetailResponse
    }
    
    async listSku(request: ListSkuRequest): Promise<ListSkuResponse> {
        const path = '/insole.app.sku.SkuService/ListSku'
        return await this.call(path, request) as ListSkuResponse
    }
    
    async getSku(request: GetSkuRequest): Promise<SkuDetailResponse> {
        const path = '/insole.app.sku.SkuService/GetSku'
        return await this.call(path, request) as SkuDetailResponse
    }
    
    async updateSku(request: UpdateSkuRequest): Promise<UpdateSkuResponse> {
        const path = '/insole.app.sku.SkuService/UpdateSku'
        return await this.call(path, request) as UpdateSkuResponse
    }
    
}

