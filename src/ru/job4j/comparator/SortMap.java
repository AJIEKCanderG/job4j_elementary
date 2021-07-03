package ru.job4j.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 2.7. Способы сортировки. Сортировка Map.
 * Методов сортировки Map нет. Мы можем только получить отсортированную мапу через создание новой из исходной.
 * При данном подходе упорядочивание происходит аналогично, как через Set.
 * Например:
 * Map<Integer, Integer> map = new TreeMap<>(Map.of(2, 4, 1, 1)); //
 * получим пары (1, 1), (2, 4) произошло упорядочивание в естественном порядке
 * Ваша задача получить отсортированную мапу из исходной. Сортировка должна быть в обратном порядке.
 */

public class SortMap {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
         Map<Integer, String> rsl = new TreeMap<>(Comparator.reverseOrder());
         rsl.putAll(map);
         return rsl;
    }
}
