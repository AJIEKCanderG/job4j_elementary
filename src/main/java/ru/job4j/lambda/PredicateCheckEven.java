package ru.job4j.lambda;

import java.util.function.Predicate;

/**
 * 1.2. Predicate. Проверить, что число четное
 * Ниже приведен код. Вам нужно дописать лямбда выражение, которое проверяет, что число четное
 */

public class PredicateCheckEven {

    public static boolean check(int num) {
        return check(x -> x % 2 == 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}