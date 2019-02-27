package com.sennotech.sennofit.insole.app.order

import com.sennotech.sennofit.common.exceptions.SennofitExceptions

/**
 * @author 严鸿豪
 * @create 2019-02-21 14:39
 */
sealed class Exceptions(
        uuid: String,
        message: String,
        errorCode: Int
) : SennofitExceptions.Order(
        uuid = uuid,
        message = message,
        errorCode = errorCode
) {
    class OrderNotFound(uuid: String) : Exceptions(
            uuid = uuid,
            message = "Order not found",
            errorCode = 0
    )
}