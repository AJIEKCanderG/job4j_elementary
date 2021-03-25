package ru.job4j.array;

import java.util.Arrays;

/**
 * Разность множеств - это операция при которой в результирующее множество попадают элементы из первого множества,
  но только если их нет во втором множестве.
 * Ваша задача реализовать эту операцию в коде. Множества заданы в виде массивов.
 * Например,
 * {1}, {2} => {1}
 * {1}, {1} => {}
 * {1, 2}, {2} => {1}
 * {1}, {} => {1}
 */

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] result = new int[left.length];
        int count = 0;
        if (right.length == 0 || left.length == 0) {
            result = left;
            return result;
        } else {
            for (int l : left) {
                for (int r : right) {
                    if (l == r) {
                        break;
                    }
                    result[count++] = l;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }
}