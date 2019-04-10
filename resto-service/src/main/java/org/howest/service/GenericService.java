package org.howest.service;

import java.util.List;

interface GenericService<T> {
    T add(T entity);

    T update(T entity);

    void delete(T entity);

    T getById(T entity);

    List<T> getAll();
}
