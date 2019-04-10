package org.howest.resto.repo;

import org.howest.resto.domain.MenuItemType;

import java.util.Optional;

public interface MenuItemTypeRepository extends GenericRepository<Integer, MenuItemType> {
    Optional<MenuItemType> findMenuItemTypeByNameIgnoreCase(String name);
}
