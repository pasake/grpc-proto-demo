package com.sennotech.sennofit.order

import com.sennotech.sennofit.sku.SkuEntity
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.mongodb.core.mapping.Document
import java.sql.Timestamp
import javax.persistence.Id

/**
 * @author 严鸿豪
 * @create 2019-02-22 10:43
 */
@Document(collection = "order")
class OrderEntiry(
        @Id
        var id: String,
        var orderDetail: OrderDetail? = null,
        var shippingAddress: ShippingAddress
)

data class OrderDetail(
        var orderIdInRedis: Long,
        var orderIdInSenno: Long? = null,
        var orderNo: String? = null,
        @field:CreationTimestamp
        var createTime: Timestamp,
        @field:UpdateTimestamp
        var updateTime: Timestamp,
        var items: List<OrderItem>,
        var orderStatus: String
) {
    fun unpaid(): Boolean {
        return this.orderStatus == "unpaid"
    }

    fun paid(): Boolean {
        return this.orderStatus == "paid"
    }
}

data class OrderItem(
        var shoesSize: String,
        var quantity: Int,
        var skuEntity: SkuEntity
)

data class ShippingAddress(
        var phone: String,
        var name: String,
        var address: String
)