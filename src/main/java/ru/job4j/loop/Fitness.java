package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            month++;
            ivan *= 3;
            nik *= 2;
        }
        return month;
    }
}