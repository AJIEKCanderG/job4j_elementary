package ru.job4j.codewars;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class LineNumberingTest {
    @Test
    public void basicTests() {
        assertEquals(Collections.emptyList(), LineNumbering.number(Collections.emptyList()));
        assertEquals(Arrays.asList("1: a", "2: b", "3: c"), LineNumbering.number(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), LineNumbering.number(Arrays.asList("", "", "", "", "")));
    }
}