package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 9.2. Промежуточные операции. Метод sorted() с компаратором.
 * Метод sorted() может принимать также Comparator.
 * Ваша задача отсортировать строки по убыванию.
 * Нужно использовать Comparator.reverseOrder() для получения компаратора
 */

public class SortedWithComparator {
    public static List<String> sorted(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}