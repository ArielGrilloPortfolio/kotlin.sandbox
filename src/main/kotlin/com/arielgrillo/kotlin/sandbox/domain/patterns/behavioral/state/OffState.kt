package com.arielgrillo.kotlin.sandbox.domain.patterns.behavioral.state

class OffState(val phone: Phone) : State(phone) {
    override fun onHome(): String {
        phone.state = LockedState(phone)
        return phone.turnOn()
    }

    override fun onOffOn(): String {
        phone.state = LockedState(phone)
        return phone.turnOn()
    }
}