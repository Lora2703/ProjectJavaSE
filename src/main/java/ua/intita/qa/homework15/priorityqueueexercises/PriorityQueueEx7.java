package ua.intita.qa.homework15.priorityqueueexercises;

import java.util.PriorityQueue;

public class PriorityQueueEx7 {
    public static void main(String[] args) {
        PriorityQueue<String> colorPriorityQueue = new PriorityQueue<>();
        colorPriorityQueue.add("white");
        colorPriorityQueue.add("black");
        colorPriorityQueue.add("red");
        colorPriorityQueue.add("green");
        colorPriorityQueue.add("yellow");

        PriorityQueue<String> colorPriorityQueue1 = new PriorityQueue<>();
        colorPriorityQueue1.add("red");
        colorPriorityQueue1.add("green");
        colorPriorityQueue1.add("pink");
        colorPriorityQueue1.add("violet");
        colorPriorityQueue1.add("purple");

        PriorityQueue<String> colorPriorityQueue2 = new PriorityQueue<>();
        colorPriorityQueue2.add("white");
        colorPriorityQueue2.add("black");
        colorPriorityQueue2.add("red");
        colorPriorityQueue2.add("green");
        colorPriorityQueue2.add("yellow");

        System.out.println("First: " + colorPriorityQueue);
        System.out.println("Second: " + colorPriorityQueue1);

        for (String color : colorPriorityQueue){
            System.out.println(colorPriorityQueue1.contains(color));
        }

    }
}
