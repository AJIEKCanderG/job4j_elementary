package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OddPrintTest {

    @Test
    public void whenNonEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        OddPrint.print(new int[] {1, 2, 3});
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "1" + ln + "3" + ln
        ));
    }

    @Test
    public void whenEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        OddPrint.print(new int[] {2, 4, 6});
        assertThat(out.toString(), is(""));
    }

    @Test
    public void whenNonEmpty2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        OddPrint.print(new int[] {3, 5, 7, 9, 11});
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "3" + ln + "5" + ln + "7" + ln + "9" + ln + "11" + ln
        ));
    }

}