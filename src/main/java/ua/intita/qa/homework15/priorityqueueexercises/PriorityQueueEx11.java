package ua.intita.qa.homework15.priorityqueueexercises;

import java.util.PriorityQueue;

public class PriorityQueueEx11 {
    public static void main(String[] args) {
        PriorityQueue<String> colorPriorityQueue = new PriorityQueue<>();
        colorPriorityQueue.add("white");
        colorPriorityQueue.add("black");
        colorPriorityQueue.add("red");
        colorPriorityQueue.add("green");
        colorPriorityQueue.add("yellow");
        System.out.println("Queue: " + colorPriorityQueue);

        System.out.println("String: " + colorPriorityQueue.toString());
    }
}
