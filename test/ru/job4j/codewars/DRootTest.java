package ru.job4j.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DRootTest {
    @Test
    public void Test1() {
        assertEquals( "Nope!" , 7, DRoot.digital_root(16));
    }
    @Test
    public void Test2() {
        assertEquals( "Nope!" , 6, DRoot.digital_root(456));
    }
    @Test
    public void Test3() {
        assertEquals( "Nope!" , 6, DRoot.digital_root(132189));
    }
    @Test
    public void Test4() {
        assertEquals( "Nope!" , 2, DRoot.digital_root(493193));
    }
}