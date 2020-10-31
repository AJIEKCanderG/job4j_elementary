package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру \"11\"");
        boolean game11 = true;
        int count = 11;
        while (game11) {
            System.out.print("Введите число от 1 до 3: ");
            System.out.println();
            int gamer = Integer.parseInt(input.nextLine());
            while (gamer > 3 || gamer < 1) {
                System.out.println("Некорректный ввод. Повторите попытку.");
                System.out.print("Введите число от 1 до 3: ");
                System.out.println();
                gamer = Integer.parseInt(input.nextLine());
            }
            count = count - gamer;
            if (count == 0) {
                game11 = !game11;
                String name = game11 ? "gamer_1" : "gamer_2";
                System.out.println(" Выиграл игрок " + name);
                game11 = false;
            }
            else if (count > 0) {
                System.out.println("Осталось спичек : " + count);
            }
            else {
                System.out.println("Некорректный ввод.");
            }
        }
    }
}