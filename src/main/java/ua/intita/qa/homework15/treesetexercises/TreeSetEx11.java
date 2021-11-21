package ua.intita.qa.homework15.treesetexercises;

import java.util.TreeSet;

public class TreeSetEx11 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(28);
        treeSet.add(3);
        treeSet.add(42);
        treeSet.add(12);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(34);
        treeSet.add(96);
        treeSet.add(10);

        System.out.println("Less or equals 40: " + treeSet.floor(40));
        System.out.println("Less or equals 96: " + treeSet.floor(96));

    }
}
