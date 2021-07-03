package ru.job4j.comparator;

import java.util.Comparator;

/**
 * 1.4. Получение компаратора. Метод nullsLast()
 * Если мы хотим, что бы null элементы скопились в конце мы можем использовать компаратор,
 * созданный с помощью метода Comparator.nullsLast(). Он аналогичен nullsFirst() за исключением,
 * что null элементы при его применении скопятся в конце.
 * Например:
 * Comparator<Integer> comparator = Comparator.nullsLast(Comparator.naturalOrder());
 * Сначала создастся компаратор, у которого будет использован метод compare(), а только потом компаратор,
 * который учитывает null
 * Ваша задача получить null-frendly компаратор для строки.
 */


public class NullLastMethod {
    public static Comparator<String> nullLast() {
        return Comparator.nullsLast(Comparator.naturalOrder());
    }
}