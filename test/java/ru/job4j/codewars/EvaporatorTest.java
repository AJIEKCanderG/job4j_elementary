package ru.job4j.codewars;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvaporatorTest {
    @Test
    public void testEvaporatorOne() {
        assertEquals(22, Evaporator.evaporator(10, 10, 10));
    }

    @Test
    public void testEvaporatorTwo() {
        assertEquals(29, Evaporator.evaporator(10, 10, 5));
    }
}