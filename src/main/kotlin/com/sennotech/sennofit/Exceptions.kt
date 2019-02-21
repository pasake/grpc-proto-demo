package com.sennotech.sennofit

import com.sennotech.euler.common.exceptions.SennofitExceptions
import java.util.*

/**
 * @author 严鸿豪
 * @create 2019-02-21 14:39
 */
sealed class Exceptions(
        uuid: UUID,
        message: String,
        errorCode: Int
) : SennofitExceptions.Sku(
        uuid = uuid,
        message = message,
        errorCode = errorCode
) {
    class SkuNotFound(uuid: String) : Exceptions(
            uuid = UUID.fromString(uuid),
            message = "Sku not found",
            errorCode = 0
    )
}