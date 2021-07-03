package ru.job4j.comparator;

import java.util.Collections;
import java.util.List;

/**
 * 2.4. Способы сортировки. Сортировка List. Метод Collections.sort()
 * Существует альтернативный способ сортировки списка. В себе он использует list.sort(компаратор).
 * Например,
 * List<Integer> data = Arrays.asList(3, 2, 1);
 * Collections.sort(data); // получим список {1, 2, 3}, т.к. мы не передали компаратор,
 * поэтому сортировка идет в естественном порядке
 * Ваша задача отсортировать переданный список строк, используя метод Collections.sort(),
 * в восходящем порядке. Среди элементов нет null
 */

public class CollectionsSort {
    public static List<String> sort(List<String> data) {
       Collections.sort(data);
       return data;
    }
}
