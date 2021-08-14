package ru.job4j.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "123456789";
        Pattern pattern = Pattern.compile("(\\d{2})(\\d{2})(\\d{2})(\\d{4})");
        Matcher matcher = pattern.matcher(str);
        String strNew = matcher.replaceAll("$4 $3 $2 $1");
        str = str.replaceAll("(\\d{3})(\\d{3})(\\d{3})", "$1 $2 $3");
        System.out.println(str);
    }
}

