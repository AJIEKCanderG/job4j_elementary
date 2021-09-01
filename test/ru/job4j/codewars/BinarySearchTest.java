package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void test1() {
        assertEquals(3, BinarySearch.searchIntInArray(new int[] {1, 2, 3, 4, 5, 6}, 4));
    }

    @Test
    public void test2() {
        assertEquals("Number was not found", BinarySearch.searchIntInArray(new int[]{1, 2, 3, 4, 5, 6}, -4));
    }
}