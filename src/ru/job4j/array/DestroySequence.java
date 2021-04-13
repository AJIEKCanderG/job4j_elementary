package ru.job4j.array;

/** Представьте, что вы связист на войне.
 * Вы отловили сигнал противника, ваша задача испортить его.
 * Вы решили это сделать следующим образом, заменить первые 5 символов 0, а последние 5 символов 1.
 Длина исходной последовательности >= 10
 */

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        for (int i = 0; i < 5; i++) {
                seq[i] = '0';
                seq[(seq.length - 1) - i] = '1';
        }
        return seq;
    }
}
