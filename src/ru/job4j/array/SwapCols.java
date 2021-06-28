package ru.job4j.array;

/**
 * 24. Переставить два столбца в матрице
 * Ваша задача переставить два столбца в квадратной матрице.
 * src, dest это индексы столбцов
 */

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        int tmp;
        for (int i = 0; i < data.length; i++) {
            tmp = data[i][dst];
            data[i][dst] = data[i][src];
            data[i][src] = tmp;
        }
    }
}