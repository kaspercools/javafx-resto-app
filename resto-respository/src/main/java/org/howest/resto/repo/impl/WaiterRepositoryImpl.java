package org.howest.resto.repo.impl;

import org.howest.resto.domain.User;
import org.howest.resto.domain.Waiter;
import org.howest.resto.repo.UserRepository;
import org.howest.resto.repo.WaiterRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class WaiterRepositoryImpl extends GenericRepositoryImpl<Integer, Waiter> implements WaiterRepository {
    private final static String uniqueRef= UUID.randomUUID().toString();

    private final UserRepository userRepository;

    public WaiterRepositoryImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void initialize() {
        List<User> users = userRepository.findAll();
        // create 3 waiters from this userlist
        for (int i = 0; i < 3; i++) {
            this.insert(new Waiter(users.get(i)));
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WaiterRepositoryImpl)) return false;
        WaiterRepositoryImpl that = (WaiterRepositoryImpl) o;
        return Objects.equals(uniqueRef, that.uniqueRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueRef);
    }
}
