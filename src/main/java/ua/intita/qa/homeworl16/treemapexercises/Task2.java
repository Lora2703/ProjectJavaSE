package ua.intita.qa.homeworl16.treemapexercises;

import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> sweets = new TreeMap<>();
        sweets.put("Mars", 12);
        sweets.put("Snickers", 15);
        sweets.put("Bounty", 18);
        TreeMap<String, Integer> sweets1 = new TreeMap<>();
        sweets1.put("Lion", 14);
        sweets1.put("Kit Kat", 16);
        sweets1.put("Nuts", 20);

        System.out.println(sweets);
        System.out.println(sweets1);
        sweets.putAll(sweets1);
        System.out.println(sweets);

    }
}
