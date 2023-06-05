package com.arielgrillo.kotlin.sandbox.domain.patterns.behavioral.state

class Phone() {
    var state: State = OffState(this)

    fun lock(): String {
        return "Locking phone and turning off the scree"
    }

    fun home(): String {
        return "Going to home-screen"
    }

    fun unlock(): String {
        return "Unlocking the phone to home"
    }

    fun turnOn():String{
        return "Turning screen on, device still locked"
    }
}