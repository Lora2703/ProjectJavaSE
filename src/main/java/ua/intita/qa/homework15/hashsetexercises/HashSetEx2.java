package ua.intita.qa.homework15.hashsetexercises;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<String> colorHashSet = new HashSet<>();

        colorHashSet.add("white");
        colorHashSet.add("black");
        colorHashSet.add("red");
        colorHashSet.add("green");
        colorHashSet.add("yellow");

        Iterator<String> iterator = colorHashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
