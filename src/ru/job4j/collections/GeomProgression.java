package ru.job4j.collections;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> data = new ArrayList<>(count);
        int sum = 0;
        for (int j = 1; j < data.size() - 1; j++) {
            if (data.get(j) != data.get(j - first) * denominator) {
                return 0;
            }
        }
        for (Integer data1 : data) {
                    sum += data1;
                }
            return sum;
        }
    }