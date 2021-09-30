package ru.job4j.codewars;


import ru.job4j.stream.CollectorAriphmetic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
      int n = 10;
      int sum = 0;
      while (n > 0) {
          while (n > 0) {
              sum = sum + n % 10;
              n = n / 10;
          }
          n = n - sum;
      }
        System.out.println(n);
/*
        if (sum == 1 || sum == 3 || sum == 24 || sum == 26 || sum == 47 || sum == 49 || sum == 70 || sum == 72 || sum == 93 || sum == 95) {
            System.out.println( "kiwi");
        }
        if (sum == 2 || sum == 21 || sum == 23 || sum == 42 || sum == 44 || sum == 63 || sum == 65 || sum == 84 || sum == 86) {
            System.out.println( "pear");
        }
        if (sum == 4 || sum == 6 || sum == 25 || sum == 29 || sum == 48 || sum == 50 || sum == 71 || sum == 73 || sum == 94 || sum == 96) {
            System.out.println("banana");
        }
        if (sum == 5 || sum == 7 || sum == 28 || sum == 30 || sum == 51 || sum == 53 || sum == 74 || sum == 76 || sum == 95 || sum == 97) {
            System.out.println( "melon");
        }
        if (sum == 8 || sum == 10 || sum == 12 || sum == 31 || sum == 33 || sum == 52 || sum == 56 || sum == 75 || sum == 77 || sum == 79 || sum == 98 || sum == 100) {
            System.out.println( "pineapple");
        }
        if (sum % 9 == 0) {
            System.out.println( "apple");
        }
        if (sum == 11 || sum == 13 || sum == 34 || sum == 55 || sum == 57 || sum == 59 || sum == 78 || sum == 80) {
            System.out.println( "cucumber");
        }
        if (sum == 14 || sum == 16 || sum == 34 || sum == 55 || sum == 57 || sum == 59 || sum == 78 || sum == 80) {
            System.out.println("orange");
        }
*/

    }
}
  /*      int count = 0;
        int[] arr = new int[];
        int max = Integer.parseInt(arr[0]);
        for (int i = 0; i < arr.length; i++) {
          //  while (Integer.parseInt(arr[i]) != 0) {
                if (max < Integer.parseInt(arr[i])) {
                    max = Integer.parseInt(arr[i]);
             //   }
            }
        }
        for (String value : arr) {
            if (max == Integer.parseInt(value)) {
                count++;
            }
        }*/
 /*       int n = scanner.nextInt();
        int sum = 0;
        if (scanner.hasNextInt()) {
            for (int i = scanner.nextInt(); i <= n; i++) {
                sum += i;
            }
        }
        System.out.println(sum / n);
        System.out.println(sum);
    }
}*/
      /* Scanner scanner = new Scanner(System.in);
        String room = Integer.toString(scanner.nextInt());
        String cond = Integer.toString(scanner.nextInt());
        int x = Integer.parseInt(room);
        int y = Integer.parseInt(cond);
        String mode = scanner.nextLine();
        if (mode.equals("auto")) {
            System.out.println(y);
        }
        if (mode.equals("fan")) {
            System.out.println(x);
        }
        if (mode.equals("heat")) {
            if (y > x) {
                System.out.println(y);
            } else {
                System.out.println(x);
            }
        }
        if (mode.equals("freeze")) {
            if (y < x) {
                System.out.println(y);
            } else {
                System.out.println(x);
            }
        }

    }
}

*/

        /*  //{10,56,64}
        int h = 10;
        int catYears = 0;
        int dogYears = 0;
        System.out.println(Arrays.toString(new int[]{h, h == 1 ? 15 : 16 + 4 * h, h == 1 ? 15 : 14 + 5 * h}));
        //new int[]{y,y==1?15:16+4*y,y==1?15:14+5*y};

        int n = 4;
        int[] arr = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            arr[i] = (int) Math.pow(2, i);
        }
        System.out.println(Arrays.toString(arr));
        //1,2,4,8,1;6

         */
