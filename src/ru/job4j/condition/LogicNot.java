package ru.job4j.condition;

public class LogicNot {

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        boolean notEven = num % 2 == 0;
            return !notEven(num);
        }

    public boolean notPositive(int num) {
           boolean notPositive = num > 0;
        return !notPositive(num);
    }

    public boolean notEvenAndPositive(int num) {
        boolean notEvenAndPositive = num % 2 == 0 && num > 0;
        return !notEvenAndPositive(num);
    }

    public boolean evenOrNotPositive(int num) {
        boolean evenOrNotPositive = num % 2 == 0 || num > 0;
        return !evenOrNotPositive(num);
    }

}