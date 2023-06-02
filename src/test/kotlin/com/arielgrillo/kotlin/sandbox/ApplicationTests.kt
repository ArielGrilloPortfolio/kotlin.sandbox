package com.arielgrillo.kotlin.sandbox

import org.junit.jupiter.api.Test
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@EntityScan(
	basePackages = [
		"com.arielgrillo.kotlin.sandbox.infrastructure",
	]
)

class ApplicationTests {

	@Test
	fun contextLoads() {
	}

}
