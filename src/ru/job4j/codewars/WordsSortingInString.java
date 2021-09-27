package ru.job4j.codewars;

/**
 * Input: s = "is2 sentence4 This1 a3"
 * Output: "This is a sentence"
 * Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
 */

public class WordsSortingInString {
    public String sortSentence(String s) {
         String[] str = s.split(" ");
        String[] rsl = new String[str.length];
        StringBuilder sb = new StringBuilder();
        for (String s1 : str) {
            rsl[Integer.parseInt(s1.substring(s1.length() - 1)) - 1] = s1.substring(0, s1.length() - 1);
        }
        for (String s1 : rsl) {
            sb.append(s1).append(" ");
        }
        return sb.toString().trim();
    }
}

