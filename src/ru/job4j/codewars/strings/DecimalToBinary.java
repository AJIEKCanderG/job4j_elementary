package ru.job4j.codewars.strings;

/**
 * Перевод десятичного числа в двоичную форму, его реверс и обратно в десятичную.
 * For example, the number 417 is 110100001 in binary. Reversing the binary is 100001011 which is 267.
 * @author Ajiekcander
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        int n = 417;
        System.out.println();
        int rsl = Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2);
        System.out.println("Expected 267 is " + rsl);
    }
}
