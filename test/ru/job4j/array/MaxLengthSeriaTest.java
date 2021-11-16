package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxLengthSeriaTest {

    @Test
    public void test() {
        assertEquals(0, MaxLengthSeria.find(new int[] {}));
        assertEquals(1, MaxLengthSeria.find(new int[] {1}));
        assertEquals(1, MaxLengthSeria.find(new int[] {2, 1}));
        assertEquals(2, MaxLengthSeria.find(new int[] {1, 2}));
        assertEquals(4, MaxLengthSeria.find(new int[] {1, 2, 0, 1, 2, 3}));
        assertEquals(4, MaxLengthSeria.find(new int[] {1, 2, 1, 1, 2, 3}));
        assertEquals(1, MaxLengthSeria.find(new int[] {3, 2, 1}));
    }

    @Test
    public void testMoreThenOne() {
        assertEquals(9, MaxLengthSeria.find(new int[] {6, 7, 8, 9, 10, 11, 1, 11, 12, 13, 14, 15, 16, 17, 18, 2, 3, 5, 2, 6, 3}));
    }

    @Test
    public void testTwoEquals() {
        assertEquals(5, MaxLengthSeria.find(new int[] {6, 7, 8, 9, 10, 7, 2, 3, 4, 5, 6, 3}));
    }

}