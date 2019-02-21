package com.sennotech.sennofit.sku


import org.springframework.data.mongodb.repository.MongoRepository

interface SkuRepository : MongoRepository<SkuEntity, String>
