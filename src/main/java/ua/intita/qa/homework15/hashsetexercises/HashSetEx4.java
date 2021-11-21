package ua.intita.qa.homework15.hashsetexercises;

import java.util.HashSet;

public class HashSetEx4 {
    public static void main(String[] args) {
        HashSet<String> colorHashSet = new HashSet<>();

        colorHashSet.add("white");
        colorHashSet.add("black");
        colorHashSet.add("red");
        colorHashSet.add("green");
        colorHashSet.add("yellow");

        System.out.println("Before removing: " + colorHashSet);
        System.out.println("After removing: " + colorHashSet.removeAll(colorHashSet));
    }
}
