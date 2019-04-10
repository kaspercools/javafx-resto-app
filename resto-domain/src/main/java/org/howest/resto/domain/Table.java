package org.howest.resto.domain;

import java.util.concurrent.atomic.AtomicInteger;

public class Table implements BaseEntity {
    private static final AtomicInteger count = new AtomicInteger(0);

    private int id;
    private String number;
    private Waiter waiter;
    private byte capacity;

    public Table() {
        this.id = count.incrementAndGet();
    }

    public Table(byte capacity) {
        this();
        this.number = String.valueOf(this.id);
        this.capacity = capacity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public byte getCapacity() {
        return capacity;
    }

    public void setCapacity(byte capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", waiter=" + waiter +
                ", capacity=" + capacity +
                '}';
    }
}
