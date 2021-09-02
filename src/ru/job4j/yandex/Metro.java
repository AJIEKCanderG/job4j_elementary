package ru.job4j.yandex;

import java.util.Scanner;

/**  B. Кольцевая линия метро
 * Формат ввода:
 * Станции пронумерованы подряд натуральными числами 1, 2, 3, …, N (1-я станция – соседняя с N-й), N не превосходит 100.
 * Вводятся три числа: сначала N – общее количество станций кольцевой линии, а затем i и j – номера станции,
 * на которой Витя садится, и станции, на которой он должен выйти. Числа i и j не совпадают.
 * Все числа разделены пробелом.
 *
 * Формат вывода:
 * Требуется выдать минимальное количество промежуточных станций (не считая станции посадки и высадки),
 * которые необходимо проехать Вите.
 * Тесты:
 * 57 30 40 = 9
 * 10 1 9 = 1
 * 100 5 6 = 0
 * 99 98 2 = 2
 */

public class Metro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int result1;
        int result2;
        if (i + 1 == j || i == j + 1) {
            System.out.println(0);
        } else {
            result1 = Math.abs(j - i) - 1;
            result2 = n - result1 - 2;
            System.out.println(Math.min(result1, result2));
        }
    }
}
