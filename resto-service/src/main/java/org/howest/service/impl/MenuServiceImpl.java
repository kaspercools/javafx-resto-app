package org.howest.service.impl;

import org.howest.resto.domain.Menu;
import org.howest.resto.repo.MenuRepository;
import org.howest.resto.repo.RestoRepositoryProvider;
import org.howest.service.MenuService;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;

    public MenuServiceImpl() {
        RestoRepositoryProvider repoProvider = RestoRepositoryProvider.getInstance();
        this.menuRepository = (MenuRepository) repoProvider.getRepository(MenuRepository.class).get();
    }


    @Override
    public Menu add(Menu entity) {
        // TODO Validate and add a new Menu
        throw new NotImplementedException();
    }

    @Override
    public Menu update(Menu entity) {
        // TODO Validate and update Menu
        throw new NotImplementedException();
    }

    @Override
    public void delete(Menu entity) {
        // TODO Validate and delete Menu
        throw new NotImplementedException();
    }

    @Override
    public Menu getById(Menu entity) {
        // TODO get a Menu by his id
        throw new NotImplementedException();
    }

    @Override
    public List<Menu> getAll() {
        // TODO get all Menus from repository
        throw new NotImplementedException();
    }

}
