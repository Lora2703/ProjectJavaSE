package ua.intita.qa.homework10;

public class DeleteWords {
    public String deleteWords(String text, int length){


        return text.replaceAll("\\s[^aeiouy][a-z]{2}\\s", "----");

    }
}
