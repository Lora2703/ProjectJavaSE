package ua.intita.qa.homework17.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class Pet {
    private String id;

    public Pet() {
        id = UUID.randomUUID().toString();

    }
}
