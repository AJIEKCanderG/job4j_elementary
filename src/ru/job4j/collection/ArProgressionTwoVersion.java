package ru.job4j.collection;

import java.util.List;

public class ArProgressionTwoVersion {
    public static int checkData(List<Integer> data) {
        int sum = data.get(0) + data.get(data.size() - 1);
        for (int i = 1; i < data.size() - 1; i++) {
            if (data.get(i) != (data.get(i - 1) + data.get(i + 1)) / 2) {
                return 0;
            }
            sum += data.get(i);
        }
        return sum;
    }
}