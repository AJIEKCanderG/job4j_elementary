package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 5.6. Промежуточные операции. Метод boxed().
 * Если у нас стрим из примитивов, а мы хотим получим стрим из объектов оберток этого примитива,
 * то мы можем использовать метод boxed().
 * Например,
 * List<Long> nums = Arrays.stream(new long[] {1, 2, 3}).boxed().collect(Collectors.toList());
 * Ваша задача получить список Integer из массива int[]
 */

public class BoxedMethod {
    public static List<Integer> boxed(int[] data) {
        return Arrays.stream(data).boxed().collect(Collectors.toList());
    }
}
