package ru.job4j.condition;

/**
 * 8. Hello World
 * Метод принимает число. Необходимо проверить у этого числа следующие условия и при этом вернуть следующие результаты:
 * 1. Если число делится на 3 без остатка - метод должен вернуть строку Hello;
 * 2. Если число делится на 5 без остатка - метод должен вернуть строку World;
 * 3. Если число делится на 3 и на 5 одновременно без остатка - метод должен вернуть строку Hello, World!!!
 * 4. Если не выполнится ни одно из выше указанных условий - метод должен вернуть строку Operation not support.
 * Для решения необходимо будет написать 2 булево выражения и там где это нужно объединить их правильным образом.
 */

public class HelloWorld {
    public static String checkNumber(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Hello, World!!!";
        } else if (number % 3 == 0) {
            return "Hello";
        } else if (number % 5 == 0) {
            return "World";
        }
        return "Operation not support";
    }
}