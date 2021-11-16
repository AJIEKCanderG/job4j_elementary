package ru.job4j.codewars;

/**
 * altERnaTIng cAsE <=> ALTerNAtiNG CaSe
 */

public class StringUtils {
    public static String toAlternativeString(String string) {
        StringBuilder result = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }
}