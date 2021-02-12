package ru.job4j.collections;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int sum = 0;
        boolean rsl = true;
        for (int j = 1; j < data.size() - 1; j++) {
            if (data.get(j) != (data.get(j - 1) + data.get(j + 1)) / 2) {
                rsl = false;
                break;
            }
        }
                if (rsl) {
                    for (int dataum: data) {
                        sum += dataum;
                    }
                }
        return sum;
    }
}

