package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2To3Then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax9To5To8Then9() {
        int result = Max.max(9, 5, 8);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax4To3To2To1Then4() {
        int result = Max.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1To1To1To6Then6() {
        int result = Max.max(1, 1, 1, 6);
        assertThat(result, is(6));
    }

}