package ru.job4j.codewars.strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Ajiekcander
 */
public class MaxLengthSubstringsTest {
    @Test
    public void basicTests(){
        assertEquals(3,MaxLengthSubstrings.solve("ultrarevolutionariees"));
        assertEquals(2,MaxLengthSubstrings.solve("codewarriors"));
        assertEquals(3,MaxLengthSubstrings.solve("suoidea"));
        assertEquals(1,MaxLengthSubstrings.solve("strengthlessnesses"));
        assertEquals(11,MaxLengthSubstrings.solve("mnopqriouaeiopqrstuvwxyuaeiouaeiou"));
        assertEquals(0,MaxLengthSubstrings.solve("mnzxcvb"));
    }
}