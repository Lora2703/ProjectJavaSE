package ua.intita.qa.homework9;

public class WordStatistic implements Statists {


    @Override
    public int countNumberLetters(String word) {
        return word.length();
    }

    @Override
    public int countNumberVowels(String word) {
        char[] cWord = word.toCharArray();
        int countVowels = 0;
        for (char c : cWord) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                countVowels++;
            }
        }
        return countVowels;
    }

    @Override
    public int countNumberConsonants(String word) {
        char[] cWord = word.toCharArray();
        int countConsonants = 0;
        for (char c : cWord) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y') {
                countConsonants++;
            }
        }
        return countConsonants;
    }

    @Override
    public int countPoints(String text) {
        char[] cText = text.toCharArray();
        int countPoints = 0;
        for (char c : cText) {
            if (c == '.') {
                countPoints++;
            }
        }
        return countPoints;
    }

    @Override
    public int countComas(String text) {
        char[] cText = text.toCharArray();
        int countComas = 0;
        for (char c : cText) {
            if (c == ',') {
                countComas++;
            }
        }
        return countComas;
    }
}
