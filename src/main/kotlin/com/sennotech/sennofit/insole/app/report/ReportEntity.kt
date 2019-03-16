package com.sennotech.sennofit.insole.app.report

import lombok.Getter
import lombok.Setter
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

/**
 * @author 严鸿豪
 * @create 2019-03-14 16:24
 */
@Document(collection = "report")
class ReportEntity(
        @Id
        var id: String? = null,
        var images: UUID? = null,
        var video: UUID? = null,
        var accountId: Long? = null,
        var status: String? = null,
        var videoResult: Boolean? = false,
        var postureResult: Boolean? = false,
        var posture: Posture? = null
)

@Setter
@Getter
class Posture {

    var uuid: String? = null
    var front: Item? = null
    var side: Item? = null

    @Setter
    @Getter
    class Item {
        var isValid: Boolean = false
        var points: Any? = null
        var side: String? = null
        var risks: List<Risk>? = null
    }

    @Setter
    @Getter
    class Risk {

        var id: Int = 0
        var key: String? = null
        var raw: Double = 0.toDouble()
        var side: String? = null
        var level: String? = null
        var value: Double = 0.toDouble()
        var isValid: Boolean = false
    }
}