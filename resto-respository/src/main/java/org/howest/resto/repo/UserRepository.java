package org.howest.resto.repo;

import org.howest.resto.domain.User;

import java.util.Optional;

public interface UserRepository extends GenericRepository<Integer, User> {
    Optional<User> findByLoginAndPassword(String login, String password);
}
