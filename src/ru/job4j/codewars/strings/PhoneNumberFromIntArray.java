package ru.job4j.codewars.strings;

import java.util.stream.IntStream;

/**  Получить формат записи мобильного телефона в виде строки определённого формата из числовго массива.
 * Дано: int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
 * Вывод: "(123) 456-7890"
 *
 * @author Ajiekcander
 */
public class PhoneNumberFromIntArray {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i);
        }
        String str = sb.toString().replaceAll("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
        System.out.println(str);
    }
}
