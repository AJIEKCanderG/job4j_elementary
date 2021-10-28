package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Ajiekcander
 */
public class AlphabeticalAddTest {
    @Test
    public void fixedTests() {
        assertEquals("f", AlphabeticalAdd.addLetters("a", "b", "c"));
        assertEquals("z", AlphabeticalAdd.addLetters("z"));
        assertEquals("c", AlphabeticalAdd.addLetters("a", "b"));
        assertEquals("c", AlphabeticalAdd.addLetters("c"));
        assertEquals("a", AlphabeticalAdd.addLetters("z", "a"));
        assertEquals("d", AlphabeticalAdd.addLetters("y", "c", "b"));
        assertEquals("z", AlphabeticalAdd.addLetters());
    }
}