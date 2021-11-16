package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleTranspositionTest {
    @Test
    public void basicTest() {
        doTest("Sample text", "Sml etapetx");
        doTest("Simple transposition", "Sml rnpstoipetasoiin");
        doTest("All that glitters is not gold", "Alta ltesi o odl htgitr sntgl");
        doTest("The better part of valor is discretion", "Tebte ato ao sdsrtoh etrpr fvlri icein");
        doTest("Conscience does make cowards of us all", "Cncec osmk oad fu losinede aecwrso sal");
        doTest("Imagination is more important than knowledge", "Iaiaini oeipratta nwegmgnto smr motn hnkolde");
    }

    private void doTest(String text, String expected) {
        assertEquals(expected, SimpleTransposition.transposition(text));
    }
}