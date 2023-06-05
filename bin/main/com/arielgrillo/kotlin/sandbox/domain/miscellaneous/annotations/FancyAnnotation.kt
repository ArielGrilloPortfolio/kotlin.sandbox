package com.arielgrillo.kotlin.sandbox.domain.miscellaneous.annotations

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
//@Repeatable //Allows to use annotation more than one time. I.e.: For each param
@MustBeDocumented
annotation class FancyAnnotation(val param: String) {
}