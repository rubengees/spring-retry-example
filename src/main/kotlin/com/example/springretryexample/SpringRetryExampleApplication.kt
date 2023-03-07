package com.example.springretryexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.retry.annotation.EnableRetry

@EnableRetry
@SpringBootApplication
class SpringRetryExampleApplication

fun main(args: Array<String>) {
    runApplication<SpringRetryExampleApplication>(*args)
}
