package ru.job4j.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void exampleTests() {
        assertEquals("", Encrypt.encryptThis(""));
        assertEquals("65 119esi 111dl 111lw 108dvei 105n 97n 111ka", Encrypt.encryptThis("A wise old owl lived in an oak"));
        assertEquals("84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp", Encrypt.encryptThis("The more he saw the less he spoke"));
        assertEquals("84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare", Encrypt.encryptThis("The less he spoke the more he heard"));
        assertEquals("87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri", Encrypt.encryptThis("Why can we not all be like that wise old bird"));
        assertEquals("84kanh 121uo 80roti 102ro 97ll 121ruo 104ple", Encrypt.encryptThis("Thank you Piotr for all your help"));
    }
}