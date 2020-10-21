package ru.job4j.array;

public class OddPrint {
    public static void print(int[] array) {
        for (int j : array) {
            if (j % 2 != 0) {
                System.out.println(j + "");
            }
        }
    }
}