package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodeWarsTest {
    @Test
    public void testSomething() {
        assertEquals(1, CodeWars.strCount("Hello", 'o'));
        assertEquals(2, CodeWars.strCount("Hello", 'l'));
        assertEquals(0, CodeWars.strCount("",'z'));
    }
}