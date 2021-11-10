package ru.job4j.codewars.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class THBtest {
    @Test
    public void basicTest() {
        assertEquals("btttthTHBth",
                THB.testing("Remember to test for only the THB's, nothing else"));
    }
    @Test
    public void testNull() {
        String error = null;
        assertEquals("",
                THB.testing(error));
    }
    @Test
    public void testEmpty() {
        assertEquals("",
                THB.testing(""));
    }
    @Test
    public void testComplex() {
        assertEquals("ThB",
                THB.testing("1   0 3 4 86 ! # $ ^ T8 1 # )* % h1 3 4 ^ ! ) * ! 3 4B 6 ) *! # $ 6 "));
    }
    @Test
    public void testSingle() {
        assertEquals("H",
                THB.testing("H"));
    }

    @Test
    public void testRandom1() {
        StringBuilder tester = new StringBuilder();
        for(int j = 0; j < Math.random()*100; j++) {
            tester.append((int) (Math.random() * 123));
        }
        assertEquals(tester == null ? "" : tester.toString().replaceAll("[^thbTHB]",""),
                THB.testing(tester.toString()));
    }

    @Test
    public void testRandom2() {
        StringBuilder tester = new StringBuilder();
        for(int j = 0; j < Math.random()*100; j++) {
            tester.append((int) (Math.random() * 123));
        }
        assertEquals(tester == null ? "" : tester.toString().replaceAll("[^thbTHB]",""),
                THB.testing(tester.toString()));
    }

    @Test
    public void testRandom3() {
        StringBuilder tester = new StringBuilder();
        for(int j = 0; j < Math.random()*100; j++) {
            tester.append((int) (Math.random() * 123));
        }
        assertEquals(tester == null ? "" : tester.toString().replaceAll("[^thbTHB]",""),
                THB.testing(tester.toString()));
    }

    @Test
    public void testRandom4() {
        StringBuilder tester = new StringBuilder();
        for(int j = 0; j < Math.random()*100; j++) {
            tester.append((int) (Math.random() * 123));
        }
        assertEquals(tester == null ? "" : tester.toString().replaceAll("[^thbTHB]",""),
                THB.testing(tester.toString()));
    }

    @Test
    public void testRandom5() {
        StringBuilder tester = new StringBuilder();
        for(int j = 0; j < Math.random()*100; j++) {
            tester.append((int) (Math.random() * 123));
        }
        assertEquals(tester == null ? "" : tester.toString().replaceAll("[^thbTHB]",""),
                THB.testing(tester.toString()));
    }

    @Test
    public void testRandom6() {
        StringBuilder tester = new StringBuilder();
        for(int j = 0; j < Math.random()*100; j++) {
            tester.append((int) (Math.random() * 123));
        }
        assertEquals(tester == null ? "" : tester.toString().replaceAll("[^thbTHB]",""),
                THB.testing(tester.toString()));
    }

    @Test
    public void testRandom7() {
        StringBuilder tester = new StringBuilder();
        for(int j = 0; j < Math.random()*100; j++) {
            tester.append((int) (Math.random() * 123));
        }
        assertEquals(tester == null ? "" : tester.toString().replaceAll("[^thbTHB]",""),
                THB.testing(tester.toString()));
    }

    @Test
    public void testRandom8() {
        StringBuilder tester = new StringBuilder();
        for(int j = 0; j < Math.random()*100; j++) {
            tester.append((int) (Math.random() * 123));
        }
        assertEquals(tester == null ? "" : tester.toString().replaceAll("[^thbTHB]",""),
                THB.testing(tester.toString()));
    }

    @Test
    public void testRandom9() {
        StringBuilder tester = new StringBuilder();
        for(int j = 0; j < Math.random()*100; j++) {
            tester.append((int) (Math.random() * 123));
        }
        assertEquals(tester == null ? "" : tester.toString().replaceAll("[^thbTHB]",""),
                THB.testing(tester.toString()));
    }

    @Test
    public void testRandom10() {
        StringBuilder tester = new StringBuilder();
        for(int j = 0; j < Math.random()*100; j++) {
            tester.append((int) (Math.random() * 123));
        }
        assertEquals(tester == null ? "" : tester.toString().replaceAll("[^thbTHB]",""),
                THB.testing(tester.toString()));
    }

}