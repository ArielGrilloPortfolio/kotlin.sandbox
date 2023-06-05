package com.arielgrillo.kotlin.sandbox.domain.miscellaneous.annotations

@FancyAnnotation(param = "param_1")
//@FancyAnnotation(param = "param_2")
class UseFancy(private val someProp: String) {
    fun domsomething(){
        println(someProp)
    }
}