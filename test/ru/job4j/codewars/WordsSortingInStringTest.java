package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordsSortingInStringTest {

    WordsSortingInString sort = new WordsSortingInString();

    @Test
    public void test() {

        assertEquals("This is a sentence", sort.sortSentence("is2 sentence4 This1 a3"));
    }

    @Test
    public void test2() {
        assertEquals("Me Myself and I", sort.sortSentence("Myself2 Me1 I4 and3"));
    }
}