package ua.intita.qa.homework15.hashsetexercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetEx9 {
    public static void main(String[] args) {
        HashSet<String> colorHashSet = new HashSet<>();

        colorHashSet.add("white");
        colorHashSet.add("black");
        colorHashSet.add("red");
        colorHashSet.add("green");
        colorHashSet.add("yellow");

        List<String> colorArrayList = new ArrayList<>(colorHashSet);

        System.out.println("HashSet: " + colorHashSet);
        System.out.println("ArrayList: " + colorArrayList);
    }
}
