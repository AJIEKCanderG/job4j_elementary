package ru.job4j.codewars.arrays;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

public class AlphabetSymmetryTest {

    private static final String A = "abcdefghijklmnopqrstuvwxyz";
    private static final Random RANDOM = new Random();

    private static int[] mySolve(String[] arr) {
        int[] s = new int[arr.length];
        int c, j, t;
        for (int i = 0; i < arr.length; i++) {
            t = Math.min(arr[i].length(), 26);
            c = 0;
            for (j = 0; j < t; j++) {
                if (Character.toLowerCase(arr[i].charAt(j)) == A.charAt(j)) {
                    c++;
                }
            }
            s[i] = c;
        }
        return s;
    }

    private static int random(int min, int max) {
        return RANDOM.nextInt(max - min) + min;
    }

    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{4, 3, 1}, AlphabetSymmetry.solve(new String[]{"abode", "ABc", "xyzD"}));
        assertArrayEquals(new int[]{4, 3, 0}, AlphabetSymmetry.solve(new String[]{"abide", "ABc", "xyz"}));
        assertArrayEquals(new int[]{6, 5, 7}, AlphabetSymmetry.solve(new String[]{"IAMDEFANDJKL", "thedefgh", "xyzDEFghijabc"}));
        assertArrayEquals(new int[]{1, 3, 1, 3}, AlphabetSymmetry.solve(new String[]{"encode", "abc", "xyzD", "ABmD"}));
    }

    @Test
    public void randomTest() {
        final String upper = A.toUpperCase();
        String[] l;
        int j, k, r, r0, r1, r2, d;
        StringBuilder s;
        String s1;
        for (int i = 0; i < 100; i++) {
            r = random(500, 1000);
            l = new String[r - 2];
            for (j = 2; j < r; j++) {
                r0 = random(0, 10);
                r1 = random(0, 10);
                r2 = random(r1, 26);
                s = new StringBuilder();
                for (k = 0; k < r0; k++) {
                    s.append(A.charAt(random(0, 26)));
                }
                s1 = upper.substring(0, r1) + s.toString().toUpperCase();
                d = r1 - r0;
                if (d >= 0) {
                    s1 += A.substring(d, r2);
                }
                l[j - 2] = s1;
            }
            assertArrayEquals(mySolve(l), AlphabetSymmetry.solve(l));
        }
    }
}