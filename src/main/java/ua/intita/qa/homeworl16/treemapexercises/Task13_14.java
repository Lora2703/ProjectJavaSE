package ua.intita.qa.homeworl16.treemapexercises;

import java.util.TreeMap;

public class Task13_14 {
    public static void main(String[] args) {
        TreeMap<String, Integer> sweets = new TreeMap<>();
        sweets.put("Mars", 12);
        sweets.put("Snickers", 15);
        sweets.put("Bounty", 18);
        sweets.put("Lion", 14);
        sweets.put("Kit Kat", 16);
        sweets.put("Nuts", 20);

        System.out.println(sweets);
        System.out.println("Head Map for 'Lion': " + sweets.headMap("Lion"));
        System.out.println("Head Map for 'Superfood': " + sweets.headMap("Superfood"));

        System.out.println("Head Map for 'Lion' (including): " + sweets.headMap("Lion", true));
        System.out.println("Head Map for 'Superfood' (including): " + sweets.headMap("Superfood", true));
    }
}
