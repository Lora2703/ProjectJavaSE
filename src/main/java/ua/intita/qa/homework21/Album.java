package ua.intita.qa.homework21;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Getter
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
