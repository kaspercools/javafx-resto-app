package org.howest.resto.domain;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class MenuItem implements BaseEntity {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String name;
    private String description;
    private MenuItemType type;
    private FoodType foodType;

    public MenuItem() {
        this.id = count.incrementAndGet();
    }

    public MenuItem(String name, String description, MenuItemType type, FoodType foodType) {
        this();
        this.name = name;
        this.description = description;
        this.type = type;
        this.foodType = foodType;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MenuItemType getType() {
        return type;
    }

    public void setType(MenuItemType type) {
        this.type = type;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return getId() == menuItem.getId() &&
                Objects.equals(getName(), menuItem.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", foodType=" + foodType +
                '}';
    }
}
