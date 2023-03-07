package com.example.springretryexample

import org.springframework.retry.support.RetryTemplate
import org.springframework.stereotype.Service

@Service
class TemplateService(private val errorService: ErrorService) {

    private val backoffTemplate = RetryTemplate.builder()
        .exponentialBackoff(1000, 2.0, 10_000)
        .maxAttempts(3)
        .build()

    private val foreverTemplate = RetryTemplate.builder()
        .maxAttempts(Int.MAX_VALUE)
        .build()

    fun runPlain() {
        errorService.runWithError()
    }

    fun runRetry() {
        backoffTemplate.execute<Unit, Exception> { errorService.runWithError() }
    }

    fun runRetryForever() {
        foreverTemplate.execute<Unit, Exception> { errorService.runWithError() }
    }
}
