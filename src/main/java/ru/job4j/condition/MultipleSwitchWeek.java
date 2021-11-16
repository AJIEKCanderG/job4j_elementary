package ru.job4j.condition;

public class MultipleSwitchWeek {
    public int numberOfDay(String name) {
        switch (name) {
            case "Monday":
            case "Понедельник":
                return 1;
            case "Вторник":
            case "Tuesday":
                return 2;
            case "Среда":
            case "Wednesday":
                return 3;
            case "Четверг":
            case "Thursday":
                return 4;
            case "Пятница":
            case "Friday":
                return 5;
            case "Суббота":
            case "Saturday":
                return 6;
            case "Воскресенье":
            case "Sunday":
                return 7;
            default:
                return -1;
        }
    }
}
