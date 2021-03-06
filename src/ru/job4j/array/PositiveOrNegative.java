package ru.job4j.array;

/**
 * Упражнения 1.1.6. Массивы 6.1. Четное или нечетное количество отрицательных значений
 * Метод принимает массив целочисленных значений. При этом массив может содержать как положительные значения,
 * так и отрицательные, но не может содержать 0.
 * Необходимо реализовать метод таким образом, чтобы он вернул булево значение следующим образом:
 * 1. true - количество отрицательных значений в массиве нечетное число;
 * 2. false - количество положительных значений в массиве четное число.
 */

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int plus = 0;
        int minus = 0;
        for (int datum : data) {
            if (datum > 0) {
                plus++;
            } else {
                minus++;
            }
        }
        return minus % 2 != 0 && plus % 2 != 0;
    }
}
