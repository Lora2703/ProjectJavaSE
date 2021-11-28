package ua.intita.qa.homeworl16.treemapexercises;

import java.util.SortedMap;
import java.util.TreeMap;

public class Task21 {
    public static void main(String[] args) {
        TreeMap<String, Integer> sweets = new TreeMap<>();
        sweets.put("Mars", 12);
        sweets.put("Snickers", 15);
        sweets.put("Bounty", 18);
        sweets.put("Lion", 14);
        sweets.put("Kit Kat", 16);
        sweets.put("Nuts", 20);

        System.out.println(sweets);
        SortedMap<String, Integer> subSweets = new TreeMap<>();
        subSweets = sweets.subMap("Kit Kat", "Nuts");
        System.out.println(subSweets);

    }
}
