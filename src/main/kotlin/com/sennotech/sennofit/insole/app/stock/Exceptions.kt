package com.sennotech.sennofit.insole.app.stock

import com.sennotech.sennofit.common.exceptions.SennofitExceptions

/**
 * @author 严鸿豪
 * @create 2019-02-21 14:39
 */
sealed class Exceptions(
        uuid: String,
        message: String,
        errorCode: Int
) : SennofitExceptions.Stock(
        uuid = uuid,
        message = message,
        errorCode = errorCode
) {
    class StockShortage(uuid: String) : Exceptions(
            uuid = uuid,
            message = "Insole stock shortage",
            errorCode = 0
    )

    class StockInValid(uuid: String) : Exceptions(
            uuid = uuid,
            message = "Stock not a valid number",
            errorCode = 1
    )
}