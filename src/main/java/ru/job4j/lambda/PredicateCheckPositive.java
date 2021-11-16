package ru.job4j.lambda;

import java.util.function.Predicate;

/**
 * 1.1. Predicate. Проверить, что число положительное
 * Ниже приведен код. Вам нужно дописать лямбда выражение, которое проверяет, что число положительное
 */

public class PredicateCheckPositive {

    public static boolean check(int num) {
        return check(n -> n > 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }

}
