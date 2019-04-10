package org.howest.service.impl;

import org.howest.resto.domain.Table;
import org.howest.resto.repo.RestoRepositoryProvider;
import org.howest.resto.repo.TableRepository;
import org.howest.service.TableService;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class TableServiceImpl implements TableService {
    private final TableRepository tableRepository;

    public TableServiceImpl() {
        RestoRepositoryProvider repoProvider = RestoRepositoryProvider.getInstance();
        this.tableRepository = (TableRepository) repoProvider.getRepository(TableRepository.class).get();
    }

    @Override
    public Table add(Table entity) {
        /* FIXME Validate and add a new Table
           - If this is the 21st table we should throw an exception!
                - we can only add 20 tables
         */

        throw new NotImplementedException();
    }

    @Override
    public Table update(Table entity) {
        // TODO Validate and update Table
        throw new NotImplementedException();
    }

    @Override
    public void delete(Table entity) {
        // TODO Validate and delete Table
        throw new NotImplementedException();
    }

    @Override
    public Table getById(Table entity) {
        // TODO get a Table by his id
        throw new NotImplementedException();
    }

    @Override
    public List<Table> getAll() {
        return tableRepository.findAll();
    }
}
