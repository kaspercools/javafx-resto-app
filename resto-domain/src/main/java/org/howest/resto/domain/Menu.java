package org.howest.resto.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Menu implements BaseEntity {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private Map<MenuItem, BigDecimal> menu;

    public Menu() {
        this.id = count.incrementAndGet();
        menu = new HashMap<>();
    }

    public Menu(int id, Map<MenuItem, BigDecimal> menu) {
        this.id = id;
        this.menu = menu;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Map<MenuItem, BigDecimal> getMenu() {
        return menu;
    }

    public void addMenuItem(MenuItem menuItem, BigDecimal price) {
        this.menu.put(menuItem, price);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", menu=" + menu +
                '}';
    }
}
