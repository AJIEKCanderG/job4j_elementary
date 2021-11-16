package ru.job4j.map;

import java.util.*;

/**
 * 7. Найти символ который используется в строке наибольшее количество раз.
 * Метод принимает строку, которая может содержать несколько пробелов, однако в ней отсутствуют знаки препинания.
 * Необходимо реализовать метод, который вернет символ в строке, который употребляется наибольшее количество раз.
 * Если окажется что таких символов несколько - необходимо вернуть первый из символов. Чтобы обеспечить сортировку
 * символов - собирайте исходную строку в TreeMap(), в которой ключ - это символ, значение - количество.
 * Перед тем как собирать строку ее нужно привести к нижнему регистру, удалить пробелы.
 *
 * Для того, чтобы собрать строку в отображение используйте методы computeIfPresent() и putIfAbsent() -
 * первый обновит значение частотности употребления символа, второй - вставит пару ключ(символ) значение(1) -
 * если такого символа в отображении еще нет.
 */

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        Map<Character, Integer> letters = new TreeMap<>();
        str = str.toLowerCase();
        str = str.replaceAll("\\s+", "");
        char[] chars = str.toCharArray();
        char rsl = ' ';
        int counter = 0;
        for (char letter : chars) {
            letters.computeIfPresent(letter, (key, value) -> value + 1);
            letters.putIfAbsent(letter, 0);
        }
        for (char key : letters.keySet()) {
            if (letters.get(key) > counter) {
                rsl = key;
                counter = letters.get(key);
            }
        }
        return rsl;
    }
}