package ru.job4j.codewars;

public class DRoot {
    public static int digital_root(int n) {
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

