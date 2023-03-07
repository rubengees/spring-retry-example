package com.example.springretryexample

import org.springframework.stereotype.Service

@Service
class ErrorService {
    fun runWithError(): Int {
        println("Trying to run...")

        error("Error!")
    }
}
