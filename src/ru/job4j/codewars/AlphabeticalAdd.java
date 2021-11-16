package ru.job4j.codewars;

/**
 * @author Ajiekcander
 */
public class AlphabeticalAdd {
    public static String addLetters(String... letters) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        if (letters.length == 0) {
            return "z";
        } else {
            int digit;
            int sum = 0;
            for (String letter : letters) {
                digit = alphabet.indexOf(letter) + 1;
                sum = sum + digit;
                if (sum > 26) {
                    sum = sum - 26;
                }
            }
            return Character.toString(alphabet.charAt(sum - 1));
        }
    }
}
