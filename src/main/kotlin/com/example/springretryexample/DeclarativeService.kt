package com.example.springretryexample

import org.springframework.retry.annotation.Backoff
import org.springframework.retry.annotation.Retryable
import org.springframework.stereotype.Service

@Service
class DeclarativeService(private val errorService: ErrorService) {
    fun runPlain() {
        errorService.runWithError()
    }

    @Retryable(backoff = Backoff(delay = 1000, multiplier = 2.0, maxDelay = 10_000), maxAttempts = 3)
    fun runRetry() {
        errorService.runWithError()
    }

    @Retryable(maxAttempts = Int.MAX_VALUE)
    fun runRetryForever() {
        errorService.runWithError()
    }
}
