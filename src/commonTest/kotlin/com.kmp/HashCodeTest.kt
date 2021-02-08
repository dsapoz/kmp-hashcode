package com.kmp

import kotlin.test.Test
import kotlin.test.assertEquals

class HashCodeTest {
    @Test
    fun verifyHashCode() {
        val expected = -2013268832
        val actual = "A Simple String".hashCode()
        assertEquals(expected, actual, "Actual value: $actual")
    }
}
