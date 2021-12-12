package ua.intita.qa.homework17.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Cat extends Pet {
    private String name;
    private String bread;
    private double age;

    public Cat(String id, String name, String bread, double age) {
        super(id);
        this.name = name;
        this.bread = bread;
        this.age = age;
    }
}
