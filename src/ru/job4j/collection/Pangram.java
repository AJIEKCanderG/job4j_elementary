package ru.job4j.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Панграмма - короткий текст, который использует все буквы алфавита, по возможности не повторяя их.
 * Панграмма — это предложение, содержащее каждую букву хотя бы 1 раз в английском алфавите !!!
 * Метод принимает строку(на английском языке).
 * Необходимо реализовать его так, чтобы метод определил является ли входящая строка панграммой.
 * Строчные и прописные буквы являются одинаковыми символами, пробелы необходимо игнорировать.
 * Напомню, что в английском алфавите 26 букв.
 */
public class Pangram {
    public static boolean checkString(String s) {
        char[] str = s.replaceAll("\\s+", "").toCharArray();
        Set<Character> hs = new HashSet<>();
        for (char c : str) {
            hs.add(c);
            return true;
        }
        return false;
    }
}
