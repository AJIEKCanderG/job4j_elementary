package ru.job4j.codewars.strings;

import java.util.stream.Stream;

/**
 * Найти самую маленькую длину слова в строке.
 * @author Ajiekcander
 */
public class ShortLengthWordInString {
    public static int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}

/*
  String[] arr = s.split(" ");
  int min = arr[0].length();
      for (int i = 1; i < arr.length; i++) {
        if(arr[i].length() < min) {
             min = arr[i].length();
             }
         }
   return min;
  }
}
*/
