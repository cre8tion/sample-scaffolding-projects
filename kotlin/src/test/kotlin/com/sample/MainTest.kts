package com.sample

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class MainTest{
    @Test
    fun foo() {
        Assertions.assertEquals("Hello World!", main())
    }
}