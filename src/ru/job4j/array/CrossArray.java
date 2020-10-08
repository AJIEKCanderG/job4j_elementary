package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (right[i] == left[j]) {
                    System.out.println(left[j]);
                }
            }
        }
    }
}

/*Заданы два числовых массива.
Нужно вывести на консоль числа, которые есть одновременно в первом и втором массиве.*/

/*foreach*/
/*
public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int k : right) {
            for (int j : left) {
                if (k == j) {
                    System.out.println(j);
                }
            }
        }
    }
}*/
