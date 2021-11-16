package ru.job4j.codewars.arrays;

import java.util.Arrays;

/**
 * Удалить дубликаты всех числе слева.
 * // Remove the 3's at indices 0 and 3
 * // followed by removing a 4 at index 1
 * solve([3, 4, 4, 3, 6, 3]); // => [4, 6, 3]
 *
 * @author Ajiekcander
 */
public class DeleteDuplicatesOnLeft {

    public static int[] solve(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> -1)
                .distinct()
                .sorted((a, b) -> -1)
                .mapToInt(a -> a)
                .toArray();
    }
}
