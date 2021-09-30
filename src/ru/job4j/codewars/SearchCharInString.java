package ru.job4j.codewars;

/**
 * Пример поиска наиболее часто встречающегося символа и вывода на печать этого символа и его кол-ва в строке.
 */

public class SearchCharInString {
    public static void main(String[] args) {
        String s = "abracadabra";
        char c = ' ';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int inside = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    inside++;
                }
                if (inside > count) {
                    c = s.charAt(i);
                    count = inside;
                }

            }
        }
        System.out.println(c);
        System.out.println(count);
    }
}
