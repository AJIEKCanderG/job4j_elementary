package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        return ((first > second ? first : second) > third ? (first > second ? first : second) : third);
    }
}