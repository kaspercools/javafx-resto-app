package org.howest.service.impl;

import org.howest.resto.domain.MenuItemType;
import org.howest.resto.repo.MenuItemTypeRepository;
import org.howest.resto.repo.RestoRepositoryProvider;
import org.howest.service.MenuItemTypeService;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class MenuItemTypeServiceImpl implements MenuItemTypeService {

    private final MenuItemTypeRepository menuItemTypeRepository;

    public MenuItemTypeServiceImpl() {
        RestoRepositoryProvider repoProvider = RestoRepositoryProvider.getInstance();
        this.menuItemTypeRepository = (MenuItemTypeRepository) repoProvider.getRepository(MenuItemTypeRepository.class).get();
    }


    @Override
    public MenuItemType add(MenuItemType entity) {
        // TODO Validate and add a new MenuItemType
        throw new NotImplementedException();
    }

    @Override
    public MenuItemType update(MenuItemType entity) {
        // TODO Validate and update MenuItemType
        throw new NotImplementedException();
    }

    @Override
    public void delete(MenuItemType entity) {
        // TODO Validate and delete MenuItemType
        throw new NotImplementedException();
    }

    @Override
    public MenuItemType getById(MenuItemType entity) {
        // TODO get a MenuItemType by his id
        throw new NotImplementedException();
    }

    @Override
    public List<MenuItemType> getAll() {
        // TODO get all MenuItemTypes from repository
        throw new NotImplementedException();
    }
}
