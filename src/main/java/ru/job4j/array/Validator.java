package ru.job4j.array;

/**
 * Метод принимает массив целочисленных значений, а также число value, которое мы будем искать в этом массиве.
 * Метод должен посчитать количество одинаковых элементов которые совпадают с value, и если окажется что это
 * число больше или равно половине длины входного массива - массив считается невалидным и метод должен вернуть false.
 */

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int count = 0;
        for (int datum : data) {
            if (datum == value) {
                count += datum;
            }
        }
        return count < data.length / 2;
    }
}
