package ua.intita.qa.homework15.treesetexercises;

import java.util.TreeSet;

public class TreeSetEx7 {
    public static void main(String[] args) {
        TreeSet<String> colorTreeSet = new TreeSet<>();
        colorTreeSet.add("white");
        colorTreeSet.add("black");
        colorTreeSet.add("red");
        colorTreeSet.add("green");
        colorTreeSet.add("yellow");

        System.out.println(colorTreeSet);
        System.out.println("Size: " + colorTreeSet.size());
    }
}
