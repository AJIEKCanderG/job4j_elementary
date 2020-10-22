package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
    int[] array = new int[data.length];
    int index = 0;
    for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data.length; j++) {
            int sum = i + j;
            boolean right = sum == data.length - 1;
            if (right) {
                array[index] = data[i][j];
                index++;
            }
        }
    }
    return array;
}
}
