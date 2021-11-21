package ua.intita.qa.homework15.treesetexercises;

import java.util.TreeSet;

public class TreeSetEx8 {
    public static void main(String[] args) {
        TreeSet<String> colorTreeSet = new TreeSet<>();
        colorTreeSet.add("white");
        colorTreeSet.add("black");
        colorTreeSet.add("red");
        colorTreeSet.add("green");
        colorTreeSet.add("yellow");

        TreeSet<String> colorTreeSet1 = new TreeSet<>();
        colorTreeSet1.add("brown");
        colorTreeSet1.add("green");
        colorTreeSet1.add("pink");
        colorTreeSet1.add("white");
        colorTreeSet1.add("purple");

        System.out.println(colorTreeSet);
        System.out.println(colorTreeSet1);
        System.out.println(colorTreeSet.equals(colorTreeSet1));

    }
}
