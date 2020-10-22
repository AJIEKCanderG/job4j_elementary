package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class RightDiagonalTest {

    @Test
    public void test() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {3, 5, 7};
        assertArrayEquals(expected, RightDiagonal.diagonal(data));
    }

    @Test
    public void test3() {
        int[][] data = {
                {1, 5, 9},
                {4, 11, 2},
                {5, 6, 3}
        };
        int[] expected = {9, 11, 5};
        assertArrayEquals(expected, RightDiagonal.diagonal(data));
    }

}