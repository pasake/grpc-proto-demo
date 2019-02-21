package com.sennotech.sennofit.sku

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * @author 严鸿豪
 * @create 2019-02-20 17:15
 */
@Document(collection = "sku")
class SkuEntity(
        @Id
        var id: String? = null,
        var skuName: String,
        var oriPrice: Int,
        var curPrice: Int,
        var picUrl: String
)