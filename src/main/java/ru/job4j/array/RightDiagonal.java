package ru.job4j.array;

/**
 * 26. Получить правую диагональ квадратного массива
 * Вам дана квадратная матрица. Нужно получить правую диагональ.
 * Правая диагональ это диагональ матрицы, которая идет справа налево.
 * Например, для {{1, 2}, {3, 4}} это будет {2, 3}, левой в этом случае будет {1, 4}
 */

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] array = new int[data.length];
        int index = 0;
        int temp = data.length - 1;
        for (int[] datum : data) {
            array[index++] = datum[temp];
            temp--;
        }
        return array;
    }
}


/*
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
*/

