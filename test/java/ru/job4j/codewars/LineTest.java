package ru.job4j.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class LineTest {

    @Test
    public void test1() {
        assertEquals("YES", Line.tickets(new int[] {25, 25, 50}));
    }

    @Test
    public void test2() {
        assertEquals("NO", Line.tickets(new int[] {25, 100}));
    }
}