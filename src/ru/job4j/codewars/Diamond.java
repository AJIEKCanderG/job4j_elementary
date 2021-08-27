package ru.job4j.codewars;

/**  Give me a Diamond
 * You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters.
 * Trailing spaces should be removed, and every line must be terminated with a newline character (\n).
 * Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.
 * Examples
 * A size 3 diamond:
 *  *
 * ***
 *  *
 */

public class Diamond {
    public static String print(int n) {
        StringBuilder expected = new StringBuilder();
        if (n > 0 && n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                final int space = n / 2 - i > 0 ? n / 2 - i : i - n / 2;
                final int star = i < n / 2 ? 1 + i * 2 : -1 + (Math.abs(i - n) << 1);
                if (space != 0) {
                    expected.append(String.format(String.format("%%%ds", space), " ").replace(" ", " "));
                }
                expected.append(String.format(String.format("%%%ds", star), " ").replace(" ", "*"));
                expected.append("\n");
            }
            return new String(expected);
        } else {
            return null;
        }
    }
}

