package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] array = new int[data.length * data.length];
        int index = 0;
        for (int[] datum : data) {
            for (int i : datum) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }
}
