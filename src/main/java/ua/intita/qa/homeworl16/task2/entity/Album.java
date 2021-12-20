package ua.intita.qa.homeworl16.task2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.UUID;

@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class Album extends Entity{
    private String albumId;
    private String performerName;
    private String albumName;
    private String releaseYear;
    private String songCount;

    public Album(){
        albumId = UUID.randomUUID().toString();
    }

}
