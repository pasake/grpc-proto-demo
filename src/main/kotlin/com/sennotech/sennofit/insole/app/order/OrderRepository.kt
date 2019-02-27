package com.sennotech.sennofit.insole.app.order

import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

/**
 * @author 严鸿豪
 * @create 2019-02-22 11:06
 */
interface OrderRepository : MongoRepository<OrderEntity, String> {
    fun findByOrderIdSenno(orderIdSenno: Long): Optional<OrderEntity>
}