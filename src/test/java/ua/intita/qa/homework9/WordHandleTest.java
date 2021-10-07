package ua.intita.qa.homework9;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordHandleTest {
    Handler worldHandle = new WordHandle();

    @Test
    public void uppercase() {
        final String uWord = worldHandle.uppercase("victory");
        assertEquals("VICTORY", uWord);
    }

    @Test
    public void lowercase() {
        final String uWord = worldHandle.lowercase("VICTORY");
        assertEquals("victory", uWord);
    }

    @Test
    public void getLength() {
        final int wLen = worldHandle.getLength("victory");
        assertEquals(7, wLen);
    }

    @Test
    public void concat() {
        final String concatString = worldHandle.concat("My ", "victory");
        assertEquals("My victory", concatString);
    }

    @Test
    public void contain() {
        final boolean res = worldHandle.contain("victory", 'y');
        assertTrue(res);
    }
}