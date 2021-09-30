package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCasingTest {
    @Test
    public void tests() {
        assertEquals("Incorrect", "camel Casing", CamelCasing.cameCase("camelCasing"));
        assertEquals("Incorrect", "camel Casing Test", CamelCasing.cameCase("camelCasingTest"));
        assertEquals("Incorrect", "camelcasingtest", CamelCasing.cameCase("camelcasingtest"));
        assertEquals("Incorrect", "be To You", CamelCasing.cameCase("beToYou"));
        assertEquals("Incorrect", "a B C D E", CamelCasing.cameCase("aBCDE"));
    }
}
