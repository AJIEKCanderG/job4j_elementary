package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class camelCasingTest {
    @Test
    public void tests() {
        assertEquals( "Incorrect", "camel Casing", camelCasing.camelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", camelCasing.camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", camelCasing.camelCase("camelcasingtest"));
        assertEquals( "Incorrect", "be To You", camelCasing.camelCase("beToYou"));
        assertEquals( "Incorrect", "a B C D E", camelCasing.camelCase("aBCDE"));
    }
}
