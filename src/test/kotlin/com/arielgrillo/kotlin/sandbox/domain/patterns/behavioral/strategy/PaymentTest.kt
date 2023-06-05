package com.arielgrillo.kotlin.sandbox.domain.patterns.behavioral.strategy

import org.junit.jupiter.api.Test

class PaymentTest {
    @Test
    fun `when pay should set the right strategy`(){
        val paymentByCreditCard = PaymentByCreditCard()
        val paymentByPayPal = PaymentByPayPal()

        val payOrder_1 = PaymentService(10,paymentByCreditCard)
        val payOrder_2 = PaymentService(10,paymentByPayPal)

        payOrder_1.processPay()
        payOrder_2.processPay()
    }
}