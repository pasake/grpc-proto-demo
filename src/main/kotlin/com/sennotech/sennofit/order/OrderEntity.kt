package com.sennotech.sennofit.order

import com.sennotech.sennofit.sku.SkuEntity
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.sql.Timestamp

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
        var accessToken: String
)

data class OrderDetail(
        var orderIdInRedis: Long,
        var orderIdInSenno: Long? = null,
        var orderNo: String? = null,
        var createTime: Timestamp? = null,
        var updateTime: Timestamp? = null,
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
        var shoesSize: Int,
        var quantity: Int,
        var skuEntity: SkuEntity
)

data class ShippingAddress(
        var phone: String,
        var name: String,
        var address: String
)