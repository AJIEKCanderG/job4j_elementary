package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void whenDistanceX1Y1Y2ZeroX2TwoThenTwo() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistanceX1Y1Y2OneX2TwoThenOne() {
        int expected = 1;
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistanceX1Y1Y2TwoX2FourThenTwo() {
        int expected = 2;
        int x1 = 2;
        int y1 = 2;
        int x2 = 4;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}