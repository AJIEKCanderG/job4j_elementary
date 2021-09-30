package ru.job4j.codewars;

/**
 * Digital root is the recursive sum of all the digits in a number.
 * Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing
 * in this way until a single-digit number is produced. The input will be a non-negative integer.
 * Examples
 *     16  -->  1 + 6 = 7
 *    942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
 * 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
 */

public class DRoot {
    public static int digitalRoot(int n) {
        int rsl = 0;
        String[] str = Integer.toString(n).split("");
        for (String value : str) {
            rsl += Integer.parseInt(value);
            String st = Integer.toString(rsl);
            if (st.length() > 1) {
                String[] str1 = Integer.toString(rsl).split("");
                rsl = 0;
                for (String s : str1) {
                    rsl = rsl + Integer.parseInt(s);
                }
            }
        }
        return rsl;
    }
}


/* Best Solution #1
public class DRoot {
  public static int digital_root(int n) {
    while(n > 9){
      n = n/10 + n % 10;
      }
    return(n);
  }
}  */

/* Best Solution #2
public class DRoot {
  public static int digital_root(int n) {
    return (n != 0 && n%9 == 0) ? 9 : n % 9;
  }
} */

