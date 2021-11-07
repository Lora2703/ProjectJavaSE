package ua.intita.qa.homework13.task_a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String password;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws IllegalNameException {
        Pattern pattern = Pattern.compile("[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(firstName);
        boolean found = matcher.matches();
        if (found) {
            this.firstName = firstName;
        } else {
            throw new IllegalNameException("You should enter the letters only, first letter must be uppercase");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws IllegalNameException {
        Pattern pattern = Pattern.compile("[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(lastName);
        boolean found = matcher.matches();
        if (found) {
            this.lastName = lastName;
        } else {
            throw new IllegalNameException("You should enter the letters only, first letter must be uppercase");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age > 0 && age <= 150) {
            this.age = age;
        } else {
            throw new IllegalAgeException("You should enter the numbers from 1 to 150");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalEmailException {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9]+(\\.[_A-Za-z0-9]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);
        boolean found = matcher.matches();
        if (found) {
            this.email = email;
        } else {
            throw new IllegalEmailException("Email is not valid");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws IllegalPasswordException {
        Pattern pattern = Pattern.compile("[A-Za-z0-9]{10,}");
        Matcher matcher = pattern.matcher(password);
        boolean found = matcher.matches();
        if (found) {
            this.password = password;
        } else {
            throw new IllegalPasswordException("You should enter 10 or more characters: uppercase, lowercase letters and numbers");
        }
    }
}
