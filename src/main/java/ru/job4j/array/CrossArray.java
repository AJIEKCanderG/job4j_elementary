package ru.job4j.array;

/**
 * Заданы два числовых массива.
 * Нужно вывести на консоль числа, которые есть одновременно в первом и втором массиве.
*/

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int k : right) {
            for (int i : left) {
                if (k == i) {
                    System.out.println(i);
                }
            }
        }
    }
}
