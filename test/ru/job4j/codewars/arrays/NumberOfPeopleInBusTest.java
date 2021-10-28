package ru.job4j.codewars.arrays;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * @author Ajiekcander
 */
public class NumberOfPeopleInBusTest {

    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        assertEquals(5, NumberOfPeopleInBus.countPassengers(list));
    }
}
