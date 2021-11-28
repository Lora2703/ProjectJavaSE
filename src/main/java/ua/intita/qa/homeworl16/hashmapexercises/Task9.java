package ua.intita.qa.homeworl16.hashmapexercises;

import java.util.HashMap;
import java.util.Set;

public class Task9 {
    public static void main(String[] args) {
        HashMap<String, Integer> sweets = new HashMap<>();
        sweets.put("Mars", 12);
        sweets.put("Snickers", 15);
        sweets.put("Bounty", 18);
        sweets.put("Lion", 14);
        sweets.put("Kit Kat", 16);

        Set sweetsSet= sweets.entrySet();
        System.out.println("Set: " + sweetsSet);
    }
}
