package ru.job4j.loop;

//Даны два целых положительных числа a и b (b > a). Надо сложить каждое второе число в диапазоне [a, b] начиная с первого
//Например,
//[1, 2] => 1
//[1, 3] => 1 + 3 = 4
//[1, 5] => 1 + 3 + 5 = 9
//[0, 5] => 0 + 2 + 4 + 6 = 12  - опечатка диапазон должен быть [0,6]

public class SecondSum {
    public static int sum(int a, int b) {
        int sum = 0;
            for (int index = a; index <= b; index += 2) {
                sum = sum + index;
            }
            return sum;
        }
    }