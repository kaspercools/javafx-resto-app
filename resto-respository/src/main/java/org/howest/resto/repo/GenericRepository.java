package org.howest.resto.repo;

import org.howest.resto.domain.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface GenericRepository<PK, T extends BaseEntity> extends Initializable {
    Optional<T> findById(PK id);

    List<T> findAll();

    T update(T entity);

    T insert(T entity);

    void delete(PK id);
}
