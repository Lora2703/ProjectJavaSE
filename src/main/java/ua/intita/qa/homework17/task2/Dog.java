package ua.intita.qa.homework17.task2;

import lombok.ToString;

@ToString
public class Dog extends Pet{
    private String name;
    private String bread;
    private double age;

    public Dog(String id, String name, String bread, double age) {
        super(id);
        this.name = name;
        this.bread = bread;
        this.age = age;
    }

    public Dog(String name, String bread, double age) {
        this.name = name;
        this.bread = bread;
        this.age = age;
    }
}
