package ua.intita.qa.homeworl16.task1;

import java.util.*;

public class SplitAndCount {
    public List<String> splitText(String text) {
       List<String> words = new ArrayList<>(Arrays.asList(text.split("\\s")));
       return words;
    }
    public Map<String, Integer> countRepeatWords (List<String> words){
        Map<String, Integer> countWords = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>(words);
        for (String w : uniqueWords){
            countWords.put(w, Collections.frequency(words, w));
        }
        return countWords;
    }

}
