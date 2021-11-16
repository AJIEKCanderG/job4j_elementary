package ru.job4j.codewars;

/**
 * Complete the solution so that the function will break up camel casing, using a space between words.
 * Example
 * "camelCasing"  =>  "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""
 */

public class CamelCasing {
    public static String cameCase(String input) {
        return input.replaceAll("([A-Z])", " $1").trim();
    }
}