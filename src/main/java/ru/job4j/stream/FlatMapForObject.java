package ru.job4j.stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 5.8. Промежуточные операции. Метод flatMap()
 * Метод flatMap() служит для получения стрима объектов, т.е. Stream.
 * Например,
 * List<List<Integer>> lists = List.of(List.of(1, 2), List.of(3, 4));
 * list.stream() получаем стрим из List<Integer>
 * .flatMap(subList -> subList.stream()) получаем стрим из элементов
 * .forEarch(el -> System.out.println(el))
 * Ваша задача элементы вложенных списков собрать в один список
 */

public class FlatMapForObject {
    public static List<Integer> flatMap(List<List<Integer>> lists) {
        return lists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
