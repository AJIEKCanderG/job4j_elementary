package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Array {
    public static void main(String[] args) {
        List<Integer> start = List.of(-2, -1, 0, 1, 2).stream()
                .filter(n -> n > 0)
                .collect(Collectors.toList());
        start.forEach(System.out::print);
    }
}
