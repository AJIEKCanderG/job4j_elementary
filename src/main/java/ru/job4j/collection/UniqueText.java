package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
    String[] origin = originText.split(" ");
    String[] text = duplicateText.split(" ");
    HashSet<String> check = new HashSet<>(Arrays.asList(origin));
      for (String t : text) {
          if (!check.contains(t)) {
              return false;
          }
      }
    return true;
}
}
