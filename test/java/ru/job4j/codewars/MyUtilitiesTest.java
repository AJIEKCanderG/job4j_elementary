package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyUtilitiesTest {

    MyUtilities myUtil = new MyUtilities();

    @Test
    public void test0() {
        assertFalse(myUtil.isDigit("s2324"));
    }

    @Test
    public void test1() {
        assertTrue(myUtil.isDigit("-234.4"));
    }

    @Test
    public void test2() {
        assertTrue(myUtil.isDigit(" 3 "));
    }

    @Test
    public void test3() {
        assertTrue(myUtil.isDigit("3"));
    }

    @Test
    public void test4() {
        assertFalse(myUtil.isDigit("3-4"));
    }

    @Test
    public void test5() {
        assertFalse(myUtil.isDigit("  3   5"));
    }

    @Test
    public void test6() {
        assertFalse(myUtil.isDigit("3 5"));
    }

    @Test
    public void test7() {
        assertFalse(myUtil.isDigit("zero"));
    }

    @Test
    public void test8() {
        assertFalse(myUtil.isDigit(""));
    }
}