package com.sennotech.sennofit.insole.app.report.dto

/**
 * @author 严鸿豪
 * @create 2019-03-15 09:49
 */
class AlgoRspDto(
        val uuid: String,
        val front: Front,
        val side: Side
) {
    data class Front(
            val valid: Boolean,
            val point: Map<String, Point>,
            val risks: List<Risk>
    )

    data class Side(
            val valid: Boolean,
            val side: String,
            val point: Point,
            val risks: List<Risk>
    )

    data class Point(
            val x: Float,
            val y: Float
    )

    data class Risk(
            val id: Int,
            val position: String,
            val code: Int,
            val key: String,
            val name: String,
            val raw: Float,
            val direction: String,
            val value: Float,
            val level: String,
            val description: String,
            val detail: String,
            val valid: Boolean
    )
}