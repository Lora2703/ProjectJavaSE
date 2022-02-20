package ua.intita.qa.homework21;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
           List<Album> albums = AlbumUtils.getAlbums("data/album.csv");
           AlbumUtils.releaseAfter2000(albums);
           AlbumUtils.sortAlbums(albums);
           AlbumUtils.maxSongCount(albums);
           AlbumUtils.startWithA(albums);
           AlbumUtils.getPerformerAndAlbum(albums);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
