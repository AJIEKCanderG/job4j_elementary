package ru.job4j.codewars;


import static java.util.regex.Pattern.compile;
import static java.util.stream.Collectors.joining;

/**
 * You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:
 *
 * Your message is a string containing space separated words.
 * You need to encrypt each word in the message using the following rules:
 * The first letter must be converted to its ASCII code.
 * The second letter must be switched with the last letter
 * Keepin' it simple: There are no special characters in the input.
 *
 * "84kanh 121uo 80roti 102ro 97ll 121ruo 104ple", Encrypt.encryptThis("Thank you Piotr for all your help"));
 */

public class Encrypt {
    public static String encryptThis(String text) {
        return compile(" ").splitAsStream(text)
                .map(w -> w.isEmpty() ? w : (int) w.charAt(0) + (w.length() > 2 ? w.replaceFirst(".(.)(.*)(.)", "$3$2$1") : w.substring(1)))
                .collect(joining(" "));
    }
}
