package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.Jackpot;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class JackpotTest {
    @Test
    public void checkYourWinTrue() {
        String[] strings = {"@", "@", "@", "@"};
        boolean win = Jackpot.checkYourWin(strings);
        assertThat(win, is(true));
    }

    @Test
    public void checkYourWinFalse() {
        String[] strings = {"&&", "&", "&&&", "&&&&"};
        boolean win = Jackpot.checkYourWin(strings);
        assertThat(win, is(false));
    }
}