package ru.job4j.collection;


import org.junit.Test;
import ru.job4j.collection.Pangram;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PangramTest {
    @Test
    public void checkString() {
        String str = "Jackdaws love my big sphinx of quartz";
        boolean b = Pangram.checkString(str);
        assertThat(b, is(true));
    }
}