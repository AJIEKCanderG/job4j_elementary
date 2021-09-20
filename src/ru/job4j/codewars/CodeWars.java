package ru.job4j.codewars;

/**  All Star Code Challenge #18
 * This Kata is intended as a small challenge for my students
 * All Star Code Challenge #18
 * Create a function that accepts 2 string arguments and returns an integer of the count of occurrences the 2nd argument is found in the first one.
 * If no occurrences can be found, a count of 0 should be returned.
 * ("Hello", "o")  ==>  1
 * ("Hello", "l")  ==>  2
 * ("", "z")       ==>  0
 */

public class CodeWars {
    public static int strCount(String str, char letter) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }
        return count;
    }
}
// Best solution:  return (int)str.chars().filter(x -> x == letter).count();