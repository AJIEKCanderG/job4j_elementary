package ru.job4j.collection;

import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> set = new HashSet<>();
        for (String word : combination) {
            set.add(word);
            if (set.size() != 1) {
                return false;
            }
        }

    return true;
}
}
