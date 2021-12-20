package ua.intita.qa.homeworl16.task2.dao;

import ua.intita.qa.homeworl16.task2.entity.Album;
import ua.intita.qa.homeworl16.task2.util.AlbumUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AlbumDao implements CommonDao<Album> {
    private static final Map<String, Album> albums = new HashMap<>();

    static {
        Map<String, Album> stringAlbumMap = AlbumUtils.readDataFromFile("data/album.csv");
        albums.putAll(stringAlbumMap);
    }

    @Override
    public Album save(Album album) {
        Album res = albums.get(album.getAlbumId());
        if (res != null){
            res.setAlbumName(album.getAlbumName());
            res.setPerformerName(album.getPerformerName());
            res.setReleaseYear(album.getReleaseYear());
            res.setSongCount(album.getSongCount());
            album = res;
        }
        albums.put(album.getAlbumId(), album);
        return album;
    }

    @Override
    public Album findById(String id) {
        return albums.get(id);
    }

    @Override
    public Collection<Album> findAll() {
        return albums.values();
    }

    @Override
    public void delete(String id) {
        albums.remove(id);

    }
}
