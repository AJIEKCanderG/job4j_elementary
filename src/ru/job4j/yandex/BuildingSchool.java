package ru.job4j.yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**   D. Строительство школы
 * Ограничение времени	1 секунда  Ограничение памяти	64Mb
 * Ввод	стандартный ввод или input.txt Вывод	стандартный вывод или output.txt
 * В деревне Интернетовка все дома расположены вдоль одной улицы по одну сторону от нее.
 * По другую сторону от этой улицы пока ничего нет, но скоро все будет – школы, магазины, кинотеатры и т.д.
 *
 * Для начала в этой деревне решили построить школу. Место для строительства школы решили выбрать так,
 * чтобы суммарное расстояние, которое проезжают ученики от своих домов до школы, было минимально.
 *
 * План деревни можно представить в виде прямой, в некоторых целочисленных точках которой находятся дома учеников.
 * Школу также разрешается строить только в целочисленной точке этой прямой (в том числе разрешается строить школу
 * в точке, где расположен один из домов – ведь школа будет расположена с другой стороны улицы).
 *
 * Напишите программу, которая по известным координатам домов учеников поможет определить координаты места
 * строительства школы.
 *
 * Формат ввода:
 * Сначала вводится число N — количество учеников (0 < N < 100001). Далее идут в строго возрастающем порядке координаты
 * домов учеников — целые числа, не превосходящие 2 × 109 по модулю.
 *
 * Формат вывода:
 * Выведите одно целое число — координату точки, в которой лучше всего построить школу. Если ответов несколько,
 * выведите любой из них.
 * ввод:
 * 4
 * 1 2 3 4
 * вывод:
 * 3
 */

public class BuildingSchool {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] s1 = s.split(" ");
        if (n % 2 == 0) {
            int x = (Integer.parseInt(s1[n/2]) + Integer.parseInt(s1[(n/2)  - 1]))/2;
            System.out.println(x);
        } else {
            System.out.println(Integer.parseInt(s1[n/2]));
        }
    }
}
/*        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        if (Integer.parseInt(n) % 2 == 0) {
            int x = (Integer.parseInt(s1[Integer.parseInt(n)/2]) + Integer.parseInt(s1[(Integer.parseInt(n)/2)  - 1]))/2;
            System.out.println(x);
        } else {
            System.out.println(Integer.parseInt(s1[Integer.parseInt(n)/2]));
        }
    }
}*/

/*  26
18
0 1 2 4 11 14 15 18 26 27 28 31 35 37 52 53 66 76
 */


/* 3
4
1 2 3 4
 */

/*  -3
4
-9 -4 -3 -2
 */

/*  -4
8
-9 -8 -7 -5 -4 -3 -2 -1
 */

/* 0
3
-1 0 1
 */

/* 8
5
-9 -1 8 9 10
 */

/* -3
5
-9 -4 -3 -2 -1
 */