package ru.job4j.codewars;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String room = scanner.next();
        String cond = scanner.next() + scanner.nextLine();
        String mode = scanner.nextLine();

    }
}
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
