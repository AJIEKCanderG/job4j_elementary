package ru.job4j.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 1.4.2. Stream API 1.3. Создание стрима из массива. Метод Arrays.stream()
 * Массивы это часто используемая конструкция, поэтому важно знать как создать стрим из массива.
 * Для создания стрима служит метод Arrays.stream()
 * Например,
 * Integer[] data = {1, 2, 3};
 * Stream<Integer> stream = Arrays.stream(data);
 * Ниже приведен код, вам нужно создать стрим из переданного массива
 */

public class ArraysStreamMethod {
    public static Stream<Integer> createStream(Integer[] data) {
        return Arrays.stream(data);
    }
}
