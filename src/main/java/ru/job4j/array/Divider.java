package ru.job4j.array;

/**
 * Упражнения 1.1.6. Массивы 6.4. Кратность числа
 * Метод принимает два параметра:
 * * 1. Целочисленное значение num;
 * 2. Массив целочисленных значений ints.
 * Необходимо проверить являются ли все элементы массива ints, делителями числа num, если являются - то метод должен вернуть true.
 */

public class Divider {
    public static boolean check(int num, int[] ints) {
        for (int n : ints) {
            if (num % n != 0) {
                return false;
            }
        }
        return true;
    }
}
