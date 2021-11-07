package ua.intita.qa.homework13.task_b;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Clothes<T, S> {
    private String name;
    private T gender;
    private S size;
    private String colour;
}
