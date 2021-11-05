package ru.job4j.codewars.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Удалить дубликаты слов из строки
 * Input:
 * 'alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta'
 * Output:
 * 'alpha beta gamma delta'
 * @author Ajiekcander
 */
public class RemoveDuplicateWords {
    public static String removeWords(String s){
        return Arrays.stream(s.split("\\s+")).distinct().collect(Collectors.joining(" "));
    }
}


/*
return Arrays.stream(s.split(" "))
                     .distinct()
                     .collect(joining(" "));
 */