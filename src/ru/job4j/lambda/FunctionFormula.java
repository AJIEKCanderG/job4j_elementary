package ru.job4j.lambda;

import java.util.function.Function;

/**
 * 2.3. Fuction. Рассчитать значение по формуле
 * Ниже приведен код. Вам нужно дописать лямбда выражение, которое будет подставлять переданное число в формулу
 * num * num + 2 * num + 1
 */

public class FunctionFormula {

    public static double calculate(double x) {
        return calculate(num -> num * num + 2 * num + 1, x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
