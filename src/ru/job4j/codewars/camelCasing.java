package ru.job4j.codewars;

/**
 * Complete the solution so that the function will break up camel casing, using a space between words.
 * Example
 * "camelCasing"  =>  "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""
 */

public class camelCasing {
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1").trim();
    }
}