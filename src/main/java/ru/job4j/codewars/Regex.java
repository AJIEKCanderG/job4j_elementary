package ru.job4j.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String string = "123456789";
        Pattern pattern = Pattern.compile("(\\d{2})(\\d{2})(\\d{2})(\\d{4})");
        Matcher matcher = pattern.matcher(string);
        String strNew = matcher.replaceAll("$4 $3 $2 $1");
        System.out.println("strNew: " + strNew);
        string = string.replaceAll("(\\d{3})(\\d{3})(\\d{3})", "$1 $2 $3");
        System.out.println("string :" + string);

        /**
         * Example use regex
         */
        int num = -28369;
        String str = Integer.toString(num).replaceAll("([13579])", "-$1-");
        System.out.println("([13579]) заменили все нечетные на -$1-  ==> " + str);
        str = str.replaceAll("--", "-");
        System.out.println("все -- заменили на -  ==> " + str);
        str = str.replaceAll("^-", "");
        System.out.println("^- заменили 1-ый символ - на пустоту   ==> " + str);
        str = str.replaceAll("-$", "");
        System.out.println("-$ заменили последний символ - на пустоту  ==> " + str);

        /**
         * FakeBinary  - Заменить все числа меньше 5 на 0, а все чтоль больше либо равно на 1.
         */
        String d = "45385593107843568";
        d = d.replaceAll("([0-4])", "0").replaceAll("([5-9])", "1");
        System.out.println(d);

        /**
         * Вместо +  строк
         */
        String name = "Alex";
        System.out.printf("Hello, %s, how are you doing today?%n", name);
    }
}

