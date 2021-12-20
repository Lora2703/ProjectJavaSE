package ua.intita.qa.homeworl16.task2.service;

import ua.intita.qa.homeworl16.task2.dao.CommonDao;
import ua.intita.qa.homeworl16.task2.entity.Album;

import java.util.Collection;

public class AlbumService {
    private CommonDao<Album> commonDao;

    public Album findAlbumByAlbumName(String albumName) {
        Collection<Album> albums = commonDao.findAll();
        for (Album album : albums){
            if (album.getAlbumName().equals(albumName)){
                return album;
            }
        }
        return null;
    }

    public AlbumService(CommonDao<Album> commonDao) {
        this.commonDao = commonDao;
    }
}
