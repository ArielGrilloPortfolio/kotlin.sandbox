package com.arielgrillo.kotlin.sandbox.domain.patterns.behavioral.state

class ReadyState(val phone: Phone) : State(phone) {
    override fun onHome(): String {
        return phone.home()
    }

    override fun onOffOn(): String {
        phone.state = OffState(phone)
        return phone.lock()
    }
}