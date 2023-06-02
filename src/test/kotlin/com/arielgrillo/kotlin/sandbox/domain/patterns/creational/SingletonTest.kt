package com.arielgrillo.kotlin.sandbox.domain.patterns.creational

import org.junit.jupiter.api.Assertions.assertSame
import org.junit.jupiter.api.Test

internal class SingletonTest {

    @Test
    fun `singleton instances should be the same`(){
        val sinstance1 = Singleton.getInstance()
        val sinstance2 = Singleton.getInstance()

        assertSame(sinstance1, sinstance2)
    }

}