package com.example.samplekt.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Sample (val dataValue: String){
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id : Long? = null
}
