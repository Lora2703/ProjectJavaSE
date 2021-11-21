package ua.intita.qa.homework15.treesetexercises;

import java.util.TreeSet;

public class TreeSetEx6 {
    public static void main(String[] args) {
        TreeSet<String> colorTreeSet = new TreeSet<>();
        colorTreeSet.add("white");
        colorTreeSet.add("black");
        colorTreeSet.add("red");
        colorTreeSet.add("green");
        colorTreeSet.add("yellow");

        TreeSet<String> colorTreeSet1 = (TreeSet<String>) colorTreeSet.clone();
        System.out.println(colorTreeSet);
        System.out.println(colorTreeSet1);

    }
}
