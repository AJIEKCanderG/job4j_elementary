package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 10.1. Удалить из числового списка все элементы, кратные 4.
 * Дан исходный список. Получить список без элементов, кратных 4, из исходного списка.
 * Например, {1, 2, 3, 4, 5, 8} -> {1, 2, 3, 5}
 */

public class Task1 {
    public static List<Integer> retain(List<Integer> list) {
        return list.stream()
                .filter(u -> u % 4 != 0)
                .collect(Collectors.toList());
    }
}