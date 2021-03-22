package ru.job4j.array;
/**
 * Метод принимает массив целочисленных значений.
 * Необходимо перебрать этот массив выбрать из него только нечетные числа и вернуть новый массив, в котором будут только нечетные числа.
 * При этом длина нового массива должна совпадать с количеством нечетных значений в исходном массиве.
 * В этой задаче будет необходимо использовать оператор continue.*/

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int count = 0;
        for (int j : data) {
            if (j % 2 == 0) {
                continue;
            }
            count++;

        }
        int m = 0;
        int[] data1 = new int[count];
        for (int datum : data) {
            if (datum % 2 != 0) {
                data1[m] = datum;
                m++;
            }
        }
        return data1;
    }
}