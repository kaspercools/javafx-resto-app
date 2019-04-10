package org.howest.resto.repo.impl;

import org.howest.resto.domain.MenuItemType;
import org.howest.resto.repo.MenuItemTypeRepository;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class MenuItemTypeRepositoryImpl extends GenericRepositoryImpl<Integer, MenuItemType> implements MenuItemTypeRepository {
    private final String uniqueRef = UUID.randomUUID().toString();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItemTypeRepositoryImpl)) return false;
        MenuItemTypeRepositoryImpl that = (MenuItemTypeRepositoryImpl) o;
        return Objects.equals(uniqueRef, that.uniqueRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueRef);
    }
}
