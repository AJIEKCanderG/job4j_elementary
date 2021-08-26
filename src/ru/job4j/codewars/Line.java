package ru.job4j.codewars;

/**
 * Line.Tickets(new int[] {25, 25, 50}) // => YES
 * Line.Tickets(new int[] {25, 100}) // => NO.
 * Vasya will not have enough money to give change to 100 dollars
 * Line.Tickets(new int[] {25, 25, 50, 50, 100}) // => NO.
 * Vasya will not have the right bills to give 75 dollars of change (you can't make two bills of 25 from one of 50)
 */

public class Line {
    public static String Tickets(int[] peopleInLine) {
       int mon25 = 0;
       int mon50 = 0;
       int mon100 = 0;
        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 25) {
                mon25++;
            } else if (peopleInLine[i] == 50 && mon25 > 0) {
                mon50++;
                mon25--;
            } else if (peopleInLine[i] == 100 && mon25 > 0 && mon50 > 0) {
                mon100++;
                mon50--;
                mon25--;
            } else if (peopleInLine[i] == 100 && mon25 > 2) {
            mon100++;
            mon25-=3;
        } else {
                return "NO";
            }
        }
       return "YES";
    }
}