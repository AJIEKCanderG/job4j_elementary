package ru.job4j.array;


import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseTest {

    @Test
    public void test() {
        char[] input = "alpha-123".toCharArray();
        char[] expect = "ALPHA-123".toCharArray();
        assertArrayEquals(expect, UpperCase.toUpperCase(input));
    }

    @Test
    public void test2() {
        char[] input = "a123b".toCharArray();
        char[] expect = "A123B".toCharArray();
        assertArrayEquals(expect, UpperCase.toUpperCase(input));
    }

}