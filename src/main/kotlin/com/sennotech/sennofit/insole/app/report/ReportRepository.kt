package com.sennotech.sennofit.insole.app.report

import org.springframework.data.mongodb.repository.MongoRepository

/**
 * @author 严鸿豪
 * @create 2019-03-14 17:56
 */
interface ReportRepository : MongoRepository<ReportEntity, String>