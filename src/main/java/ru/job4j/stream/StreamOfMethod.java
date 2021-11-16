package ru.job4j.stream;

import java.util.stream.Stream;

/**
 * 1.4.2. Stream API
 * 1.2. Создание стрима из последовательности. Метод Stream.of()
 * Иногда у нас есть последовательность и мы хотим создать стрим из этой последовательности. Для этого мы можем использовать метод Stream.of(T...)
 * Например,
 * Stream.of(1, 2, 3)
 * Ниже приведен код, создайте стрим из символов 'a', 'b', 'c'
 */

public class StreamOfMethod {
    public static Stream<Character> createStream() {
        return Stream.of('a', 'b', 'c');
    }
}
