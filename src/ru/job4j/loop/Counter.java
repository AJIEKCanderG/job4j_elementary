package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
    int sum = 0;
    for (int x = start; x <= finish; x++) {
        sum = sum + x;
    }
    return sum;
}

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int x = start; x <= finish; x++) {
            if (x % 2 == 0) {
                sum = sum + x;
            }
        }
        return sum;
    }

    public static int sumByNotEven(int start, int finish) {
        int sum = 0;
        for (int x = start; x <= finish; x++) {
            if (x % 2 != 0) {
                sum = sum + x;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(2, 7));
        System.out.println(sum(7, 8));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));

        System.out.println(sumByNotEven(0, 10));
        System.out.println(sumByNotEven(3, 8));
        System.out.println(sumByNotEven(1, 1));
    }
}