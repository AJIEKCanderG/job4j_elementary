package ru.job4j.codewars.strings;

/**
 * Разделить заданную строку s на слова с кол-вом букв partLength.
 * Длина строки всегда больше 0, в строке нет пробелов, строка всегда положительная.
 *
 * @author Ajiekcander
 */
public class StringSplitWords {
    public static String splitInParts(String s, int partLength) {
        return s.replaceAll("(.{" + partLength + "})(?!$)", "$1 ");
    }
}
