package ru.job4j.array;


import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseTest {

    @Test
    public void LettersLowerCaseWithDigits() {
        char[] input = "alpha012".toCharArray();
        char[] expect = "ALPHA".toCharArray();
        assertArrayEquals(expect, UpperCase.toUpperCase(input));
    }

    @Test
    public void LettersLowerCaseWithDigitsWithSymbols() {
        char[] input = "alpha-12@?-".toCharArray();
        char[] expect = "ALPHA".toCharArray();
        assertArrayEquals(expect, UpperCase.toUpperCase(input));
    }

    @Test
    public void LettersLowerCaseAndOneUpperCaseDigitsSymbolsSpace() {
        char[] input = "aLpha - 1-0!@#$5".toCharArray();
        char[] expect = "APHA".toCharArray();
        assertArrayEquals(expect, UpperCase.toUpperCase(input));
    }

    @Test
    public void LettersLowerCaseAndTwoUpperCaseDigitsSpace() {
        char[] input = "aLpHa - 1".toCharArray();
        char[] expect = "APA".toCharArray();
        assertArrayEquals(expect, UpperCase.toUpperCase(input));
    }

}