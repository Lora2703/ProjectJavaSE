package ua.intita.qa.homework15.hashsetexercises;

import java.util.HashSet;

public class HashSetEx6 {
    public static void main(String[] args) {
        HashSet<String> colorHashSet = new HashSet<>();

        colorHashSet.add("white");
        colorHashSet.add("black");
        colorHashSet.add("red");
        colorHashSet.add("green");
        colorHashSet.add("yellow");

        HashSet<String> colorHashSetClone = new HashSet<>();
        colorHashSetClone = (HashSet) colorHashSet.clone();

        System.out.println(colorHashSet);
        System.out.println("Clone: " + colorHashSetClone);


    }
}
