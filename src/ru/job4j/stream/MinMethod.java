package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;

/**
 * Упражнения
 * 1.4.2. Stream API
 * 0.5. Понятие редукции. Метод min(). Поиск кратчайшей строки
 * Как вы наверное уже догадались поиск минимального элемента представляет собой также редукцию.
 * Этот метод принимает Comparator и возвращает Optional. Если список пуст вернется пустой Optional.
 * Пример,
 * Integer min = List.of(3, 2, 1).stream().min((n1, n2) -> Integer.compare(n1, n2)).get(); // вернет 1
 * Ваша задача найти строку с минимальной длиной. Размер списка больше 0
 */

public class MinMethod {
    public static String min(List<String> list) {
        return list.stream().min(Comparator.comparingInt(String::length)).get();
    }
}