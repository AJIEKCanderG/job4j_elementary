package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
         int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i < 5 && hours[i] <= 8) {
                sum += hours[i] * 10;
            } else if (i < 5 && hours[i] > 8) {
                sum += (hours[i] - (hours[i] - 8)) * 10 + (hours[i] - 8) * 15;
            } else if (i >= 5 && hours[i] <= 8) {
                sum += hours[i] * 20;
            } else if (i >= 5 && hours[i] > 8) {
                sum += (hours[i] - (hours[i] - 8)) * 20 + (hours[i] - 8) * 30;
            }
        }
        return sum;
    }
}