package com.example.samplekt.domain

import com.example.samplekt.controller.dto.SampleResponse
import org.springframework.stereotype.Service

@Service
class SampleService(val sampleRepository: SampleRepository) {
    fun getSamples(): List<SampleResponse> {
        return sampleRepository.findAll()
            .mapNotNull { sample: Sample -> SampleResponse(sample.dataValue) }
    }

    fun addSample(value: String) {
        sampleRepository.save(Sample(value))
    }
}