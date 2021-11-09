package ua.intita.qa.homework14;

import java.util.*;

public class LinkedListExercises {
    public static void main(String[] args) {

        //append the specified element to the end of a linked list.
        LinkedList<String> color = new LinkedList<>();
        color.add("yellow");
        color.add("red");
        color.add("blue");
        color.add("white");
        color.add("black");
        System.out.println(color);

        //iterate through all elements in a linked list.
        Iterator<String> iterator = color.iterator();
        System.out.println("Iterate through all elements:");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //iterate through all elements in a linked list starting at the specified position.
        ListIterator<String> iterator1 = color.listIterator(2);
        System.out.println("Iterate starting at the specified position:");
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        //iterate a linked list in reverse order.
        Iterator<String> iterator2 = color.descendingIterator();
        System.out.println("Iterate in reverse order");
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        ListIterator<String> iterator3 = color.listIterator(color.size());
        System.out.println("Iterate in reverse order");
        while (iterator3.hasPrevious()){
            System.out.println(iterator3.previous());
        }

        //insert the specified element at the specified position in the linked list.
        color.add(3, "orange");
        System.out.println("After insertion: " + color);

        //insert elements into the linked list at the first and last position.
        color.addFirst("pink");
        color.addLast("brown");
        System.out.println("After insertion at the first and last positions: " + color);

        //insert the specified element at the front of a linked list.
        color.offerFirst("violet");
        System.out.println("After inserting at the front: " + color);

        //insert the specified element at the end of a linked list.
        color.offerLast("purple");
        System.out.println("After inserting at the end: " + color);

        //insert some elements at the specified position into a linked list.
        color.add(1,"blue");
        System.out.println(" After inserting: " + color);

        //get the first and last occurrence of the specified elements in a linked list.
        System.out.println("First occurrence: " + color.indexOf("blue"));
        System.out.println("Last occurrence: " + color.lastIndexOf("blue"));

        //display the elements and their positions in a linked list.
        int size = color.size();
        for (int i = 0; i < size; i++){
            System.out.println("Element " + color.get(i) + " position "+ i);
        }

        //remove a specified element from a linked list.
        color.remove(5);
        System.out.println("After removing: " + color);

        //remove first and last element from a linked list.
        color.removeFirst();
        color.removeLast();
        System.out.println("After removing first and last elements: " + color);

        //remove all the elements from a linked list.
        LinkedList<String> color1 = (LinkedList<String>) color.clone();
        System.out.println("Before removing all the elements: " + color1);
        color1.clear();
        System.out.println("After removing all the elements: " + color1);

        //swap two elements in a linked list.
        System.out.println("Before swapping: " + color);
        Collections.swap(color, 2, 4);
        System.out.println("After swapping: " + color);

        //shuffle the elements in a linked list.
        System.out.println("Before shuffle: " + color);
        Collections.shuffle(color);
        System.out.println("After shuffle: " + color);

        //join two linked lists.
        LinkedList<String> color2 = new LinkedList<>();
        color2.add("dark");
        color2.add("light");
        System.out.println("Linked list 1: " + color);
        System.out.println("Linked list 2: " + color2);
        color.addAll(color2);
        System.out.println("After joining: " + color);

        //clone a linked list to another linked list.
        LinkedList<String> color3 = (LinkedList<String>) color.clone();
        System.out.println("Cloned list: " + color3);

        //remove and return the first element of a linked list.
        System.out.println("Removing first element: " + color.removeFirst());
        System.out.println("After removing: " + color);

        //retrieve but does not remove, the first element of a linked list.
        System.out.println("First element: " + color.peekFirst());
        System.out.println("List after: "+ color);

        //retrieve but does not remove, the last element of a linked list.
        System.out.println("Last element: " + color.peekLast());
        System.out.println("List after: "+ color);

        //check if a particular element exists in a linked list.
        System.out.println(color.contains("orange"));
        System.out.println(color.contains("black"));

        //convert a linked list to array list.
        List<String> newColor = new ArrayList<>(color);
        System.out.println("Array List: ");
        for (String str : newColor){
            System.out.println(str);
        }

        //compare two linked lists.
        if (color.equals(newColor)){
            System.out.println("This linked lists is equal");
        }
        else{
            System.out.println("This linked lists is not equal");
        }
        System.out.println(color.equals(color1));

        //test a linked list is empty or not.
        if (color1.isEmpty()){
            System.out.println("Linked list is empty");
        }
        else System.out.println("Linked list is not empty");

        //replace an element in a linked list.
        color.set(5, "marsala");
        System.out.println("After replacing: " + color);



    }
}
