package ru.job4j.codewars;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

/**
 * @author Ajiekcander
 */
public class DinglemouseTest {

    private static String[] show(final String[] ary) {
        System.out.println(Arrays.toString(ary));
        return ary;
    }

    @Test
    public void example() {
        assertArrayEquals(new String[]{"a", "b", "c"}, show(Dinglemouse.split("a.b.c")));
    }

    @Test
    public void withEmptyElement() {
        assertArrayEquals(new String[]{"a", "", "c"}, show(Dinglemouse.split("a..c")));
    }

    @Test
    public void withSpace() {
        assertArrayEquals(new String[]{"a", " ", "c"}, show(Dinglemouse.split("a. .c")));
    }

    @Test
    public void emptyInput() {
        assertArrayEquals(new String[]{}, show(Dinglemouse.split("")));
    }

}