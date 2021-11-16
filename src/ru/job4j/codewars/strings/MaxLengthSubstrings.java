package ru.job4j.codewars.strings;

import java.util.Arrays;

/**
 * Макксимальная длина последовательности гласных из списка aeiou.
 * The vowel substrings in the word codewarriors are o,e,a,io. The longest of these has a length of 2.
 * Given a lowercase string that has alphabetic characters only (both vowels and consonants) and no spaces,
 * return the length of the longest vowel substring.
 * Vowels are any of aeiou.
 *
 * @author Ajiekcander
 */
public class MaxLengthSubstrings {
    public static int solve(String s) {
        return Arrays.stream(s.split("[^aeiou]")).mapToInt(String::length).max().orElse(0);
    }
}
