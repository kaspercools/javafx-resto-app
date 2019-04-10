package org.howest.resto.repo.impl;

import org.howest.resto.domain.BaseEntity;
import org.howest.resto.repo.GenericRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class GenericRepositoryImpl<PK, T extends BaseEntity> implements GenericRepository<PK, T> {
    protected Set<T> entityCollection;

    public GenericRepositoryImpl() {
        entityCollection = new HashSet<T>();
    }

    public Optional<T> findById(PK id) {
        return entityCollection.stream().filter(entity -> entity.getId() == id).findFirst();
    }

    public List<T> findAll() {
        return entityCollection.stream().collect(Collectors.toList());
    }

    public T update(T entity) {
        entityCollection.add(entity);
        return entity;
    }

    public T insert(T entity) {
        if (entity.getId() > 0) {
            entityCollection.add(entity);
            return entity;
        }
        return null;
    }

    public void delete(PK id) {
        entityCollection.remove(entityCollection.stream().filter(entity -> entity.getId() == id).findFirst().get());
    }
}
