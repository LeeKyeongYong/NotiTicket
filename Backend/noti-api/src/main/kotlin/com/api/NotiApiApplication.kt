package com.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotiApiApplication

fun main(args: Array<String>) {
    runApplication<NotiApiApplication>(*args)
}
