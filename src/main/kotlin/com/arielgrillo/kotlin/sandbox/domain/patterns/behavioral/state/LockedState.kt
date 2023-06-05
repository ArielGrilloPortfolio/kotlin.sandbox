package com.arielgrillo.kotlin.sandbox.domain.patterns.behavioral.state

class LockedState(val phone: Phone) : State(phone) {
    override fun onHome(): String {
        phone.state = ReadyState(phone)
        return phone.unlock()
    }

    override fun onOffOn(): String {
        phone.state = OffState(phone)
        return phone.lock()
    }
}