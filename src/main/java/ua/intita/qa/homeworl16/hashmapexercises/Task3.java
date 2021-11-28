package ua.intita.qa.homeworl16.hashmapexercises;

import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        HashMap<String, Integer> sweets1 = new HashMap<>();
        sweets1.put("Mars", 12);
        sweets1.put("Snickers", 15);
        sweets1.put("Bounty", 18);

        HashMap<String, Integer> sweets2 = new HashMap<>();
        sweets2.put("Lion", 14);
        sweets2.put("Kit Kat", 16);
        sweets2.put("Nuts", 21);

        System.out.println("First map: " + sweets1);
        System.out.println("Second map: "+ sweets2);
        sweets1.putAll(sweets2);
        System.out.println(sweets1);
    }
}
