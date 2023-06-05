package com.arielgrillo.kotlin.sandbox.domain.miscellaneous.lambdas


class Person {
    var name = ""
    var age = 0


}

class LambdasSandbox {
    fun person(
        init: Person.() -> Unit,
        talk: Person.(somethingToSay: String) -> String
    ): Person {
        val person = Person()
        person.init()
        person.talk("")
        return person
    }

}