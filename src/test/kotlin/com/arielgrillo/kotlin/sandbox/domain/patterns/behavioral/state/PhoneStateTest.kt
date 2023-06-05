package com.arielgrillo.kotlin.sandbox.domain.patterns.behavioral.state

import org.junit.jupiter.api.Test

class PhoneStateTest {

    @Test
    fun `when phone buttons are pressed should return the right state`(){
        var phone = Phone()

        println(phone.state.onHome())
        println(phone.state.onHome())
        println(phone.state.onHome())
    }
}