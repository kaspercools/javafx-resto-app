package org.howest.resto.repo.impl;

import org.howest.resto.domain.Table;
import org.howest.resto.repo.TableRepository;
import org.howest.resto.repo.WaiterRepository;

import java.util.Random;

public class TableRepositoryImpl extends GenericRepositoryImpl<Integer, Table> implements TableRepository {

    private WaiterRepository waiterRepository;

    public TableRepositoryImpl(WaiterRepository waiterRepository) {
        this.waiterRepository = waiterRepository;
    }

    @Override
    public void initialize() {
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            this.insert(new Table((byte) (rand.nextInt(4) + 2)));
        }
    }
}
