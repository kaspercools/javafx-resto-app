package org.howest.resto.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Waiter implements BaseEntity {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private User linkedUserAccount;
    private Set<Table> tables;

    public Waiter() {
        id = count.incrementAndGet();
        tables = new HashSet<>();
    }

    public Waiter(User linkedUserAccount, Set<Table> tables) {
        this();
        this.linkedUserAccount = linkedUserAccount;
        this.tables = tables;
    }

    public Waiter(User user) {
        this();
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

    public Set<Table> getTables() {
        return tables;
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "id=" + id +
                ", linkedUserAccount=" + linkedUserAccount +
                ", tables=" + tables +
                '}';
    }

    public void addTable(Table t) {
        this.tables.add(t);
    }
}
