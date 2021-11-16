package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInStringTest {
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWordsInString.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", ReverseWordsInString.reverseWords("apple"));
        assertEquals("a b c d", ReverseWordsInString.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", ReverseWordsInString.reverseWords("double  spaced  words"));
    }
}