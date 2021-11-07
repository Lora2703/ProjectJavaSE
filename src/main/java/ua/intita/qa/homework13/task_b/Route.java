package ua.intita.qa.homework13.task_b;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Route<N, D, T> {
    private N name;
    private D difficulty;
    private T length;
}
