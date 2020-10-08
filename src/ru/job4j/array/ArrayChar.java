package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                return false;
            }
        }
        return true;
    }
}