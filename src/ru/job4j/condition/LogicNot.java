package ru.job4j.condition;

public class LogicNot {

    public boolean isEven(boolean num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num % 2 == 0);
    }

    public boolean notPositive(int num) {
       return !notPositive(num > 0);
    }

    public boolean notEvenAndPositive(int num) {
        return !notEvenAndPositive(num % 2 == 0 && 0);
    }

    public boolean evenOrNotPositive(int num) {
        return !evenOrNotPositive(num % 2 == 0 || 0);
    }

}