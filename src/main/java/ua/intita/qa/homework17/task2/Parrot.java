package ua.intita.qa.homework17.task2;

import lombok.ToString;

@ToString
public class Parrot extends Pet{
    private String name;
    private double age;

    public Parrot(String id, String name, double age) {
        super(id);
        this.name = name;
        this.age = age;
    }

    public Parrot(String name, double age) {
        this.name = name;
        this.age = age;
    }
}
