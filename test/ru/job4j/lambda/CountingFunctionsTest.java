package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CountingFunctionsTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = CountingFunctions.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = CountingFunctions.diapason(1, 3, x -> 2 * Math.pow(x, 2) + 2 * x + 1);
        List<Double> expected = Arrays.asList(5D, 13D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenIndicativeFunctionThenIndicativeResults() {
        List<Double> result = CountingFunctions.diapason(2, 5, x -> Math.pow(x, x));
        List<Double> expected = Arrays.asList(4D, 27D, 256D);
        assertThat(result, is(expected));
    }

}