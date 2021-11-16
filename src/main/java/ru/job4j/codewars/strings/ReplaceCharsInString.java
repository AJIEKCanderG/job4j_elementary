package ru.job4j.codewars.strings;

/**
 * Заменить все символы в строке, кромме последних четырёх.
 * @author Ajiekcander
 */
public class ReplaceCharsInString {
    public static String maskify(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
}

/*
      char[] x = str.toCharArray();
      if(str.length() == 1 || str.length() == 0) {
          System.out.println("str = " + str);
        } else {
           for(int i = 0; i < str.length() - 4; i++) {
        x[i] = '#';
            }
       }
   return new String(x);
  }
}
*/
