package ua.intita.qa.homeworl16.hashmapexercises;

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        HashMap<String, Integer> sweets = new HashMap<>();
        sweets.put("Mars", 12);
        sweets.put("Snickers", 15);
        sweets.put("Bounty", 18);
        sweets.put("Lion", 14);
        sweets.put("Kit Kat", 16);

        System.out.println("Before removing: " + sweets);
        System.out.println("Is empty? " + sweets.isEmpty());
        sweets.clear();
        System.out.println("After removing: " + sweets);
        System.out.println("Is empty? " + sweets.isEmpty());
    }
}
