package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int x = n / d;
        while (d > 0) {
            return n - x * d;
        }
        return n - x * d;
    }
}

