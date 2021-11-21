package ua.intita.qa.homework15.treesetexercises;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<String> colorTreeSet = new TreeSet<>();

        colorTreeSet.add("white");
        colorTreeSet.add("black");
        colorTreeSet.add("red");
        colorTreeSet.add("green");
        colorTreeSet.add("yellow");

        for (String color : colorTreeSet){
            System.out.println(color);
        }
    }
}
