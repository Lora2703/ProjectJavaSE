package ua.intita.qa.homework17.task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
            System.out.println("Input name:");
            String name = scanner.next();
            System.out.println("Input bread:");
            String bread = scanner.next();
            System.out.println("Input age:");
            double age = scanner.nextDouble();
            Pet pet = new Cat(name, bread, age);
            pets.put(name, pet);
        scanner.nextLine();

        System.out.println("Input name:");
        String name1 = scanner.nextLine();
        System.out.println("Input bread:");
        String bread1 = scanner.nextLine();
        System.out.println("Input age:");
        double age1 = scanner.nextDouble();
        Pet pet1 = new Dog(name1, bread1, age1);
        pets.put(name1, pet1);
        scanner.nextLine();


        System.out.println("Input name:");
        String name2 = scanner.nextLine();
        System.out.println("Input age:");
        double age2 = scanner.nextDouble();
        Pet pet2 = new Parrot(name2, age2);
        pets.put(name2, pet2);
        scanner.nextLine();

        Iterator<String> iterator = pets.keySet().iterator();
        while (iterator.hasNext()){
            name = iterator.next();
            System.out.println(name + " " + pets.get(name));
        }

    }
}
