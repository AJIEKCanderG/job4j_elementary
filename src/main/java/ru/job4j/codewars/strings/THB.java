package ru.job4j.codewars.strings;

/**
 * Оставить в строке только три буквы tbh, причем, как заглавные так и строчные.
 * Пример дана строка: "Remember to test for only the THB's, nothing else".
 * Вывод: "btttthTHBth"
 * @author Ajiekcander
 */
public class THB {
    static String testing(final String initial) {
        return initial == null ? "" : initial.replaceAll("[^TBHtbh]", "");
    }
}

