package ru.job4j.codewars.arrays;

/**
 * Пример разбора чисел по цифрамм.
 *
 * @author Ajiekcander
 */
public class DigitChars {
    public static void main(String[] args) {
        long number1 = 465;
        long number2 = 72;
        while (number1 > 0) {
            System.out.println("number1 " + number1 % 10);
            number1 /= 10;
        }

        while (number2 > 0) {
            System.out.println("number2 " + number2 % 10);
            number2 /= 10;
        }
    }
}
