package ua.intita.qa.homeworl16.hashmapexercises;

import java.util.HashMap;

public class Task10 {
    public static void main(String[] args) {
        HashMap<String, Integer> sweets = new HashMap<>();
        sweets.put("Mars", 12);
        sweets.put("Snickers", 15);
        sweets.put("Bounty", 18);
        sweets.put("Lion", 14);
        sweets.put("Kit Kat", 16);

        Integer value = sweets.get("Lion");
        System.out.println("Value of 'Lion': " + value);
    }
}
