package com.arielgrillo.kotlin.sandbox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
@EntityScan(
	basePackages = [
		"com.arielgrillo.kotlin.sandbox.infrastructure",
	]
)
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
