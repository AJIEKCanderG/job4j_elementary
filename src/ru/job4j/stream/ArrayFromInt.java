package ru.job4j.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Создание упорядоченного массива с шагом 1 из числа (и в обратном порядке) или из массива.
 *
 */

public class ArrayFromInt {

    public static void main(String[] args) {

        int m = 10;
        int[] array = IntStream.rangeClosed(1, m).toArray();
        int[] arrayReverse = IntStream.range(-m, 0).map(Math::abs).toArray();
        int[] arrayReverse2 = IntStream.iterate(m, i -> --i).limit(m).toArray();

        int[] numbers =  new int[]{-1, 4};
        int[] arr =  IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayReverse));
        System.out.println(Arrays.toString(arrayReverse2));
        System.out.println(Arrays.toString(arr));
    }
}
