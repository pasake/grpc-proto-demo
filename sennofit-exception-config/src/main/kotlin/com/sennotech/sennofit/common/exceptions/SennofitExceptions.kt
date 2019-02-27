package com.sennotech.sennofit.common.exceptions

import com.sennotech.euler.common.exceptions.SennoExceptions

sealed class SennofitExceptions(
        uuid: String,
        message: String,
        moduleCode: Int,
        errorCode: Int
) : SennoExceptions.SennofitException(
        uuid = uuid,
        message = message,
        moduleCode = moduleCode,
        errorCode = moduleCode * 1000 + errorCode
) {
    class RequestIsNull(uuid: String) : SennofitExceptions(
            uuid = uuid,
            message = "GRPC Request is null",
            moduleCode = 0,
            errorCode = 0
    )

    class AccountIdIsNull(uuid: String) : SennofitExceptions(
            uuid = uuid,
            message = "Account id is null",
            moduleCode = 0,
            errorCode = 1
    )

    open class Sku(uuid: String, message: String, errorCode: Int)
        : SennofitExceptions(
            uuid = uuid,
            message = message,
            moduleCode = 100,
            errorCode = errorCode
    )

    open class Order(uuid: String, message: String, errorCode: Int)
        : SennofitExceptions(
            uuid = uuid,
            message = message,
            moduleCode = 101,
            errorCode = errorCode
    )

    open class Report(uuid: String, message: String, errorCode: Int)
        : SennofitExceptions(
            uuid = uuid,
            message = message,
            moduleCode = 102,
            errorCode = errorCode
    )

    open class Stock(uuid: String, message: String, errorCode: Int)
        : SennofitExceptions(
            uuid = uuid,
            message = message,
            moduleCode = 103,
            errorCode = errorCode
    )
}