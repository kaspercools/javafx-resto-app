package org.howest.resto.repo.impl;

import org.howest.resto.domain.Waiter;
import org.howest.resto.repo.UserRepository;
import org.howest.resto.repo.WaiterRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class WaiterRepositoryImpl extends GenericRepositoryImpl<Integer, Waiter> implements WaiterRepository {

    private final UserRepository userRepository;

    public WaiterRepositoryImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void initialize() {

    }

    @Override
    public List<Waiter> findAllByFirstNameOrLastNameContaining(String query) {
        return entityCollection.stream()
                .filter(w -> w.getLinkedUserAccount().getFirstName().contains(query)
                        || w.getLinkedUserAccount().getLastName().contains(query))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Waiter> findByLogin(String login) {
        return entityCollection.stream()
                .filter(w -> w.getLinkedUserAccount().getLogin().equalsIgnoreCase(login))
                .findFirst();
    }
}
