package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder value = new StringBuilder(s);
        if (value.length() > 0 && value.length() < 4) {
            return s;
        }
        if (s.equals("")) {
            return "empty";
        }
        for (int i = 0; i < value.length() - 4; i++) {
            value.setCharAt(i, '#');
        }
        return value.toString();
    }
}