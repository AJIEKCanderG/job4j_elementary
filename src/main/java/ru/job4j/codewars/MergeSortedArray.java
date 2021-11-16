package ru.job4j.codewars;

import java.util.Arrays;

/**
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -109 <= nums1[i], nums2[j] <= 109
 * <p>
 * Вам даны два целых массива nums1и nums2, отсортированных в неубывающем порядке , и два целых числа mи n,
 * представляющие количество элементов в nums1и nums2 соответственно.
 * Объединить nums1 и nums2в единый массив, отсортированный в неубывающем порядке .
 * Окончательный отсортированный массив не должен возвращаться функцией, а должен храниться внутри массива nums1 .
 * Чтобы учесть это, nums1 имеет длину m + n, где первые m элементы обозначают элементы, которые должны быть объединены,
 * а последние n элементы установлены на 0 и должны игнорироваться. nums2 имеет длину n.
 */

public class MergeSortedArray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        return nums1;
    }
}