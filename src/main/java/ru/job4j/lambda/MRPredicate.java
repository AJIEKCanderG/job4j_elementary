package ru.job4j.lambda;

import java.util.function.Predicate;

/**
 * 4.3. Method reference и Predicate
 * Ваша задача создать предикат Predicate, который проверяет, что строка пустая, для этого нужно использовать метод isEmpty() в классе String
 */

public class MRPredicate {
    public static Predicate<String> predicate() {
        return String::isEmpty;
    }
}

