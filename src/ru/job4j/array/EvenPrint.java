package ru.job4j.array;

public class EvenPrint {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[array.length - i] + "");
            }
        }
    }
}
