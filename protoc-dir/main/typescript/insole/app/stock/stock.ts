
import {
    GrpcService,
    HttpRequestDelegate,
} from "../../../grpc"

export interface UpdateStockRequest {
    updateStockRequest: UpdateStockDetail
    
}

export interface UpdateStockDetail {
    number: number
    
}

export interface UpdateStockResponse {
}

export interface StockRequest {
}

export interface StockResponse {
    stock: number
    
}

/* 商品服务 */
export class StockService extends GrpcService {
    constructor(host: string, httpRequestDelegate: HttpRequestDelegate) {
        super(host, httpRequestDelegate)
    }
    async updateStock(request: UpdateStockRequest): Promise<UpdateStockResponse> {
        const path = '/insole.app.stock.StockService/UpdateStock'
        return await this.call(path, request) as UpdateStockResponse
    }
    
    async stock(request: StockRequest): Promise<StockResponse> {
        const path = '/insole.app.stock.StockService/Stock'
        return await this.call(path, request) as StockResponse
    }
    
}

