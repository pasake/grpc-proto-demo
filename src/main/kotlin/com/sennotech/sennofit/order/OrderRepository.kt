package com.sennotech.sennofit.order

import org.springframework.data.mongodb.repository.MongoRepository

/**
 * @author 严鸿豪
 * @create 2019-02-22 11:06
 */
interface OrderRepository : MongoRepository<OrderEntiry, String>