package ru.job4j.stream;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArraysStreamMethodTest {
    @Test
    public void test() {
        Integer[] data = {1, 2, 3};
        assertEquals(3, ArraysStreamMethod.createStream(data).count());
    }

    @Test
    public void test2() {
        Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(8, ArraysStreamMethod.createStream(data).count());
    }
}