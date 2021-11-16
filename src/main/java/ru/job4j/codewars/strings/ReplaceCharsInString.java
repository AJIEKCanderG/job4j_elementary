package ru.job4j.codewars.strings;

/**
 * Заменить все символы в строке, кромме последних четырёх.
 *
 * @author Ajiekcander
 */
public class ReplaceCharsInString {
    public static String maskify(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
}