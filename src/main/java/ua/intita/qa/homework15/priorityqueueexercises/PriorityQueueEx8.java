package ua.intita.qa.homework15.priorityqueueexercises;

import java.util.PriorityQueue;

public class PriorityQueueEx8 {
    public static void main(String[] args) {
        PriorityQueue<String> colorPriorityQueue = new PriorityQueue<>();
        colorPriorityQueue.add("white");
        colorPriorityQueue.add("black");
        colorPriorityQueue.add("red");
        colorPriorityQueue.add("green");
        colorPriorityQueue.add("yellow");

        System.out.println(colorPriorityQueue);
        System.out.println("First color: " + colorPriorityQueue.peek());
        System.out.println(colorPriorityQueue);
    }
}
