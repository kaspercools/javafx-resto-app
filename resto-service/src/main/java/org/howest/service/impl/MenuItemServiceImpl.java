package org.howest.service.impl;

import org.howest.resto.domain.MenuItem;
import org.howest.resto.repo.MenuItemRepository;
import org.howest.resto.repo.RestoRepositoryProvider;
import org.howest.service.MenuItemService;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class MenuItemServiceImpl implements MenuItemService {


    private final MenuItemRepository menuItemRepository;

    public MenuItemServiceImpl() {
        RestoRepositoryProvider repoProvider = RestoRepositoryProvider.getInstance();
        this.menuItemRepository = (MenuItemRepository) repoProvider.getRepository(MenuItemRepository.class).get();
    }


    @Override
    public MenuItem add(MenuItem entity) {
        // TODO Validate and add a new MenuItem
        throw new NotImplementedException();
    }

    @Override
    public MenuItem update(MenuItem entity) {
        // TODO Validate and update MenuItem
        throw new NotImplementedException();
    }

    @Override
    public void delete(MenuItem entity) {
        // TODO Validate and delete MenuItem
        throw new NotImplementedException();
    }

    @Override
    public MenuItem getById(MenuItem entity) {
        // TODO get a MenuItem by his id
        throw new NotImplementedException();
    }

    @Override
    public List<MenuItem> getAll() {
        // TODO get all MenuItems from repository
        throw new NotImplementedException();
    }
}
