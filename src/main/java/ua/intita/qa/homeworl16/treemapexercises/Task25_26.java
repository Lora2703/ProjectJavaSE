package ua.intita.qa.homeworl16.treemapexercises;

import java.util.TreeMap;

public class Task25_26 {
    public static void main(String[] args) {
        TreeMap<String, Integer> sweets = new TreeMap<>();
        sweets.put("Mars", 12);
        sweets.put("Snickers", 15);
        sweets.put("Bounty", 18);
        sweets.put("Lion", 14);
        sweets.put("Kit Kat", 16);
        sweets.put("Nuts", 20);

        System.out.println(sweets);
        System.out.println(sweets.ceilingEntry("Lion"));
        System.out.println(sweets.ceilingEntry("Roshen"));
        System.out.println(sweets.ceilingEntry("Tic Tac"));

        System.out.println(sweets.ceilingKey("Lion"));
        System.out.println(sweets.ceilingKey("Tic Tac"));
    }
}
