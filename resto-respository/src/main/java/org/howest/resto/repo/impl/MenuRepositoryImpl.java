package org.howest.resto.repo.impl;

import org.howest.resto.domain.Menu;
import org.howest.resto.domain.MenuItem;
import org.howest.resto.repo.MenuItemRepository;
import org.howest.resto.repo.MenuRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class MenuRepositoryImpl implements MenuRepository {
    private final static String uniqueRef= UUID.randomUUID().toString();

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
        Random rand = new Random(System.currentTimeMillis());
        // create single menu
        this.menu = new Menu();
        this.menu.setId(1);
        // get and init new menu items
        List<MenuItem> lstMenuItems;
        lstMenuItems = (List<MenuItem>) menuItemRepository.findAll();
        //adding 10 random menuitems from the list (could be anything really, same goes for the prices)
        for (int i = 0; i < 10; i++) {
            menu.addMenuItem(lstMenuItems.get(rand.nextInt(lstMenuItems.size())),BigDecimal.valueOf(rand.nextDouble()*25));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuRepositoryImpl)) return false;
        MenuRepositoryImpl that = (MenuRepositoryImpl) o;
        return Objects.equals(uniqueRef, that.uniqueRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueRef);
    }
}
