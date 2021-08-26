package ru.job4j.codewars;

import java.util.Arrays;

/**
 * Write Number in Expanded Form
 * You will be given a number and you will need to return it as a string in Expanded Form.
 * For example:
 * Kata.expandedForm(12); # Should return "10 + 2"
 * Kata.expandedForm(42); # Should return "40 + 2"
 * Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
 */

public class NumberInExpandedForm {
    public static String expandedForm(int num) {
        String[] str = Integer.toString(num).split("");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (Integer.parseInt(str[i]) > 0) {
                result.append(str[i]);
                result.append("0".repeat(Math.max(0, str.length - 1 - i)));
                result.append(" + ");
            }
        }
        result.delete(result.length() - 3, result.length());
        return result.toString();
    }
}