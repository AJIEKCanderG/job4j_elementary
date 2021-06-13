package ru.job4j.collection;

import java.util.*;

/**
 *  2. Проверить две строчки на идентичность.
 * Даны две строки. Нужно проверить, что вторая строка получилась методом
 * перестановок символов в первой строке.
 */

public class FreezeStr {
    public static boolean eq(String left, String right) {
        String[] l = left.split("");
        String[] r = right.split("");
        Arrays.sort(l, Comparator.naturalOrder());
        Arrays.sort(r, Comparator.naturalOrder());
        return Arrays.equals(l, r);
    }
}