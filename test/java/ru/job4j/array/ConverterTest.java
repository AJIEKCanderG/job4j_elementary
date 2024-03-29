package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConverterTest {

    @Test
    public void convertInSquareArray1Without0() {
        int[][] array = {{1}, {2, 3}, {4}};
        int[][] rsl = Converter.convertInSquareArray(array);
        int[][] expected = {{1, 2}, {3, 4}};
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertInSquareArray1With0() {
        int[][] array = {{1}, {2, 3}, {4}, {5, 6}, {7, 8, 9, 10}};
        int[][] rsl = Converter.convertInSquareArray(array);
        int[][] expected = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 0, 0}, {0, 0, 0, 0}};
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertInSquareArray() {
        int[][] array = {{1}, {2, 3, 4}, {5, 6}, {7, 8, 9, 10, 11}};
        int[][] rsl = Converter.convertInSquareArray(array);
        int[][] expected = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 0}, {0, 0, 0, 0}};
        assertThat(rsl, is(expected));
    }

    @Test
    public void convertInSquareArrayWithout0() {
        int[][] array = {{1}, {2, 3}, {4, 5, 6}, {7, 8}, {9}};
        int[][] rsl = Converter.convertInSquareArray(array);
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertThat(rsl, is(expected));
    }
}