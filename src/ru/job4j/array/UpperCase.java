package ru.job4j.array;

/**
 * Дана строка, записанная в виде массив символов.
 * Ваша задача создать новую строку, в которой будут в символы исходной в верхнем регистре.
 * Если символ не является буквой, например цифры или -, то просто записать в результат.
 */

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] rsl = new char[string.length];
        for (char i = 0; i < string.length; i++) {
                rsl[i] = Character.toUpperCase(string[i]);
        }
        return rsl;
    }
}