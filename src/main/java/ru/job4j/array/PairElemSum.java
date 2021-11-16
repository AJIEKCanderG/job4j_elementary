package ru.job4j.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/** Найти в массиве пару элементов с заданной суммой и вывести в консоль парами эти элементы.
 * @author Ajiekcander
 */
public class PairElemSum {
    public static void main(String[] args) {
        int sum = 10;
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = new ArrayList<>(array.length);
        for (int j : array) {
            list.add(j);
        }
        HashSet<Integer> set = new HashSet<>(list);
        for (Integer s : set) {
            if (set.contains(sum - s)) {
                System.out.print("Пара " + s + " + " + (sum - s) + "\n");
            }
        }
    }
}
