package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class WordValuesTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{6, 24}, WordValues.nameValue(new String[]{"abc", "abc abc"}));
        assertArrayEquals(new int[]{88, 12, 225}, WordValues.nameValue(new String[]{"codewars", "abc", "xyz"}));
        assertArrayEquals(new int[]{351, 282, 330}, WordValues.nameValue(new String[]{"abcdefghijklmnopqrstuvwxyz", "stamford bridge", "haskellers"}));
    }
}