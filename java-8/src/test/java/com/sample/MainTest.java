package com.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void mainTest(){
        Main main = new Main();
        assertEquals("Hello World!", main.main());
    }
}
