package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan190Then103() {
        short in = 190;
        double expected = 103.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman169Then67() {
            short in = 169;
            double expected = 67.85;
            double out = Fit.womanWeight(in);
            Assert.assertEquals(expected, out, 0.01);
        }
    }