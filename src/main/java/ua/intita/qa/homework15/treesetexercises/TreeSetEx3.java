package ua.intita.qa.homework15.treesetexercises;

import java.util.TreeSet;

public class TreeSetEx3 {
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
        colorTreeSet1.add("violet");
        colorTreeSet1.add("purple");

        colorTreeSet.addAll(colorTreeSet1);
        System.out.println(colorTreeSet);

    }
}
