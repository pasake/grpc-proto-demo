package com.sennotech.sennofit.insole.app.sku


import org.springframework.data.mongodb.repository.MongoRepository

interface SkuRepository : MongoRepository<SkuEntity, String>
