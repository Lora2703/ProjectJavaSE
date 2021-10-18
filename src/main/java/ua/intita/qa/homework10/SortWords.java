package ua.intita.qa.homework10;

import java.util.Arrays;

import java.util.Locale;

public class SortWords {
    public String[] orderWords(String text){

        text.toLowerCase();
        String[] words = text.split("\\W+");
        Arrays.sort(words);

        return words;

    }


}
