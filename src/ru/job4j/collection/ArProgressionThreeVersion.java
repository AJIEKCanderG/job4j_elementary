package ru.job4j.collection;

import java.util.List;

public class ArProgressionThreeVersion {
    public static int checkData(List<Integer> data) {
        int sum = 0;
        for (int i = 2; i < data.size(); i++) {
            if (data.get(i - 1) == (data.get(i - 2) + data.get(i)) / 2) {
                sum = data.stream().mapToInt(x -> x).sum();
            } else {
                sum = 0;
                break;
            }
        }
        return sum;
    }
}