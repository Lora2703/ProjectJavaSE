package ua.intita.qa.homeworl16.treemapexercises;

import java.util.TreeMap;

public class Task19_20 {
    public static void main(String[] args) {
        TreeMap<String, Integer> sweets = new TreeMap<>();
        sweets.put("Mars", 12);
        sweets.put("Snickers", 15);
        sweets.put("Bounty", 18);
        sweets.put("Lion", 14);
        sweets.put("Kit Kat", 16);
        sweets.put("Nuts", 20);

        System.out.println(sweets);
        System.out.println("First: " + sweets.pollFirstEntry());
        System.out.println("After: " + sweets);

        System.out.println("Last: " + sweets.pollLastEntry());
        System.out.println("After: " + sweets);

    }
}
