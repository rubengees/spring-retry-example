package com.example.springretryexample

import org.junit.jupiter.api.Test

class TemplateServiceTest {
    private val service = TemplateService(ErrorService())

    @Test
    fun `run plain`() {
        service.runPlain()
    }

    @Test
    fun `run retry`() {
        service.runRetry()
    }

    @Test
    fun `run retry forever`() {
        service.runRetryForever()
    }
}
