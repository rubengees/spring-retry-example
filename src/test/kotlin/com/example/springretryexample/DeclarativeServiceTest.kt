package com.example.springretryexample

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DeclarativeServiceTest {

    @Autowired
    private lateinit var service: DeclarativeService

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
