package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeRowsTest {

    @Test
    public void test() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] out = MergeRows.merge(input);
        assertArrayEquals(expected, out);
    }

    @Test
    public void test2() {
        int[][] input = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        int[] expected = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] out = MergeRows.merge(input);
        assertArrayEquals(expected, out);
    }

    @Test
    public void test3() {
        int[][] input = {
                {16, 15, 14, 13},
                {12, 11, 10, 9},
                {8, 7, 6, 5},
                {4, 3, 2, 1}
        };
        int[] expected = {16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] out = MergeRows.merge(input);
        assertArrayEquals(expected, out);
    }
}