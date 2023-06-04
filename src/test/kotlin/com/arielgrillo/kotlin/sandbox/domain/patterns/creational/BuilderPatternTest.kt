package com.arielgrillo.kotlin.sandbox.domain.patterns.creational

import com.arielgrillo.kotlin.sandbox.domain.patterns.creational.BuilderPatterns
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BuilderPatternTest {

    @Test
    fun `build a person should be ok`(){
        val firstName = "Juan"
        val  lastName = "Perez"
        val age = 40
        val  address = "saturno 123"

        val person = BuilderPatterns.patternUse(firstName,lastName,age,address)

        assertEquals(person.firstName, firstName)
        assertEquals(person.lastName, lastName)
        assertEquals(person.age, age)
        assertEquals(person.address, address)
    }

}