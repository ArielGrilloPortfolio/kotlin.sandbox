package com.arielgrillo.kotlin.sandbox.domain.patterns.creational

class Person private constructor(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val address: String
) {
    data class Builder(
        var firstName: String = "",
        var lastName: String = "",
        var age: Int = 0,
        var address: String = ""
    ) {
        fun firstName(firstName: String) = apply {
            require(firstName.isNotBlank()) { "First name required" }
            this.firstName = firstName
        }
        fun lastName(lastName: String) = apply {
            require(lastName.isNotBlank()) { "Last name required" }
            this.lastName = lastName
        }
        fun age(age: Int) = apply {
            require(age >= 0) { "Age must be a positive value" }
            this.age = age

        }
        fun address(address: String) = apply {
            require(address.isNotBlank()) { "Address required" }
            this.address = address
        }

        fun build(): Person = Person(firstName, lastName, age, address)
    }
}

object BuilderPatterns {
    fun patternUse(firstName: String, lastName: String, age: Int, address: String): Person {
        return Person.Builder()
            .firstName(firstName)
            .lastName(lastName)
            .age(age)
            .address(address)
            .build()
    }
}
