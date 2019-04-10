package org.howest.resto.repo;

import org.howest.resto.domain.Waiter;

import java.util.List;
import java.util.Optional;

public interface WaiterRepository extends GenericRepository<Integer, Waiter> {

    List<Waiter> findAllByFirstNameOrLastNameContaining(String name);
    Optional<Waiter> findByLogin(String login);
}
