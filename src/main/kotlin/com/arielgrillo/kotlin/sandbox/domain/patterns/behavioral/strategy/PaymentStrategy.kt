package com.arielgrillo.kotlin.sandbox.domain.patterns.behavioral.strategy

interface PaymentStrategy {
    fun pay(amount: Int)
}