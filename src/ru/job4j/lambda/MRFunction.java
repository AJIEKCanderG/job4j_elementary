package ru.job4j.lambda;

import java.util.function.Function;

/**
 * 4.2. Method reference и Function
 * Ваша задача создать Function через ссылку на метод. В качестве функции нужно использовать Math.sqrt()
 */

public class MRFunction {
    public static Function<Double, Double> apply() {
        return Math::abs;
    }
}
