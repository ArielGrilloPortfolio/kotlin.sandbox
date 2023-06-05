package com.arielgrillo.kotlin.sandbox.domain.patterns.behavioral.strategy

class PaymentByPayPal():PaymentStrategy {
    override fun pay(amount: Int) {
        println("Pay $amount with pay pal")
    }
}