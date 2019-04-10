package org.howest.resto.repo.impl;

import org.howest.resto.domain.Order;
import org.howest.resto.repo.MenuItemRepository;
import org.howest.resto.repo.OrderRepository;
import org.howest.resto.repo.WaiterRepository;

import java.util.Objects;
import java.util.UUID;

public class OrderRepositoryImpl extends GenericRepositoryImpl<Integer, Order> implements OrderRepository {
    private final static String uniqueRef= UUID.randomUUID().toString();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderRepositoryImpl)) return false;
        OrderRepositoryImpl that = (OrderRepositoryImpl) o;
        return Objects.equals(uniqueRef, that.uniqueRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueRef);
    }
}
