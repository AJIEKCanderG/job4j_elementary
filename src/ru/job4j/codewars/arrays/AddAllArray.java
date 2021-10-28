package ru.job4j.codewars.arrays;

import java.util.Arrays;

/**
 * Заполнить массив одинаковыми значениями   Arrays.fill
 * @author Ajiekcander
 */
public class AddAllArray {
    public static void main(String[] args) {
        String[] websites = new String[10];
        Arrays.fill(websites, "codewars");
        System.out.println(Arrays.toString(websites));
    }
}