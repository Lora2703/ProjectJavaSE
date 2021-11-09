package ua.intita.qa.homework14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercises {
    public static void main(String[] args) {

        //create a new array list, add some colors (string) and print out
        ArrayList<String> color = new ArrayList<>();
        color.add("black");
        color.add("red");
        color.add("white");
        color.add("green");
        color.add("yellow");
        System.out.println(color);

        //iterate through all elements in an array list.
        for (String element : color){
            System.out.println(element);
        }

        //insert an element into the array list at the first position.
        color.add(0, "purple");
        System.out.println("After inserting at the first position: " + color);

        //retrieve an element (at a specified index) from a given array list.
        System.out.println("Retrieved element: " + color.get(2));

        //update specific array element by given element.
        color.set(1, "grey");
        System.out.println("After updating: " + color);

        //remove the third element from an array list.
        color.remove(2);
        System.out.println("After removing: " + color);

        //search an element in an array list.
        System.out.println(color.get(3));

        //sort a given array list.
        System.out.println("Before sorting: " + color);
        Collections.sort(color);
        System.out.println("After sorting: " + color);

        //copy one array list into another.
        List<String> newColor = new ArrayList<>(color);
        System.out.println("After copying: " + newColor);

        //shuffle elements in an array list.
        Collections.shuffle(color);
        System.out.println("After shuffling: " + color);

        //reverse elements in an array list.
        Collections.reverse(color);
        System.out.println("After reversing: " + color);

        //extract a portion of an array list.
        System.out.println("List: " + color);
        List<String> subColor = color.subList(1,3);
        System.out.println("Sublist: " + subColor);

        //compare two array lists.
        System.out.println("List 1: " + color);
        System.out.println("List 2: " + newColor);
        System.out.println("Are array lists 1 and 2 equal? " + color.equals(newColor));
        List<String> newColor1 = new ArrayList<>(newColor);
        System.out.println("List 3: " + newColor1);
        System.out.println("Are array lists 2 and 3 equal? " + newColor.equals(newColor1));

        //swap two elements in an array list.
        System.out.println("Before swapping "+ color);
        Collections.swap(color, 0, 3);
        System.out.println("After swapping: "+ color);

        //join two array lists.
        color.addAll(newColor);
        System.out.println("After joining: " + color);

        //clone an array list to another array list.
        ArrayList<String> colorClone = (ArrayList<String>)color.clone();
        System.out.println("Cloned array list: " + colorClone);

        //empty an array list.
        colorClone.clear();
        System.out.println(colorClone);

        //test an array list is empty or not.
        System.out.println(colorClone.isEmpty());
        System.out.println(color.isEmpty());

        //trim the capacity of an array list the current list size.
        ArrayList<String> color1 = new ArrayList<>(4);
        System.out.println(color1.size());
        color1.add("white");
        color1.add("blue");
        color1.add("green");
        color1.trimToSize();
        System.out.println(color1.size());

        //increase the size of an array list.
        color1.ensureCapacity(100);
        color1.add("yellow");
        color1.add("red");
        System.out.println(color1);

        //replace the second element of a ArrayList with the specified element.
        System.out.println("Before replacing: " + color);
        color.set(1, "orange");
        System.out.println("After replacing: " + color);

        //print all the elements of a ArrayList using the position of the elements.
        int indexEnd = color.size();
        for (int index = 0; index < indexEnd; index++){
            System.out.println(color.get(index));
        }







    }
}
