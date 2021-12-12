package ua.intita.qa.homeworl16.task2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@AllArgsConstructor
@Data
@ToString
public class Album {
    private String albumId;
    private String performerName;
    private String albumName;
    private String releaseYear;
    private String songCount;

    public Album(){
        albumId = UUID.randomUUID().toString();
    }


}
