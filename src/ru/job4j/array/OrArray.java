package ru.job4j.array;

import java.util.Arrays;

/**
 * Упражнения 1.1.6. Массивы 5.2. Объединение множеств
 * Объединение множеств это такая операция при которой в результирующее множество попадают элементы,
 * которые есть хотя бы в одном множестве.
 * Ваша задача реализовать эту операцию. Множества заданы в виде массива
 * Например,
 * {1}, {2} => {1, 2}
 * {1, 2}, {2} => {1, 2}
 * {1, 2}, {3} => {1, 2, 3}
 * {1}, {} => {1}
 */

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int count = 0;
        int[] result = new int[left.length + right.length];
        for (int k : left) {
            result[count++] = k;
        }
        for (int r : right) {
            boolean stop = false;
            for (int rsl : result) {
                if (r == rsl) {
                    stop = true;
                    break;
                }
            }
            if (!stop) {
                result[count++] = r;
            }
        }

        return Arrays.copyOf(result, count);
    }
}
