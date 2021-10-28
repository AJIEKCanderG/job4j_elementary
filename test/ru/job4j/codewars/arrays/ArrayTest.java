package ru.job4j.codewars.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Ajiekcander
 */
public class ArrayTest {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2}, Array.arrayDiff(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, Array.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, Array.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, Array.arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, Array.arrayDiff(new int [] {}, new int[] {1,2}));
    }

    @Test
    public void sampleTests1() {
        assertArrayEquals(new int[] {4}, Array.arrayDiff(new int [] {1,2,3,4}, new int[] {1,2,3}));
    }

    @Test
    public void sampleTests2() {
        assertArrayEquals(new int[] {}, Array.arrayDiff(new int [] {1,2}, new int[] {1,2}));
    }

    @Test
    public void sampleTests3() {
        assertArrayEquals(new int[] {3}, Array.arrayDiff(new int [] {1,2,3}, new int[] {1,2}));
    }
}