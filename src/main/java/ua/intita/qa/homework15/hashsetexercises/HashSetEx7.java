package ua.intita.qa.homework15.hashsetexercises;

import java.util.HashSet;

public class HashSetEx7 {
    public static void main(String[] args) {
        HashSet<String> colorHashSet = new HashSet<>();

        colorHashSet.add("white");
        colorHashSet.add("black");
        colorHashSet.add("red");
        colorHashSet.add("green");
        colorHashSet.add("yellow");

        String[] colorArray = new String[colorHashSet.size()];
        colorHashSet.toArray(colorArray);

        System.out.println("Set: " + colorHashSet);
        System.out.println("Array:");
        for (String arr : colorArray){
            System.out.println(arr);
        }
    }
}
