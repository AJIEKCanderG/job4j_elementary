package ru.job4j.array;

import java.util.Arrays;

/**
 * Упражнения 1.1.6. Массивы  5.9. Аномалии
 * Назовем аномалиями диапазоны индексов, на которых значения массива меньше или равно down или больше или равно up.
 * Ваша задача найти все аномалии в массиве. Если в аномалии одно, число то нужно вернуть диапазон [i, i]
 * - где i индекс числа выходящего за границы.
 *
 * Например,
 * {5, 10, 15}, up = 16, down = 4 => аномалий нет
 * {5, 4, 15}, up = 16, down = 4 => {{1, 1}}
 * {5, 4, 3, 15}, up = 16, down = 4 => {{1, 2}}
 * {5, 10, 15, 1, 2}, up = 16, down = 4 => {{3, 4}}
 */

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= up || data[i] <= down) {
                int[] temp = new int[2];
                temp[0] = i;
                while (data[i] >= up || data[i] <= down) {
                    temp[1] = i;
                    i++;
                    if (i > data.length - 1) {
                        break;
                    }
                }
                result[count] = temp;
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }
}