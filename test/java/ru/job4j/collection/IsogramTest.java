package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.Isogram;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class IsogramTest {
    @Test
    public void checkStringTrue() {
        String s = "uncopyrightables";
        boolean b = Isogram.checkString(s);
        assertThat(b, is(true));
    }

    @Test
    public void checkStringFalse() {
        String s = "javascript";
        boolean a = Isogram.checkString(s);
        assertThat(a, is(false));
    }
}