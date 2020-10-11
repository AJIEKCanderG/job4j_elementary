package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder firstLetters = new StringBuilder();
        s = s.replaceAll("", "");
        for (String str : s.split(" ")) {
            firstLetters.append(str.charAt(0));
        }
        return firstLetters.toString();

    }
}