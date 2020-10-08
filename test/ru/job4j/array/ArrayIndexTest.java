package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayIndexTest {

    @Test
    public void getFirstElement() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 1;
        int result = ArrayIndex.getFirstElement(in);
        assertThat(result, is(expected));
    }

    @Test
    public void getLastElement() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 5;
        int result = ArrayIndex.getLastElement(in);
        assertThat(result, is(expected));
    }

    @Test
    public void getLastElement1() {
        int[] in = {0, 1, 2, 3, 4};
        int expected = 4;
        int result = ArrayIndex.getLastElement(in);
        assertThat(result, is(expected));
    }
}