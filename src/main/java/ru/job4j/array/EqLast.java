package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        return right[right.length - 1] == left[left.length - 1];
    }
}