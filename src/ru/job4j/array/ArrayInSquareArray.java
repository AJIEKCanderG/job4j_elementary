package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int n = (int) Math.ceil(Math.sqrt(array.length));
        int[][] result = new int[n][n];
        int k = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (k < array.length) {
                        result[i][j] = array[k++];
                    }
            }
        }
        return result;
    }
}
