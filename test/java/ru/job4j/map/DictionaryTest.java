package ru.job4j.map;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DictionaryTest {
    @Test
    public void collectData() {
        String[] data = {"two", "three", "four", "five", "six", "seven"};
        Map<String, List<String>> rsl = Dictionary.collectData(data);
        Map<String, List<String>> expected = Map.of(
                "s", List.of("six", "seven"),
                "t", List.of("two", "three"),
                "f", List.of("four", "five")
        );
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectDataTwo() {
        String[] data = {"two", "six"};
        Map<String, List<String>> rsl = Dictionary.collectData(data);
        Map<String, List<String>> expected = Map.of(
                "s", List.of("six"),
                "t", List.of("two")
        );
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectDataOne() {
        String[] data = {"two"};
        Map<String, List<String>> rsl = Dictionary.collectData(data);
        Map<String, List<String>> expected = Map.of("t", List.of("two"));
        assertThat(rsl, is(expected));
    }
}