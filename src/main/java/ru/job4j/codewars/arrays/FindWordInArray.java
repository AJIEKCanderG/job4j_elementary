package ru.job4j.codewars.arrays;

import java.util.Arrays;

/**
 * Найти слово в массиве.
 * Массив Object (String + int + null)
 * Вернуть индекс этого слова в массиве.
 *
 * @author Ajiekcander
 */
public class FindWordInArray {
    public static void main(String[] args) {
        String rsl = "";
        Object[] haystack = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        for (int i = 0; i < haystack.length; i++) {
            if ("needle".equals(haystack[i])) {
                rsl = Integer.toString(i);
            }
        }
        System.out.println(rsl);
        System.out.println("found the needle at position " + Arrays.asList(haystack).indexOf("needle"));
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 5, 4, 3, 4, 5, 6, 67, 5, 5, 3, 3, 4, 2, 34, 234, 23, 4, 234, 324, 324, "needle", 1, 2, 3, 4, 5, 5, 6, 5, 4, 32, 3, 45, 54};
        System.out.println("found the needle at position 3? =" + Arrays.asList(haystack1).indexOf("needle"));
        System.out.println("found the needle at position 5? =" + Arrays.asList(haystack2).indexOf("needle"));
        System.out.println("found the needle at position 30? =" + Arrays.asList(haystack3).indexOf("needle"));
    }
}
