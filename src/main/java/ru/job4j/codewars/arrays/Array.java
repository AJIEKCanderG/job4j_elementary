package ru.job4j.codewars.arrays;

import java.util.stream.IntStream;

/** Удаление из одного массива элементов которые есть во 2 ом.
 * @author Ajiekcander
 */
public class Array {
    public static int[] arrayDiff(int[] a, int[] b) {
        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
    }
}

/* Второе решние!!!
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
 */

/* Третье решение!
   for (int i = 0; i < b.length; i++) {
     a = ArrayUtils.removeAllOccurences(a, b[i]);
    return a;
 }
 */



