package ua.intita.qa.homework15.hashsetexercises;

import java.util.HashSet;

public class HashSetEx11 {
    public static void main(String[] args) {
        HashSet<String> colorHashSet1 = new HashSet<>();
        colorHashSet1.add("white");
        colorHashSet1.add("black");
        colorHashSet1.add("red");
        colorHashSet1.add("green");
        colorHashSet1.add("yellow");

        HashSet<String> colorHashSet2 = new HashSet<>();
        colorHashSet2.add("yellow");
        colorHashSet2.add("green");
        colorHashSet2.add("pink");
        colorHashSet2.add("violet");
        colorHashSet2.add("purple");

        System.out.println("HasSet1: " + colorHashSet1);
        System.out.println("HasSet2: " + colorHashSet2);
        colorHashSet1.retainAll(colorHashSet2);
        System.out.println("The same elements: " + colorHashSet1);
    }
}
