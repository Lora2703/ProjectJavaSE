package ua.intita.qa.homework9;

import java.lang.String;

public class WordHandle implements Handler {

    @Override
    public String uppercase(String word) {
        return word.toUpperCase();
    }

    @Override
    public String lowercase(String word) {
        return word.toLowerCase();
    }

    @Override
    public int getLength(String word) {
        return word.length();
    }

    @Override
    public String concat(String str1, String str2) {
        str1 = str1.concat(str2);
        return str1;
    }

    @Override
    public boolean contain(String word, char symbol) {
        char[] cWord = word.toCharArray();
        for (char c : cWord) {
            if (c == symbol) return true;
        }
        return false;
    }
}
