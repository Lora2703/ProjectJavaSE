package ua.intita.qa.homework21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AlbumUtils {

    public static List<Album> getAlbums(String filename) throws FileNotFoundException {
        List<Album> albums;
        BufferedReader bis = new BufferedReader((new FileReader(filename)));
        albums = bis.lines().map(s -> s.split(",")).map(s -> {
            Album album = new Album();
            album.setAlbumId(s[0]);
            album.setAlbumName(s[1]);
            album.setPerformerName(s[2]);
            album.setReleaseYear(s[3]);
            album.setSongCount(s[4]);
            return album;
        }).collect(Collectors.toList());
        albums.forEach(System.out::println);
        return albums;
    }

    public static List<Album> releaseAfter2000(List<Album> albums) {
        List<Album> albumsAfter2000;
        albumsAfter2000 = albums.stream().filter(alb -> Integer.parseInt(
                alb.getReleaseYear()) > 2005).collect(Collectors.toList());
        System.out.println();
        albumsAfter2000.forEach(System.out::println);
        return albumsAfter2000;
    }

    public static List<Album> sortAlbums(List<Album> albums) {
        List<Album> sortedAlbums;
        sortedAlbums = albums.stream().sorted(Comparator.comparing(Album::getReleaseYear)).collect(Collectors.toList());
        System.out.println();
        sortedAlbums.forEach(System.out::println);
        return sortedAlbums;
    }

    public static Album maxSongCount(List<Album> albums) {
        Optional<Album> albumWithMaxSongCount = albums.stream().max(Comparator.comparing(Album::getSongCount));
        if (albumWithMaxSongCount.isPresent()) {
            System.out.println("\n" + albumWithMaxSongCount.get());
        }
        return albumWithMaxSongCount.get();

    }

    public static List<Album> startWithA(List<Album> albums) {
        List<Album> albumStartWithA;
        albumStartWithA = albums.stream().filter(album -> album.getAlbumName().startsWith("A")).collect(Collectors.toList());
        System.out.println();
        albumStartWithA.forEach(System.out::println);
        return albumStartWithA;
    }

    public static List<PerformerAndAlbum> getPerformerAndAlbum(List<Album> albums) {
        List<PerformerAndAlbum> performerAndAlbums;
        performerAndAlbums = albums.stream().map(album -> new PerformerAndAlbum(album.getPerformerName(), album.getAlbumName()))
                .collect(Collectors.toList());
        performerAndAlbums.forEach(System.out::println);
        return performerAndAlbums;
    }
}


   