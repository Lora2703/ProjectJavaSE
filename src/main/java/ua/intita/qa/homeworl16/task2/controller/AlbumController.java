package ua.intita.qa.homeworl16.task2.controller;

import ua.intita.qa.homeworl16.task2.dao.AlbumDao;
import ua.intita.qa.homeworl16.task2.dao.CommonDao;
import ua.intita.qa.homeworl16.task2.entity.Album;
import ua.intita.qa.homeworl16.task2.service.AlbumService;

public class AlbumController {
    private AlbumService albumService;

    public AlbumController(){
        CommonDao<Album> albumDao = new AlbumDao();
        albumService = new AlbumService(albumDao);

    }
}
