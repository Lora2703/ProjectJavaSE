package ua.intita.qa.homeworl16.task1;

import java.util.*;

public class SplitAndCount {
    public ArrayList<String> splitText(String text) {
       ArrayList<String> words = new ArrayList<>(Arrays.asList(text.split("\\s")));
       return words;
    }
    public HashMap<String, Integer> countRepeatWords (ArrayList<String> words){
        Map<String, Integer> countWords = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>(words);
        for (String w : uniqueWords){
            countWords.put(w, Collections.frequency(words, w));
        }
        return (HashMap<String, Integer>) countWords;
    }

}
