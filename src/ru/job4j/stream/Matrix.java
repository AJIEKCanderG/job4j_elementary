package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
      List<Integer> convert(Integer[][] num) {
return   Stream.of(num).flatMap(Stream::of).collect(Collectors.toList());
    }
}
