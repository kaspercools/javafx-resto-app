package org.howest.resto.repo;

import org.howest.resto.domain.MenuItem;

import java.util.List;

public interface MenuItemRepository extends GenericRepository<Integer, MenuItem> {

    List<MenuItem> findAllByTypeNameIgnoreCase(String menuItemTypeName);


}
