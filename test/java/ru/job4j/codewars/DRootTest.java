package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DRootTest {
    @Test
    public void testOne() {
        assertEquals("Nope!", 7, DRoot.digitalRoot(16));
    }

    @Test
    public void testTwo() {
        assertEquals("Nope!", 6, DRoot.digitalRoot(456));
    }

    @Test
    public void testThree() {
        assertEquals("Nope!", 6, DRoot.digitalRoot(132189));
    }

    @Test
    public void testFour() {
        assertEquals("Nope!", 2, DRoot.digitalRoot(493193));
    }
}