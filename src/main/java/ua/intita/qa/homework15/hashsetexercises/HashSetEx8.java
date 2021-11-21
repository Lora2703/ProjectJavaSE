package ua.intita.qa.homework15.hashsetexercises;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetEx8 {
    public static void main(String[] args) {
        HashSet<String> colorHashSet = new HashSet<>();

        colorHashSet.add("white");
        colorHashSet.add("black");
        colorHashSet.add("red");
        colorHashSet.add("green");
        colorHashSet.add("yellow");

        TreeSet<String> colorTreeSet = new TreeSet<>(colorHashSet);

        System.out.println("HashSet: " + colorHashSet);
        System.out.println("TreeSet: " + colorTreeSet);
    }
}
