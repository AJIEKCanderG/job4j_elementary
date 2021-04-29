package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 9.4. Промежуточные операции. Метод dropWhile().
 * Данный метод похож на метод takeWhile() только он позволяет пропустить элементы,
 * которые удовлетворяют условию. Этот метод также нужно использовать только для отсортированных
 * элементов, т.к. если для первого элемента не выполниться условие, то в стриме останутся все элементы.
 * Ваша задача оставить в списке только положительные элементы.
 * Порядок элементов исходного списка может быть произвольным
 */

public class DropWhileMethod {
    public static List<Integer> dropWhile(List<Integer> numbers) {
        return  numbers.stream().sorted().dropWhile(v -> v < 0).collect(Collectors.toList());
    }
}
