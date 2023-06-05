package com.arielgrillo.kotlin.sandbox.domain.miscellaneous.lambdas

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class LambdasSandboxTest {
    @Test
    fun `lambdas should return ok`(){
        var lambdas = LambdasSandbox();

//        val person = lambdas.person {
//            name = "Jhon"
//            age = 49
//
//        }
        val person = lambdas.person(
            {
                age = 49
                name="Jhon"
            },
            {
                "$name has something to say: Talking from unit test"
            }
        )

        assertEquals(person.age, 49)
        assertEquals(person.name, "Jhon")
        //assertEquals(person)



        //assertEquals(person, 49)
    }
}