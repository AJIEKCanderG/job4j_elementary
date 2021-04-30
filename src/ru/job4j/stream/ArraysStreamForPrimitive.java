package ru.job4j.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 1.6. Создание стрима примитивов. Метод Arrays.stream()
 * Класс Stream работает с объектами. Для представления стрима примитивов в Java есть свои классы:
 * IntStream, LongStream, DoubleStream.
 * Их можно создавать как мы создавали раньше. Чаще всего приходиться создавать стрим из массива примитивов.
 * Для этого лучше всего подходит метод Arrays.stream(). Например
 * int[] data = {1, 2, 3};
 * IntStream steam = Arrays.stream(data);
 * Ваша задача создать стрим из переданного массива
 */

public class ArraysStreamForPrimitive {
    public static IntStream createStreamArrays(int[] data) {
        return Arrays.stream(data);
    }
}
