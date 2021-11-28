package ua.intita.qa.homeworl16.treemapexercises;

import java.util.Comparator;
import java.util.TreeMap;

public class Task7 {
    public static void main(String[] args) {
        TreeMap<String, Integer> sweets = new TreeMap<>(new MyComp());
        sweets.put("Mars", 12);
        sweets.put("Snickers", 15);
        sweets.put("Bounty", 18);
        sweets.put("Lion", 14);
        sweets.put("Kit Kat", 16);

        System.out.println(sweets);
    }

    static class MyComp implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
}


