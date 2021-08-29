package ru.job4j.codewars;

class Persist {
    public static int persistence(long n) {
        return persistenceCount(n, 0);
    }

    public static int persistenceCount(long n, int currentCount) {
        long l = n;
        if (l < 10) {
            return currentCount;
        }

        long nextN = 1;
        while (l != 0) {
            nextN *= l % 10;
            l /= 10;
        }

        return persistenceCount(nextN, ++currentCount);
    }
}