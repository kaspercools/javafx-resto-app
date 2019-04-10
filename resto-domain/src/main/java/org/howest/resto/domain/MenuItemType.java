package org.howest.resto.domain;

import java.util.concurrent.atomic.AtomicInteger;

public class MenuItemType implements BaseEntity {
    private static final AtomicInteger count = new AtomicInteger(0);

    private int id;
    private String name;

    public MenuItemType() {
        this.id = count.incrementAndGet();
    }

    public MenuItemType(String name) {
        this();
        this.name = name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MenuItemType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
