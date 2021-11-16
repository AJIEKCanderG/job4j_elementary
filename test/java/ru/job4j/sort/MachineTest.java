package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MachineTest {
    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when55by30() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 5};
        int[] rsl = machine.change(55, 30);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when48by30() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 5, 2, 1};
        int[] rsl = machine.change(48, 20);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when57by30() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 5, 2};
        int[] rsl = machine.change(57, 30);
        assertThat(rsl, is(expected));
    }
}