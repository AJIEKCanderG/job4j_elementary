package ru.job4j.codewars.strings;

import java.util.stream.Stream;

/**
 * Найти самую маленькую длину слова в строке.
 *
 * @author Ajiekcander
 */
public class ShortLengthWordInString {
    public static int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}
