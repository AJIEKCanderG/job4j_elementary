package ru.job4j.array;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int sumTeamOne = 0;
        int sumTeamTwo = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                sumTeamOne += players[i];
            } else {
                sumTeamTwo += players[i];
            }
        }
        if (sumTeamOne > sumTeamTwo) {
            return 1;
        }
        if (sumTeamTwo > sumTeamOne) {
            return 2;
        }
        return 0;
    }
}