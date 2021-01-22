package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int sumteamOne = 0;
        int sumteamTwo = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                sumteamOne += players[i];
            } else {
                sumteamTwo += players[i];
            }
        }
        if (sumteamOne > sumteamTwo) {
            return 1;
        }
        if (sumteamTwo > sumteamOne) {
            return 2;
        }
        return 0;
    }
}