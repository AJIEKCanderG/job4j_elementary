package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
         int rsl;
         int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i < 5 && hours[i] <= 8) {
                rsl = hours[i] * 10;
                sum += rsl;
            }
            if (i < 5 && hours[i] > 8) {
                rsl = 80 + (hours[i] - 8) * 15;
                sum += rsl;
            }
            if (i >= 5 && hours[i] <= 8) {
                rsl = hours[i] * 20;
                sum += rsl;
            }
            if (i >= 5 && hours[i] > 8) {
                rsl = 160 + (hours[i] - 8) * 30;
                sum += rsl;
            }
        }
        return sum;
    }
}