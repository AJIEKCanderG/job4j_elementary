package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountDigTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests nbDig");
        testing(CountDig.nbDig(10, 1), 4);
    }

    @Test
    public void test3() {
        System.out.println("Fixed Tests nbDig");
        testing(CountDig.nbDig(25, 1), 11);
    }

   @Test
    public void test4() {
        System.out.println("Fixed Tests nbDig");
        testing(CountDig.nbDig(10, 1), 4);
        testing(CountDig.nbDig(5750, 0), 4700);
        testing(CountDig.nbDig(11011, 2), 9481);
        testing(CountDig.nbDig(12224, 8), 7733);
        testing(CountDig.nbDig(11549, 1), 11905);
    }
}