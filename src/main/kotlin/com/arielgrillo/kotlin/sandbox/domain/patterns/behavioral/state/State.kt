package com.arielgrillo.kotlin.sandbox.domain.patterns.behavioral.state

abstract class State(phone: Phone) {

    abstract fun onHome():String
    abstract fun onOffOn():String
}