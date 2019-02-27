package com.sennotech.sennofit.insole.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.sennotech"])
@EnableConfigurationProperties
class SennofitInsoleAppApplication

fun main(args: Array<String>) {
    runApplication<SennofitInsoleAppApplication>(*args)
}
