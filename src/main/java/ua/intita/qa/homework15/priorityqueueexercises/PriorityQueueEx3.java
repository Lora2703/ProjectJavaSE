package ua.intita.qa.homework15.priorityqueueexercises;

import java.util.PriorityQueue;

public class PriorityQueueEx3 {
    public static void main(String[] args) {
        PriorityQueue<String> colorPriorityQueue = new PriorityQueue<>();
        colorPriorityQueue.add("white");
        colorPriorityQueue.add("black");
        colorPriorityQueue.add("red");
        colorPriorityQueue.add("green");
        colorPriorityQueue.add("yellow");

        PriorityQueue<String> colorPriorityQueue1 = new PriorityQueue<>();
        colorPriorityQueue1.add("brown");
        colorPriorityQueue1.add("green");
        colorPriorityQueue1.add("pink");
        colorPriorityQueue1.add("violet");
        colorPriorityQueue1.add("purple");

        System.out.println(colorPriorityQueue);
        System.out.println(colorPriorityQueue1);
        colorPriorityQueue.addAll(colorPriorityQueue1);
        System.out.println(colorPriorityQueue);
    }
}
