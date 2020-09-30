package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class SectionCountTest {

    @Test
    public void test() {
        assertEquals(1, SectionCount.count(1, 1));
        assertEquals(2, SectionCount.count(2, 1));
        assertEquals(1, SectionCount.count(3, 2));
        assertEquals(2, SectionCount.count(4, 2));
        assertEquals(3, SectionCount.count(6, 2));
        assertEquals(4, SectionCount.count(9, 2));
        assertEquals(3, SectionCount.count(11, 3));
        assertEquals(1, SectionCount.count(8, 8));
    }

}