package ru.job4j.yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * E. Точка и треугольник
 * Ограничение времени	1 секунда Ограничение памяти	64Mb
 * Ввод	стандартный ввод или input.txt Вывод	стандартный вывод или output.txt
 * На координатной плоскости расположены равнобедренный прямоугольный треугольник ABC с длиной катета d и точка X.
 * Катеты треугольника лежат на осях координат, а вершины расположены в точках: A (0,0), B (d,0), C (0,d).
 * <p>
 * Напишите программу, которая определяет взаимное расположение точки X и треугольника. Если точка X расположена
 * внутри или на сторонах треугольника, выведите 0. Если же точка находится вне треугольника, выведите номер ближайшей
 * к ней вершины.
 * <p>
 * Формат ввода
 * Сначала вводится натуральное число d (не превосходящее 1000), а затем координаты точки X – два целых числа из
 * диапазона от –1000 до 1000.
 * <p>
 * Формат вывода
 * Если точка лежит внутри, на стороне треугольника или совпадает с одной из вершин, то выведите число 0.
 * Если точка лежит вне треугольника, то выведите номер вершины треугольника, к которой она расположена ближе
 * всего (1 – к вершине A, 2 – к B, 3 – к C). Если точка расположена на одинаковом расстоянии от двух вершин,
 * выведите ту вершину, номер которой меньше.
 */

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String d = br.readLine();
        String x = br.readLine();
        String[] s2 = x.split(" ");
        int d1 = Integer.parseInt(d);
        int x1 = Integer.parseInt(s2[0]);
        int x2 = Integer.parseInt(s2[1]);
        if (d1 == x1 + x2 || d1 > x1 + x2 || x1 + x2 == 0) {
            System.out.println(0);
        }
    }
}