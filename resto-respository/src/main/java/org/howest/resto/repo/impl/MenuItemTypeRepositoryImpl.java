package org.howest.resto.repo.impl;

import org.howest.resto.domain.MenuItemType;
import org.howest.resto.repo.MenuItemTypeRepository;

import java.util.Optional;

public class MenuItemTypeRepositoryImpl extends GenericRepositoryImpl<Integer, MenuItemType> implements MenuItemTypeRepository {

    @Override
    public void initialize() {
        this.insert(new MenuItemType("Voorgerecht"));
        this.insert(new MenuItemType("Hoofdgerecht"));
        this.insert(new MenuItemType("Dessert"));
        this.insert(new MenuItemType("Aperitieven"));
        this.insert(new MenuItemType("Cocktails"));
        this.insert(new MenuItemType("Frisdranken"));
        this.insert(new MenuItemType("Bieren"));
    }

    @Override
    public Optional<MenuItemType> findMenuItemTypeByNameIgnoreCase(String name) {
        return this.entityCollection.stream().filter(mit -> mit.getName().equalsIgnoreCase(name)).findFirst();
    }
}
