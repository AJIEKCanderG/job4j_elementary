package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int expected = 5;
        int p = 12;
        int k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenSquarePTwentyKFourThenSixteen() {
        Assert.assertEquals(16, SqArea.square(20, 4), 0.01);
    }
}