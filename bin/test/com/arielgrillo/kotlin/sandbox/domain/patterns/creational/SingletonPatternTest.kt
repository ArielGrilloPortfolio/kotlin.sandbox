package com.arielgrillo.kotlin.sandbox.domain.patterns.creational

import org.junit.jupiter.api.Assertions.assertSame
import org.junit.jupiter.api.Test

internal class SingletonPatternTest {

    @Test
    fun `singleton instances should be the same`(){
        val sinstance1 = SingletonPattern.getInstance()
        val sinstance2 = SingletonPattern.getInstance()

        assertSame(sinstance1, sinstance2)
    }

}