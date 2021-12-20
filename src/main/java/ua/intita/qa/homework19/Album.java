package ua.intita.qa.homework19;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@ToString
public class Album implements Serializable {
    private String albumId;
    private String performerName;
    private String albumName;
    private String releaseYear;
    private String songCount;

    public Album(){
        albumId = UUID.randomUUID().toString();
    }
}
