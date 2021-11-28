package ua.intita.qa.homeworl16.treemapexercises;

import java.util.TreeMap;

public class Task8 {
    public static void main(String[] args) {
        TreeMap<String, Integer> sweets = new TreeMap<>();
        sweets.put("Mars", 12);
        sweets.put("Snickers", 15);
        sweets.put("Bounty", 18);
        sweets.put("Lion", 14);
        sweets.put("Kit Kat", 16);

        System.out.println(sweets);
        System.out.println("Greatest: " + sweets.firstEntry());
        System.out.println("Least: " + sweets.lastEntry());
    }
}
