package ru.job4j.codewars.arrays;

/**
 * 7 kyu   Alphabet symmetry
 * Учитывая массив слов, верните массив количества букв,
 * занимающих свои позиции в алфавите для каждого слова. Например,
 * solve(["abode","ABc","xyzD"]) = [4, 3, 1]
 *
 * @author Ajiekcander
 */
public class AlphabetSymmetry {
    public static int[] solve(String[] arr) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        int[] in = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
            System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length(); j++) {
                if (j == s.indexOf(arr[i].charAt(j))) {
                    count++;
                }
            }
            in[i] = count;
            count = 0;
        }
        return in;
    }
}
