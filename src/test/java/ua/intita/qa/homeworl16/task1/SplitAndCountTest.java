package ua.intita.qa.homeworl16.task1;

import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SplitAndCountTest {

    SplitAndCount splitAndCount = new SplitAndCount();

    @Test
    public void splitText(){
        String text = "What is the difference between ArrayList and list class is and is";
        System.out.println(text);
        final List<String> words = splitAndCount.splitText(text);
        System.out.println(words);
        final Map<String, Integer> repeatWords = splitAndCount.countRepeatWords(words);
        System.out.println(repeatWords);
    }
}