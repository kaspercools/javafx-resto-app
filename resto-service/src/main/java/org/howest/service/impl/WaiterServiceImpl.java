package org.howest.service.impl;

import org.howest.resto.domain.Waiter;
import org.howest.resto.repo.RestoRepositoryProvider;
import org.howest.resto.repo.WaiterRepository;
import org.howest.service.WaiterService;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class WaiterServiceImpl implements WaiterService {

    private final WaiterRepository waiterRepository;

    public WaiterServiceImpl() {
        this.waiterRepository = (WaiterRepository) RestoRepositoryProvider.getInstance().getRepository(WaiterRepository.class).get();
    }

    @Override
    public Waiter add(Waiter entity) {
        // TODO Validate and add a new waiter
        throw new NotImplementedException();
    }

    @Override
    public Waiter update(Waiter entity) {
        // TODO Validate and update waiter
        throw new NotImplementedException();
    }

    @Override
    public void delete(Waiter entity) {
        // TODO Validate and delete waiter
        throw new NotImplementedException();
    }

    @Override
    public Waiter getById(Waiter entity) {
        // TODO get a waiter by his id
        throw new NotImplementedException();
    }

    @Override
    public List<Waiter> getAll() {
        // TODO get all waiters from repository
        throw new NotImplementedException();
    }
}
