package ru.job4j.collections;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeomProgressionTest {
    @Test
    public void generateAndSum1() {
        int rsl = GeomProgression.generateAndSum(1, 3, 4);
        assertThat(rsl, is(40));
    }

    @Test
    public void generateAndSum() {
        int rsl = GeomProgression.generateAndSum(1, 3, 10);
        assertThat(rsl, is(29524));
    }

    @Test
    public void generateAndSumIs2() {
        int rsl = GeomProgression.generateAndSum(1, -1, 10);
        assertThat(rsl, is(0));
    }
}