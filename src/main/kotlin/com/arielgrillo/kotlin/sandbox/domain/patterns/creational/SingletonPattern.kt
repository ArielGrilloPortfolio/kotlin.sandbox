package com.arielgrillo.kotlin.sandbox.domain.patterns.creational

class SingletonPattern private constructor() {
    companion object {
        private var instance: SingletonPattern? = null

        fun getInstance(): SingletonPattern {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = SingletonPattern()
                    }
                }
            }
            return instance!! //!! will throw NullPointerException if the value is null.
        }
    }

    fun dosomething() = "do something !!!"
}