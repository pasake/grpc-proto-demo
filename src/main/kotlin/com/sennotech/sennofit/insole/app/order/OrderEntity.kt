package com.sennotech.sennofit.insole.app.order

import com.sennotech.sennofit.insole.app.report.ReportEntity
import com.sennotech.sennofit.insole.app.sku.SkuEntity
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

/**
 * @author 严鸿豪
 * @create 2019-02-22 10:43
 */
@Document(collection = "order")
class OrderEntity(
        @Id
        var id: String? = null,
        var orderDetail: OrderDetail? = null,
        var shippingAddress: ShippingAddress,
        var orderIdRedis: Long,
        var orderIdSenno: Long? = null,
        var reportId: String? = null,
        var accountId: Long? = null
)

data class OrderDetail(
        var orderNo: String,
        @field:CreatedDate
        var createTime: LocalDateTime? = LocalDateTime.now(),
        @field:LastModifiedDate
        var updateTime: LocalDateTime? = LocalDateTime.now(),
        var items: List<OrderItem>,
        var message: String? = null
)

data class OrderItem(
        var shoesSize: Int,
        var quantity: Int,
        var skuEntity: SkuEntity
)

data class ShippingAddress(
        var gender: String,
        var phone: String,
        var name: String,
        var address: String
)