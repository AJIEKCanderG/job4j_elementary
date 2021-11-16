package ru.job4j.lambda;

import java.util.function.Consumer;

/**
 * 4.1. Method reference. Обращение через класс и объект
 * Method reference (ссылка на метод) - это языковая конструкция,
 * которая представляет собой упрощенную запись лямда выражений.
 * Когда можно применить ссылки на методы? Основное условие - это совпадение сигнатур методов
 * в функциональном интерфейсе и вызываемом методе. Сигнатура - это входные параметры.
 * Например, есть интерфейс Consumer. Сигнатура метод apply() выглядит так void (T).
 * Т.е. метод должен что-то принимать и ничего не возвращать. С ним можно например применять метод System.out.println()
 * Consumer<String> lamba = (value) -> System.out.prinln(value); запись через лямбда
 * Consumer<String> mRerefence = System.out::println; запись через ссылки на метод
 * Еще пример
 * Function<Integer, Integer> abs = Math::abs; можно применить потому что сигнатура метода abs(): int (int)
 * Когда мы используем ссылки на методы, мы обращаемся к методам. Как вы знаете методы бывают статические
 * и не статические. К статическим методам можно получить доступ через имя класса, как например, в последнем примере.
 * К не статическим методам можно получить доступ как через объект класса, например, this::print, или
 * переменная::print, так и через класс, например String::compareTo
 * Ваша задача написать два consumer первый обращается к нестатическому методу, а второй к статическому
 */

public class MethodReference {

    public void applyByInstance() {
        Consumer<String> consumer = this::consumerByInstance;
        consumer.accept("Hello");
    }

    public static void applyByClass() {
        Consumer<String> consumer = MethodReference::consumerByClass;
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }

}
