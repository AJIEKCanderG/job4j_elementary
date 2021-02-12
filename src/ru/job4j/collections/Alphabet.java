package ru.job4j.collections;

import java.util.*;

/** 16. Буквы в алфавитном порядке.
 * Вам необходимо реализовать метод, который принимает строку, которое является одним словом, без знаков препинания цифр и пробелов.
 * Метод должен вернуть новую строку, в которой все символы исходной строки будут расставлены в алфавитном порядке.
 * Для разделения строки на подстроки используйте метод split(), добавьте все элементы в коллекцию List<String>,
 * отсортируйте в порядке возрастания - используйте метод sort, в который передадите компаратор. Новую строку сформируйте с помощью StringBuilder.*/

public class Alphabet {
    public static String reformat(String s) {
        String[] s1 = s.split("");
        List<String> rsl = new ArrayList<>(Arrays.asList(s1));
        Collections.sort(rsl);
        StringBuilder newS = new StringBuilder();
        for (String rsl1 : rsl) {
            newS.append(rsl1);
        }
        return newS.toString();
    }
}





