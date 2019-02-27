package com.sennotech.sennofit.insole.app.report

import com.sennotech.sennofit.common.exceptions.SennofitExceptions

/**
 * @author 严鸿豪
 * @create 2019-02-21 14:39
 */
sealed class Exceptions(
        uuid: String,
        message: String,
        errorCode: Int
) : SennofitExceptions.Report(
        uuid = uuid,
        message = message,
        errorCode = errorCode
) {
    open class IllegalArgument(uuid: String, message: String) : Exceptions(
            uuid = uuid,
            message = message,
            errorCode = 0
    )
}