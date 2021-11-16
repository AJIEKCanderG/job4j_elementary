package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int sum = 0;
            for (int index = a; index <= b; index += 2) {
                sum = sum + index;
            }
            return sum;
        }
    }