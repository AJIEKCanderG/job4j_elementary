package ru.job4j.codewars;

/**  Watermelon
 * Given an integral number of watermelons w (1 ≤ w ≤ 100; 1 ≤ w in Haskell),
 * check whether Pete and Billy can divide the melons so that each of them gets an even amount.
 * Examples
 * divide(2) == false  2 = 1 + 1
 * divide(3) == false   3 = 1 + 2
 * divide(4) == true    4 = 2 + 2
 * divide(5) == false   5 = 2 + 3
 * divide(6) == true    6 = 2 + 4
 */

public class Kata {
    public static boolean divide(int weight) {
        return weight > 3 && weight % 2 == 0;
    }
}
