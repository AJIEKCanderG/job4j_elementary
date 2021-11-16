package ru.job4j.calculator;

public class MathFunc {

    public static int func1(int x) {
        return x * 2 + 1;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(100);
        System.out.println(result1);
    }
}