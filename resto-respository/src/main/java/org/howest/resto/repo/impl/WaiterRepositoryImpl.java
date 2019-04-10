package org.howest.resto.repo.impl;

import org.howest.resto.domain.Waiter;
import org.howest.resto.repo.UserRepository;
import org.howest.resto.repo.WaiterRepository;

import java.util.List;

public class WaiterRepositoryImpl extends GenericRepositoryImpl<Integer, Waiter> implements WaiterRepository {

    private final UserRepository userRepository;

    public WaiterRepositoryImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void initialize() {

    }

    @Override
    public List<Waiter> findAllByName(String name) {

        return entityCollection.stream().filter(w->w.getLinkedUserAccount().getFirstName().contains(name))
    }
}
