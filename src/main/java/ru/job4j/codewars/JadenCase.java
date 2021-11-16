package ru.job4j.codewars;

/** Jaden Casing Strings
 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
 * Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 */

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null) {
            System.out.println("Must return null when the arg is null");
            return null;
        }
        if (phrase.isEmpty()) {
            System.out.println("Must return null when the arg is empty string");
            return null;
        }

        String[] arr = phrase.split(" ");
        if (!phrase.isEmpty() && !phrase.equals(null)) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i].toUpperCase().charAt(0) + arr[i].substring(1);
            }
        }
        return String.join(" ", arr);

    }
}