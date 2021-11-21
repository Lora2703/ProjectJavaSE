package ua.intita.qa.homework15.hashsetexercises;

import java.util.HashSet;

public class HashSetEx10 {
    public static void main(String[] args) {
        HashSet<String> colorHashSet1 = new HashSet<>();
        colorHashSet1.add("white");
        colorHashSet1.add("black");
        colorHashSet1.add("red");
        colorHashSet1.add("green");
        colorHashSet1.add("yellow");

        HashSet<String> colorHashSet2 = new HashSet<>();
        colorHashSet2.add("brown");
        colorHashSet2.add("green");
        colorHashSet2.add("pink");
        colorHashSet2.add("violet");
        colorHashSet2.add("purple");

        HashSet<String> colorHashSet3 = new HashSet<>();
        colorHashSet3.add("white");
        colorHashSet3.add("black");
        colorHashSet3.add("red");
        colorHashSet3.add("green");
        colorHashSet3.add("yellow");

        System.out.println("Is HashSet1 equals HashSet2? " + colorHashSet1.equals(colorHashSet2));
        System.out.println("Is HashSet1 equals HashSet3? " + colorHashSet1.equals(colorHashSet3));




    }
}
