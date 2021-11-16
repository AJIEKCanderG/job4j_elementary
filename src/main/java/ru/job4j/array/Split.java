package ru.job4j.array;

import java.util.Arrays;

/**
 * 5.7. split
 * В классе String есть метод split(), этот метод делит строки на части по разделителю. Ваша задача написать его аналог
 * Например (запись идет через строки для удобства)
 * "1 2", ' ' => {"1", "2"}
 * "12", ' ' => {"12"}
 */

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        char[] rsl = new char[str.length];
        int commonCount = 0;
        int index = 0;
        for (char ch : str) {
            if (ch != c) {
                rsl[index++] = ch;
            } else {
                result[commonCount] = Arrays.copyOf(rsl, index);
                commonCount++;
                index = 0;
            }
        }
        result[commonCount] = Arrays.copyOf(rsl, index);
        return Arrays.copyOf(result, commonCount + 1);
    }
}
