package ua.intita.qa.homeworl16.task2.dao;

import ua.intita.qa.homeworl16.task2.entity.Album;

import java.util.Collection;

public interface CommonDao <T>{

    T save(T entity);

    T findById (String id);

    Collection<Album> findAll();

    void delete(String id);

}
