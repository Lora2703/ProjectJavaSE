package ua.intita.qa.homeworl16.task2.util;

import ua.intita.qa.homeworl16.task2.entity.Album;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AlbumUtils {
    private AlbumUtils() {
    }

    public static Map<String, Album> readDataFromFile(String fileName) {
        Map<String, Album> albums = new HashMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String str = null;
            while ((str = reader.readLine()) != null) {
                String[] split = str.split(",");
                albums.put(split[0], new Album(split[0], split[1], split[2], split[3], split[4]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return albums;
    }
}
