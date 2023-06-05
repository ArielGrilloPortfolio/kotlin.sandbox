package com.arielgrillo.kotlin.sandbox.domain.patterns.behavioral.strategy

class PaymentService(
    private val amount: Int,
    private val paymentStrategy: PaymentStrategy
) {
    fun processPay(){
        paymentStrategy.pay(amount)
    }
}