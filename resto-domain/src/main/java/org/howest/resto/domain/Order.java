package org.howest.resto.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Order implements BaseEntity {
    private static final AtomicInteger count = new AtomicInteger(0);

    private int id;
    private LocalDateTime creationDate;
    private List<MenuItem> orderedItems;
    private Waiter waiter;
    private OrderStatus status;
    private OrderPaymentType paymentType;

    public Order() {
        id = count.incrementAndGet();
        creationDate = LocalDateTime.now();
        orderedItems = new ArrayList<>();
    }

    public Order(Waiter waiter) {
        this();
        this.waiter = waiter;
    }

    public static AtomicInteger getCount() {
        return count;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public List<MenuItem> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(List<MenuItem> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public void addOrderedItem(MenuItem menuItem) {
        this.orderedItems.add(menuItem);
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderPaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(OrderPaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public boolean orderHasBeenPayed() {
        return this.paymentType == null;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", creationDate=" + creationDate +
                ", orderedItems=" + orderedItems +
                ", waiter=" + waiter +
                ", status=" + status +
                ", paymentType=" + paymentType +
                '}';
    }
}

