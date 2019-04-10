package org.howest.resto.repo.impl;

import org.howest.resto.domain.Menu;
import org.howest.resto.domain.MenuItem;
import org.howest.resto.repo.MenuItemRepository;
import org.howest.resto.repo.MenuRepository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuRepositoryImpl implements MenuRepository {
    private final MenuItemRepository menuItemRepository;
    private Menu menu;

    public MenuRepositoryImpl(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    public Menu find() {
        return new Menu(menu.getId(), menu.getMenu());
    }

    public Menu save(Menu menu) {
        this.menu = new Menu(menu.getId(), menu.getMenu());

        return menu;
    }

    @Override
    public void initialize() {
        // create single menu
        this.menu = new Menu();
        this.menu.setId(1);
        // get and init new menu items
        List<MenuItem> lstMenuItems;
        lstMenuItems = (List<MenuItem>) menuItemRepository.findAllByTypeNameIgnoreCase("frisdranken");


        Map<MenuItem, BigDecimal> menuItems = new HashMap<>();


    }
}
