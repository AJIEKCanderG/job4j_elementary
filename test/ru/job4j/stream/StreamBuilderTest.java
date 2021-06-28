package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamBuilderTest {
    @Test
    public void whenThree() {
        Integer[] data = {1, 2, 3};
        Stream<Object> stream = StreamBuilder.createStream(data);
        List<Integer> list = stream.map(v -> (Integer) v).collect(Collectors.toList());
        List<Integer> expect = List.of(1, 3);
        assertEquals(expect, list);
    }

    @Test
    public void whenSeven() {
        Integer[] data = {1, 2, 3, 4, 5, 6, 7};
        Stream<Object> stream = StreamBuilder.createStream(data);
        List<Integer> list = stream.map(v -> (Integer) v).collect(Collectors.toList());
        List<Integer> expect = List.of(1, 7);
        assertEquals(expect, list);
    }

    @Test
    public void whenOne() {
        Integer[] data = {1};
        Stream<Object> stream = StreamBuilder.createStream(data);
        List<Integer> list = stream.map(v -> (Integer) v).collect(Collectors.toList());
        List<Integer> expect = List.of(1, 1);
        assertEquals(expect, list);
    }

    @Test
    public void whenTwo() {
        Integer[] data = {1, 2};
        Stream<Object> stream = StreamBuilder.createStream(data);
        List<Integer> list = stream.map(v -> (Integer) v).collect(Collectors.toList());
        List<Integer> expect = List.of(1, 2);
        assertEquals(expect, list);
    }
}