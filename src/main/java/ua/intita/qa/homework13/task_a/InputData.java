package ua.intita.qa.homework13.task_a;

import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        try {
            user.setFirstName(firstName);
            System.out.println("First name is " + user.getFirstName());
        } catch (IllegalNameException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        try {
            user.setLastName(lastName);
            System.out.println("Last name is " + user.getLastName());
        } catch (IllegalNameException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        try {
            user.setAge(age);
            System.out.println("Age is " + user.getAge());
        } catch (IllegalAgeException e) {
            System.out.println(e.getMessage());
        }
        scanner.nextLine();

        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        try {
            user.setEmail(email);
            System.out.println("Email is " + user.getEmail());
        } catch (IllegalEmailException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        try {
            user.setPassword(password);
            System.out.println("Password is " + user.getPassword());
        } catch (IllegalPasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}
