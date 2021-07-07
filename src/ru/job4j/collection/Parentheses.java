package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Упражнения. 2.1.3. List 1. Открытые и закрытые скобки
 * Реализовать метод проверки корректности открытых и закрытых скобок.
 * Например, ()(()((()))) - true, ()) - false
 */

public class Parentheses {
    public static boolean valid(char[] data) {
        List<Character> one = new ArrayList<>();
        List<Character> two = new ArrayList<>();
        for (char datum : data) {
            if (data[0] == ')') {
                return false;
            }
            if (datum == '(') {
                one.add(datum);
            } else {
                two.add(datum);
            }
        }
        return one.size() == two.size();
    }
}
     /*   int one = 0;
        int two = 0;
        for (char datum : data) {
            if (data[0] == ')') {
                return false;
            }
            if (datum == '(') {
                one++;
            } else {
                two++;
            }
        }
        return one == two;*/
