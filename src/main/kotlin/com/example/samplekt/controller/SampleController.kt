package com.example.samplekt.controller

import com.example.samplekt.controller.dto.SampleResponse
import com.example.samplekt.domain.SampleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(val sampleService: SampleService) {
    @GetMapping("/samples")
    fun getSamples(): List<SampleResponse> {
        return sampleService.getSamples()
    }

    @PostMapping("/samples")
    fun addSample(value: String) {
        sampleService.addSample(value)
    }

    @GetMapping("/health")
    fun healthCheck(): String {
        return "healthy"
    }
}