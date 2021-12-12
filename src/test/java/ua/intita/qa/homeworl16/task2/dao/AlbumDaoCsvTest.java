package ua.intita.qa.homeworl16.task2.dao;

import org.junit.Test;
import ua.intita.qa.homeworl16.task2.entity.Album;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AlbumDaoCsvTest {

    private final CommonDao<Album> dao = new AlbumDao();

    @Test
    public void save() {
        Map<String, Album> albums = new HashMap<>();
        String csvFile = "data/album.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))) {
            while ((line = bufferedReader.readLine()) != null) {
                String[] album = line.split(csvSplitBy);
                albums.put(album[0], new Album(album[0], album[1], album[2], album[3], album[4]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(albums.values());


        System.out.println("Save");
        Map<String, Album> savedAlbum = new HashMap<>();
        for (String id : albums.keySet()) {
            savedAlbum.put(id, dao.save(albums.get(id)));
        }
        System.out.println(savedAlbum.values());


        System.out.println("FindAll");
        Collection<Album> allAlbums = dao.findAll();
        for (Album album : allAlbums) {
            System.out.println(album);
        }

        System.out.println("FindByID");
        for (String id : savedAlbum.keySet()) {
            Album albumById = dao.findById(id);
            System.out.println(albumById);
        }


        System.out.println("Delete");
        Iterator<String> iterator = savedAlbum.keySet().iterator();
        while (iterator.hasNext()) {
            dao.delete(iterator.next());

        }
        System.out.println(allAlbums);
    }
}
