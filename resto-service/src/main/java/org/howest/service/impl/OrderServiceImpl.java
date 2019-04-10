package org.howest.service.impl;

import org.howest.resto.domain.Order;
import org.howest.resto.repo.OrderRepository;
import org.howest.resto.repo.RestoRepositoryProvider;
import org.howest.service.OrderService;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl() {
        RestoRepositoryProvider repoProvider = RestoRepositoryProvider.getInstance();
        this.orderRepository = (OrderRepository) repoProvider.getRepository(OrderRepository.class).get();
    }

    @Override
    public Order add(Order entity) {
        // TODO Validate and add a new Order
        throw new NotImplementedException();
    }

    @Override
    public Order update(Order entity) {
        // TODO Validate and update Order
        throw new NotImplementedException();
    }

    @Override
    public void delete(Order entity) {
        // TODO Validate and delete Order
        throw new NotImplementedException();
    }

    @Override
    public Order getById(Order entity) {
        // TODO get a Order by his id
        throw new NotImplementedException();
    }

    @Override
    public List<Order> getAll() {
        // TODO get all Orders from repository
        throw new NotImplementedException();
    }
}
