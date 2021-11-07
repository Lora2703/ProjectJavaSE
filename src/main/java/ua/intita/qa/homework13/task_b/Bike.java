package ua.intita.qa.homework13.task_b;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Bike<T> {
    private String name;
    private T frameSize;
    private int transmissionNumber;
    private int wheelSize;
}
