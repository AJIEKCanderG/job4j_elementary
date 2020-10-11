package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String str = Integer.toString(i);
        boolean count = true;
        for (int k = 0; k < str.length() / 2; k++) {
            for (int j = 1; j < str.length() / 2; j++) {
                if (str.charAt(k) != str.charAt(str.length() - j)) {
                    return false;
                }
            }
        }
        return count;
    }
}