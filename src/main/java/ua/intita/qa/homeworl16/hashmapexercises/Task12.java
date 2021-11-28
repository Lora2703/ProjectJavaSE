package ua.intita.qa.homeworl16.hashmapexercises;

import java.util.Collection;
import java.util.HashMap;

public class Task12 {
    public static void main(String[] args) {
        HashMap<String, Integer> sweets = new HashMap<>();
        sweets.put("Mars", 12);
        sweets.put("Snickers", 15);
        sweets.put("Bounty", 18);
        sweets.put("Lion", 14);
        sweets.put("Kit Kat", 16);

        Collection <Integer> sweetsValues = sweets.values();
        System.out.println(sweetsValues);
    }
}
