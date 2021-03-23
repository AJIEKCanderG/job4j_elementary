package ru.job4j.array;

/**
 * Дан массив призов и положительное число, которое сгенерировано случайно. Ваша задача получить приз
 * Например,
 * {"автомобиль", "квартира", "билет"} и число = 1 => "автомобиль"
 * {"автомобиль", "квартира", "билет"} и число = 2 => "квартира"
 * {"автомобиль", "квартира", "билет"} и число = 4 => "автомобиль"
 * {"автомобиль", "квартира", "билет"} и число = 99 => "билет"
 * "car", "ticket", "flat", "house"   num = 2  prizes = "ticket"
 */

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String result = null;
        for (int i = 0; i < num + prizes.length; i++) {
            if (i + 1 == num) {
                result = prizes[i % prizes.length];
            }
        }
        return result;
    }
}
