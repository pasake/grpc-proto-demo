
import {
    GrpcService,
    HttpRequestDelegate,
} from "../../../grpc"

import {
    SkuDetail,
} from "../../../insole/app/sku/sku"

export interface CreateOrderRequest {
    address: AddressDetail
    
    orderItems: Array<OrderItemDetailRequest>
    
    organizationId: number
    
    reportDetail: ReportDetail
    
}

export interface CreateOrderResponse {
}

export interface ReportDetail {
    gait: string
    
    frontPosture: string
    
    sidePosture: string
    
    leftFoot: string
    
    rightFoot: string
    
}

export interface OrderDetailResponse {
    orderDetail: OrderDetail
    
}

export interface OrderDetail {
    id: string
    
    address: AddressDetail
    
    orderItems: Array<OrderItemDetailResponse>
    
}

export interface ListOrderResponse {
    orderItems: Array<OrderDetail>
    
}

export interface ListOrderRequest {
}

export interface GetOrderRequest {
    id: number
    
}

export interface AddressDetail {
    gender: string
    
    shippingAddress: string
    
    customerName: string
    
    customerPhone: string
    
}

export interface OrderItemDetailRequest {
    shoesSize: number
    
    quantity: number
    
    skuId: string
    
}

export interface OrderItemDetailResponse {
    shoesSize: number
    
    quantity: number
    
    sku: SkuDetail
    
}

/* 商品服务 */
export class OrderService extends GrpcService {
    constructor(host: string, httpRequestDelegate: HttpRequestDelegate) {
        super(host, httpRequestDelegate)
    }
    async createOrder(request: CreateOrderRequest): Promise<CreateOrderResponse> {
        const path = '/insole.app.order.OrderService/CreateOrder'
        return await this.call(path, request) as CreateOrderResponse
    }
    
    async listOrder(request: ListOrderRequest): Promise<ListOrderResponse> {
        const path = '/insole.app.order.OrderService/ListOrder'
        return await this.call(path, request) as ListOrderResponse
    }
    
    async getOrder(request: GetOrderRequest): Promise<OrderDetailResponse> {
        const path = '/insole.app.order.OrderService/GetOrder'
        return await this.call(path, request) as OrderDetailResponse
    }
    
}

