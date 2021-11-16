package ru.job4j.comparator;

import java.util.Comparator;
import java.util.List;

/**
 * 2.3. Способы сортировки. Сортировка List
 * Класс List имеет метод sort(), который позволяет отсортировать элементы списка.
 * Например:
 * List<Integer> data = Arrays.asList(3, 2, 1);
 * data.sort(Comparator.naturalOrder()); Получим список из элементов 1, 2, 3
 * Ваша задача отсортировать список строк по убыванию. В списке могут быть null элементы,
 * они должны оказаться в конце после сортировки.
 */

public class ListSort {
    public static List<String> sort(List<String> data) {
        data.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        return data;
    }
}
