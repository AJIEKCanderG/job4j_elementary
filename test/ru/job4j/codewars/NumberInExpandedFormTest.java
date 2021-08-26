package ru.job4j.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberInExpandedFormTest {
        @Test
        public void testSomething() {
            assertEquals("1000 + 20 + 3", NumberInExpandedForm.expandedForm(1023));
            assertEquals("10 + 2", NumberInExpandedForm.expandedForm(12));
            assertEquals("40 + 2", NumberInExpandedForm.expandedForm(42));
            assertEquals("70000 + 300 + 4", NumberInExpandedForm.expandedForm(70304));
        }
    }