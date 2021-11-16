package ru.job4j.lambda;

import java.util.function.Function;

/**
 * 2.1. Fuction. Возвести число в квадрат
 * Ниже приведен код. Вам нужно дописать лямбда выражение,
 * которое возводит переданное число в квадрат (для 2 = 4, для 3 = 9 и тд)
 */

public class FunctionPow {

    public static double calculate(double x) {
        return calculate(y -> y * y, x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
