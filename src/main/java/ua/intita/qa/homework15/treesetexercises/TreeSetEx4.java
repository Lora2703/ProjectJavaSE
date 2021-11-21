package ua.intita.qa.homework15.treesetexercises;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx4 {
    public static void main(String[] args) {
        TreeSet<String> colorTreeSet = new TreeSet<>();
        colorTreeSet.add("white");
        colorTreeSet.add("black");
        colorTreeSet.add("red");
        colorTreeSet.add("green");
        colorTreeSet.add("yellow");

        System.out.println("Ascending: " + colorTreeSet);
        Iterator<String> iterator = colorTreeSet.descendingIterator();
        System.out.println("Descending:");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
