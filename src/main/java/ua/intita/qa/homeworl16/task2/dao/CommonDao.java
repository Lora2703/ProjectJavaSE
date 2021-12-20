package ua.intita.qa.homeworl16.task2.dao;

import ua.intita.qa.homeworl16.task2.entity.Entity;

import java.util.Collection;

public interface CommonDao <T extends Entity>{

    T save(T entity);

    T findById (String id);

    Collection<T> findAll();

    void delete(String id);

}
