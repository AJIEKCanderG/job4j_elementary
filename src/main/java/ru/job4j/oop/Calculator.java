package ru.job4j.oop;

/**
 * @author Ajiekcander
 */
public class Calculator {
    private static final int X = 5;

    public static int sum(int y) {
        return X + y;
    }

    public int multiply(int a) {
        return X * a;
    }

    public static int minus(int b) {
        return b - X;
    }

    public int divide(int c) {
        return c / X;
    }

    public int sumAllOperation(int d) {
        return sum(d) + multiply(d) + minus(d) + divide(d);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rslSum = sum(5);
        System.out.println("Result sum: " + rslSum);
        int rslMultiply = calculator.multiply(5);
        System.out.println("Result multiply: " + rslMultiply);
        int rslMinus = minus(10);
        System.out.println("Result minus: " + rslMinus);
        int rslDivide = calculator.divide(35);
        System.out.println("Result divide: " + rslDivide);
        int rslSumAllOperation = calculator.sumAllOperation(10);
        System.out.println("Result sumAllOperation: " + rslSumAllOperation);
    }
}
