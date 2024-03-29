package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromZeroToNineThenTwenty() {
        int rsl = Counter.sumByEven(0, 9);
        int expected = 20;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumNotEvenNumbersFromZeroToEightThenTwenty() {
        int rsl = Counter.sumByNotEven(0, 8);
        int expected = 16;
        assertThat(rsl, is(expected));
    }

}