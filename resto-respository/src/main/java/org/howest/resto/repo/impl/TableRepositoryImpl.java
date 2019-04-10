package org.howest.resto.repo.impl;

import org.howest.resto.domain.Table;
import org.howest.resto.domain.Waiter;
import org.howest.resto.repo.TableRepository;
import org.howest.resto.repo.WaiterRepository;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class TableRepositoryImpl extends GenericRepositoryImpl<Integer, Table> implements TableRepository {
    private final String uniqueRef = UUID.randomUUID().toString();

    private WaiterRepository waiterRepository;

    public TableRepositoryImpl(WaiterRepository waiterRepository) {
        this.waiterRepository = waiterRepository;
    }

    @Override
    public void initialize() {

        List<Waiter> waiterCollection = waiterRepository.findAll();
        Random rand = new Random();
        int j = 0;

        for (int i = 0; i < 15; i++) {
            Table t = new Table((byte) (rand.nextInt(4) + 2), waiterCollection.get(j));
            this.insert(t);
            waiterCollection.get(j).addTable(t);
            waiterRepository.update(waiterCollection.get(j));
            if ((i+1) % 6 == 0) {
                j++;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TableRepositoryImpl)) return false;
        TableRepositoryImpl that = (TableRepositoryImpl) o;
        return Objects.equals(uniqueRef, that.uniqueRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueRef);
    }
}
