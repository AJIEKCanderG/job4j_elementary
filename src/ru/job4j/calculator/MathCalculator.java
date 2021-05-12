package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivide(double first, double second) {
        return difference(first, second)
                + divide(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + difference(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат сумма: " + MathFunction.sum(11, 10));
        System.out.println("Результат умножение: " + MathFunction.multiply(11, 10));
        System.out.println("Результат разность: " + MathFunction.difference(11, 10));
        System.out.println("Результат деление: " + MathFunction.divide(11, 10));
        System.out.println("Результат сумма + умножение: " + sumAndMultiply(11, 10));
        System.out.println("Результат деление + разность: " + differenceAndDivide(11, 10));
        System.out.println("Результат сумма + умножение + деление + разность: " + sumAllOperations(11, 10));
    }
}
