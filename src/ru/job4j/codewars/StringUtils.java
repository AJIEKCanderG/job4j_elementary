package ru.job4j.codewars;

/**
 * altERnaTIng cAsE <=> ALTerNAtiNG CaSe
 */

public class StringUtils {
    public static String toAlternativeString(String string) {
        char[] ch = string.toCharArray();
        StringBuilder str = new StringBuilder();
        for (char c : ch) {
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            str.append(c);
        }

        return str.toString();
    }
}


/*
 public static String toAlternativeString(String string) {
        String result = "";
        for (char c : string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }
}*/