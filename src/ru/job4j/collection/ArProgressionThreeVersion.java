package ru.job4j.collection;

import java.util.List;

public class ArProgressionThreeVersion {
    public static int checkData(List<Integer> data) {
        int sum = data.get(0) + data.get(1);
        for (int i = 2; i < data.size(); i++) {
            if (data.get(i - 1) == (data.get(i - 2) + data.get(i)) / 2) {
                sum += data.get(i);
            } else {
                sum = 0;
                break;
            }
        }
        return sum;
    }
}