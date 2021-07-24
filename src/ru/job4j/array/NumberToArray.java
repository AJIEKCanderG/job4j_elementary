package ru.job4j.array;

/** 1.1.6. Массивы 4.5. Массив цифр
 * Дано число int. Нужно получить массив из его цифр в обратном порядке.
 * Например
 * 12345 => {5, 4, 3, 2, 1}
 */

public class NumberToArray {
    public static int[] resolve(int number) {
        String i = Integer.toString(number);
        String[] ch = i.split("");
        int[] rsl = new int[i.length()];
        int r = 0;
        for (int k = (ch.length - 1); k >= 0; k--) {
            rsl[r++] = Integer.parseInt(ch[k]);
        }
        return rsl;
    }
}
