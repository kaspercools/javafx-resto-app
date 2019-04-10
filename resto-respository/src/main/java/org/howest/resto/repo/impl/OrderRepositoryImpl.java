package org.howest.resto.repo.impl;

import org.howest.resto.domain.Order;
import org.howest.resto.repo.MenuItemRepository;
import org.howest.resto.repo.OrderRepository;
import org.howest.resto.repo.WaiterRepository;

public class OrderRepositoryImpl extends GenericRepositoryImpl<Integer, Order> implements OrderRepository {

    private final WaiterRepository oberRepostory;
    private final MenuItemRepository menuItemRepository;

    public OrderRepositoryImpl(WaiterRepository waiterRepository, MenuItemRepository menuItemRepository) {
        this.oberRepostory = waiterRepository;
        this.menuItemRepository = menuItemRepository;
    }

    @Override
    public void initialize() {
        //TODO add orders to our repository
    }
}
