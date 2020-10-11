package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void isEven() {
        assertTrue(LogicNot.isEven(4));
    }

    @Test
    public void isPositive() {
        assertTrue(LogicNot.isPositive(2));
    }

    @Test
    public void notEven() {
        assertTrue(LogicNot.notEven(3));
    }

    @Test
    public void notPositive() {
        assertTrue(LogicNot.notPositive(-1));
    }

    @Test
    public void notEvenAndPositive() {
        assertFalse(LogicNot.notEvenAndPositive(7));
    }

    @Test
    public void evenOrNotPositive() {
        assertTrue(LogicNot.evenOrNotPositive(-3));
    }
}