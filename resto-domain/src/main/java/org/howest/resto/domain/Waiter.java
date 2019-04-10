package org.howest.resto.domain;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Waiter implements BaseEntity {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private User linkedUserAccount;
    private Set<Table> tafels;

    public Waiter() {
        id = count.incrementAndGet();
    }

    public Waiter(User linkedUserAccount, Set<Table> tafels) {
        this();
        this.linkedUserAccount = linkedUserAccount;
        this.tafels = tafels;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public User getLinkedUserAccount() {
        return linkedUserAccount;
    }

    public void setLinkedUserAccount(User linkedUserAccount) {
        this.linkedUserAccount = linkedUserAccount;
    }

    public Set<Table> getTafels() {
        return tafels;
    }

    public void setTafels(Set<Table> tafels) {
        this.tafels = tafels;
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "id=" + id +
                ", linkedUserAccount=" + linkedUserAccount +
                ", tafels=" + tafels +
                '}';
    }
}
