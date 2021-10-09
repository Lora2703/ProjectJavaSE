package ua.intita.qa.homework9;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordStatisticTest {
    Statists wordStatistic = new WordStatistic();

    @Test
    public void countNumberLetters() {
        final int countNum = wordStatistic.countNumberLetters("victory");
        assertEquals(7, countNum);

    }

    @Test
    public void countNumberVowels() {
        final int countNum = wordStatistic.countNumberVowels("Intro");
        assertEquals(2, countNum);
    }

    @Test
    public void countNumberConsonants() {
        final int countNum = wordStatistic.countNumberConsonants("victory");
        assertEquals(4, countNum);
    }

    @Test
    public void countPoints() {
        final int countPoints = wordStatistic.countPoints("Citius, altius, fortius.");
        assertEquals(1, countPoints);
    }

    @Test
    public void countComas() {
        final int countComas = wordStatistic.countComas("Citius, altius, fortius.");
        assertEquals(2, countComas);
    }
    @Test
    public void countNumberUppercaseVowels() {
        final int countNum = wordStatistic.countNumberVowels("Intro");
        assertEquals(2, countNum);


    }
}