package ru.job4j.array;

/**
 * Дана строка, записанная в виде массив символов.
 * Ваша задача создать новую строку, в которой будут в символы исходной в верхнем регистре.
 * Если символ не является буквой, например цифры или -, то просто записать в результат.
 */

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] str = new char[string.length];
        for(int i =0; i < string.length; i++) {
            if(Character.isLetter(string[i])) {
                str[i] = Character.toUpperCase(string[i]);
            } else {
                str[i] = string[i];
            }
        }

        return str;
    }
}
