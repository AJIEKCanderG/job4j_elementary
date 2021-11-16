package ru.job4j.array;

import java.util.Arrays;

/**
 * Упражнения 1.1.6. Массивы 2.9. Привести строку к верхнему регистру, убрав лишние символы, цифры и пробелы
 * Дана строка, записанная в виде массив символов.
 * В строке могут быть пробелы, символы, цифры, буквы, а также некоторые буквы уже в ВЕРХНЕМ РЕГИСТРЕ.
 * Ваша задача создать новую строку в верхнем регистре, в которой будут только буквы исходной строки, которые были в нижнем регистре.
 * Если символ является уже буквой в ВЕРХНЕМ регистре или цифрой или любым символом '@','-','!','%' или пробелом,
 * то просто не записывать в результат, а пропустить.
 * В итоговом массиве символов должны остаться только буквы в ВЕРХНЕМ РЕГИСТРЕ, которые ранее в исходном были в нижнем.
 * <p>
 * Например, для a-123-B, получить A.
 * Например, для aLpha - 1-0!@#$5(2 пробела присутствуют), получить APHA.
 * Например, для aLpHa - 1-0!@#$5(2 пробела присутствуют и 2 буквы в ВЕРХНЕМ регистре изначально), получить APA.
 * Использовать некоторые доп. методы и ознакомиться в остальными:
 * <p>
 * Character.isLowerCase() — возвращает значение true, если переданный символ в нижнем регистре.
 * Character.isUpperCase()) — возвращает значение true, если переданный символ в верхнем регистре.
 * Character.toLowerCase() — возвращает указанное значение в нижнем регистре.
 * Character.toUpperCase() — возвращает указанное значение в верхнем регистре.
 * Character.isLetter() — возвращает значение true, если переданный символ буква.
 * Character.isDigit() — возвращает значение true, если переданный символ цифра.
 * Character.isWhitespace() — возвращает значение true, если переданный символ пустое пространство ("пробел").
 */

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] str = new char[string.length];
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            if (Character.isLetter(string[i])
                    && !Character.isUpperCase(string[i])
                    && !Character.isWhitespace(string[i])) {
                str[i] = Character.toUpperCase(string[i]);
                count++;
            } else {
                str[i] = 0;
            }
        }
        for (int index = 0; index < str.length; index++) {
            if (str[index] == 0) {
                for (int i = index + 1; i < str.length; i++) {
                    if (str[i] != 0) {
                        char temp = str[i];
                        str[i] = str[index];
                        str[index] = temp;
                        break;
                    }
                }
            }
        }
        return Arrays.copyOf(str, count);
    }
}