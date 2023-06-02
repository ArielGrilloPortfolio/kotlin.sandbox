package com.arielgrillo.kotlin.sandbox.domain.patterns.creational

class Singleton private constructor() {
    companion object {
        private var instance: Singleton? = null

        fun getInstance(): Singleton {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = Singleton()
                    }
                }
            }
            return instance!! //!! will throw NullPointerException if the value is null.
        }
    }

    fun dosomething() = "do something !!!"
}