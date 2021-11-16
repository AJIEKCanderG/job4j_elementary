package ru.job4j.loop;

/**
 * 7. Найти степень числа
 * Дано целое число a и целое число degree (> 0).
 * Найти a в степени degree: a^degree = a·a· . . . ·a (числа a перемножаются deg
 */

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum = sum * a;
        }
        return sum;
    }
}