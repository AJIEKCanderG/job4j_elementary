package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int index = right.length - 1; index > 0; index--) {
            for (int index1 = left.length - 1; index1 > 0; index1--) {
                if (right[index] == left[index1]) {
                    return true;
                }
                    return false;
                }
            }
        return false;
    }
    }