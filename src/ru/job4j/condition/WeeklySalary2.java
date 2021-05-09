package ru.job4j.condition;

public class WeeklySalary2 {
    public static int calculate(int[] hours) {
    int salary = 0;
    for (int i = 0; i < hours.length; i++) {
        if (i < 5 && hours[i] < 9) {
            salary = salary + hours[i] * 10;
        } else if (i < 5 && hours[i] > 8) {
            salary = salary + 80 + (hours[i] - 8) * 15;
        }
        if (i > 4 && hours[i] < 9) {
            salary = salary + hours[i] * 20;
        }
        if (i > 4 && hours[i] > 8) {
            salary = salary + 160 + (hours[i] - 8) * 30;
        }
    }
    return salary;
}
}