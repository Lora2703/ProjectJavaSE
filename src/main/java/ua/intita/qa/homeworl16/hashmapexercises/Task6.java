package ua.intita.qa.homeworl16.hashmapexercises;

import java.util.HashMap;

public class Task6 {
    public static void main(String[] args) {
        HashMap<String, Integer> sweets = new HashMap<>();
        sweets.put("Mars", 12);
        sweets.put("Snickers", 15);
        sweets.put("Bounty", 18);
        sweets.put("Lion", 14);
        sweets.put("Kit Kat", 16);

        HashMap<String, Integer> sweets1 = new HashMap<>(sweets);
        HashMap<String, Integer> sweets2 = (HashMap<String, Integer>) sweets.clone();

        System.out.println(sweets);
        System.out.println(sweets1);
        System.out.println(sweets2);
    }
}
