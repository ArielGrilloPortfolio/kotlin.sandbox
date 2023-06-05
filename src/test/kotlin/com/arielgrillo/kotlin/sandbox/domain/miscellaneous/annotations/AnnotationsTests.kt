package com.arielgrillo.kotlin.sandbox.domain.miscellaneous.annotations

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.lang.annotation.*

class AnnotationsTests {

    @Test
    fun `class should have the fancy annotations`() {
        var useFancy = UseFancy("Something to say");

        var useFancyClass = UseFancy::class.java
        var annotation = useFancyClass.getAnnotation(FancyAnnotation::class.java)


        assertEquals(2, useFancyClass.annotations.count())
        assertTrue(useFancyClass.isAnnotationPresent(FancyAnnotation::class.java))
    }
}