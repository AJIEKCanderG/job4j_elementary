package ru.job4j.array;

public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        int first = array[0];
        int end = array[array.length - 1];
        return Math.max(first, end);
    }
}