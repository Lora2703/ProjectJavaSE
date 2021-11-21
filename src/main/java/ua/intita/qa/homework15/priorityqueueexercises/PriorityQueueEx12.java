package ua.intita.qa.homework15.priorityqueueexercises;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueEx12 {
    public static void main(String[] args) {
        PriorityQueue<String> colorPriorityQueue = new PriorityQueue<>(5, Collections.reverseOrder());
        colorPriorityQueue.add("white");
        colorPriorityQueue.add("black");
        colorPriorityQueue.add("red");
        colorPriorityQueue.add("green");
        colorPriorityQueue.add("yellow");
        System.out.println("Queue: " + colorPriorityQueue);

        System.out.println("Maximum priority:");
        String color = null;
        while ((color = colorPriorityQueue.poll()) != null){
            System.out.println(color);
        }
    }
}
