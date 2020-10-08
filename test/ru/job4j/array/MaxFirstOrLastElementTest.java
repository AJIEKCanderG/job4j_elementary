package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxFirstOrLastElementTest {

    @Test
    public void getMaxValueFirstElement() {
        int[] in = {5, 4, 3, 2, 1};
        int expected = 5;
        int rsl = MaxFirstOrLastElement.getMaxValue(in);
        assertThat(rsl, is(expected));
    }

    @Test
    public void getMaxValueLastElement() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 5;
        int rsl = MaxFirstOrLastElement.getMaxValue(in);
        assertThat(rsl, is(expected));
    }

    @Test
    public void getMaxValueLastElement1() {
        int[] in = {1, 2, 3, 4, 8};
        int expected = 8;
        int rsl = MaxFirstOrLastElement.getMaxValue(in);
        assertThat(rsl, is(expected));
    }

    @Test
    public void getMaxValueLastElement2() {
        int[] in = {5, 2, 7, 8, 9};
        int expected = 9;
        int rsl = MaxFirstOrLastElement.getMaxValue(in);
        assertThat(rsl, is(expected));
    }
}