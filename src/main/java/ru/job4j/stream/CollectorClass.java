package ru.job4j.stream;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * 0.1. Понятие редукции. Произвольный Collector для сборки в коллекцию
 * Говоря простыми словами редукция (от англ. reduction - уменьшение) - это сведения, набора элементов к чему-то одному.
 * Например, использование коллекторов предполагает сведение результата чаще всего к коллекции.
 * Но так же есть и другие способы редукции, их мы разберем позже.
 * Рассмотрим пример, создания произвольного коллектора. Собирать будем в связный список. Добавление будет идти всегда в начало
 * Результат
 * Ваша задача прописать создание коллекции и добавление элемента. Коллекцией будет LinkedList, для добавление нужно использовать метод add()
 */

public class CollectorClass {

    public static List<Integer> collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new;
        BiConsumer<List<Integer>, Integer> biConsumer = List::add;
        BinaryOperator<List<Integer>> operator = (left, right) -> {
            left.addAll(right);
            return left;
        };
        return list.stream().collect(Collector.of(supplier, biConsumer, operator));
    }
}
