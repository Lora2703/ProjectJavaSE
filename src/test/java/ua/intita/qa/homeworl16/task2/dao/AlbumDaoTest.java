package ua.intita.qa.homeworl16.task2.dao;

import org.junit.Test;
import ua.intita.qa.homeworl16.task2.entity.Album;

import java.util.Collection;

import static org.junit.Assert.*;

public class AlbumDaoTest {

    private final CommonDao <Album> dao = new AlbumDao();

    @Test
    public void save() {
        Album album1 = new Album();
        Album album2 = new Album();
        Album album3 = new Album();

        album1.setAlbumName("The wall");
        album1.setPerformerName("Pink Floyd");
        album1.setReleaseYear(1979);
        album1.setSongCount(26);

        album2.setAlbumName("The Miracle");
        album2.setPerformerName("Queen");
        album2.setReleaseYear(1989);
        album2.setSongCount(10);

        album3.setAlbumName("Equinox");
        album3.setPerformerName("Aquarium");
        album3.setReleaseYear(1988);
        album3.setSongCount(10);

        System.out.println("Save");
        Album savedAlbum1 = dao.save(album1);
        Album savedAlbum2 = dao.save(album2);
        Album savedAlbum3 = dao.save(album3);
        System.out.println(savedAlbum1);
        System.out.println(savedAlbum2);
        System.out.println(savedAlbum3);
        album1.setAlbumName("The Wall (2 discs)");
        savedAlbum1 = dao.save(album1);
        System.out.println(savedAlbum1);

        System.out.println("FindAll");
        Collection<Album> allAlbums = dao.findAll();
        for (Album album : allAlbums) {
            System.out.println(album);
        }

        System.out.println("FindByID");
        Album albumById = dao.findById(savedAlbum1.getAlbumId());
        System.out.println(albumById);
        album1.setAlbumName("The Wall");
        savedAlbum1 = dao.save(album1);
        albumById = dao.findById(savedAlbum1.getAlbumId());
        System.out.println(albumById);

        System.out.println("Delete");
        dao.delete(savedAlbum2.getAlbumId());
        allAlbums = dao.findAll();
        for(Album album : allAlbums){
            System.out.println(album);
        }




    }
}