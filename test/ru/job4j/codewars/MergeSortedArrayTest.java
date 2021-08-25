package ru.job4j.codewars;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MergeSortedArrayTest {
    @Test
    public void whenBothEmpty() {
        int[] expect = {1, 2, 3, 4, 5, 6};
        int[] result = MergeSortedArray.merge(
                new int[] {4, 5, 6, 0, 0, 0}, 3, new int[] {1, 2, 3}, 3
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenReorder() {
        int[] expect = {1, 2, 2, 3, 5, 6};
        int[] result = MergeSortedArray.merge(
                new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscOrder() {
        int[] expect = {1, 2, 3, 4, 5, 6};
        int[] result = MergeSortedArray.merge(
                new int[] {4, 5, 6, 0, 0, 0}, 3, new int[] {1, 2, 3}, 3
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAsNZero() {
        int[] expect = {1};
        int[] result = MergeSortedArray.merge(
                new int[] {1}, 1, new int[] {}, 0
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAsMZero() {
        int[] expect = {1};
        int[] result = MergeSortedArray.merge(
                new int[] {0}, 0, new int[] {1}, 1
        );
        assertThat(result, is(expect));
    }


}