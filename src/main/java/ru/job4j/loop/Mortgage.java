package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            double amountPercent = amount * (percent * 0.01);
            amount += amountPercent;
            amount -= salary;
            year++;
    }
        return year;
    }
}
