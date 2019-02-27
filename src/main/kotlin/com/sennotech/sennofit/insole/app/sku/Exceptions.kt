package com.sennotech.sennofit.insole.app.sku

import com.sennotech.sennofit.common.exceptions.SennofitExceptions

/**
 * @author 严鸿豪
 * @create 2019-02-21 14:39
 */
sealed class Exceptions(
        uuid: String,
        message: String,
        errorCode: Int
) : SennofitExceptions.Sku(
        uuid = uuid,
        message = message,
        errorCode = errorCode
) {
    class SkuNotFound(uuid: String) : Exceptions(
            uuid = uuid,
            message = "Sku not found",
            errorCode = 0
    )
}