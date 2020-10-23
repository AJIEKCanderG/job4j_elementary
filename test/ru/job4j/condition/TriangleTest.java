package ru.job4j.condition;

import junit.framework.TestCase;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TriangleTest extends TestCase {

    public void testExist() {
        boolean rsl = Triangle.exist(4, 5, 6);
        assertThat(rsl, is(true));
    }
}