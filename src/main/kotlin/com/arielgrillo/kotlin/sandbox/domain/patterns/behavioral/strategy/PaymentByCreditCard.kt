package com.arielgrillo.kotlin.sandbox.domain.patterns.behavioral.strategy

class PaymentByCreditCard(): PaymentStrategy {
    override fun pay(amount: Int) {
        println("Pay $amount with credit card")
    }
}