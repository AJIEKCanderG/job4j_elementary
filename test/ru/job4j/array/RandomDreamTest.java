package ru.job4j.array;


import org.junit.Test;

import static org.junit.Assert.*;

public class RandomDreamTest {

    @Test
    public void testLengthFour() {
        String[] prizes = {"car", "ticket", "flat", "house"};
        assertEquals("car", RandomDream.random(prizes, 1));
        assertEquals("ticket", RandomDream.random(prizes, 2));
        assertEquals("flat", RandomDream.random(prizes, 3));
        assertEquals("house", RandomDream.random(prizes, 4));

        assertEquals("car", RandomDream.random(prizes, 5));
        assertEquals("ticket", RandomDream.random(prizes, 6));
        assertEquals("flat", RandomDream.random(prizes, 7));
        assertEquals("house", RandomDream.random(prizes, 8));

        assertEquals("car", RandomDream.random(prizes, 9));
        assertEquals("ticket", RandomDream.random(prizes, 10));
        assertEquals("flat", RandomDream.random(prizes, 11));
        assertEquals("house", RandomDream.random(prizes, 12));
    }

    @Test
    public void testLengthThree() {
        String[] prizes = {"car", "ticket", "flat"};
        assertEquals("car", RandomDream.random(prizes, 1));
        assertEquals("ticket", RandomDream.random(prizes, 2));
        assertEquals("flat", RandomDream.random(prizes, 3));

        assertEquals("car", RandomDream.random(prizes, 4));
        assertEquals("ticket", RandomDream.random(prizes, 5));
        assertEquals("flat", RandomDream.random(prizes, 6));

        assertEquals("car", RandomDream.random(prizes, 7));
        assertEquals("ticket", RandomDream.random(prizes, 8));
        assertEquals("flat", RandomDream.random(prizes, 9));
    }

    @Test
    public void testLengthTwo() {
        String[] prizes = {"car", "ticket"};
        assertEquals("car", RandomDream.random(prizes, 1));
        assertEquals("ticket", RandomDream.random(prizes, 2));

        assertEquals("car", RandomDream.random(prizes, 3));
        assertEquals("ticket", RandomDream.random(prizes, 4));

        assertEquals("car", RandomDream.random(prizes, 5));
        assertEquals("ticket", RandomDream.random(prizes, 6));

    }

}