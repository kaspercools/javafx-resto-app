package org.howest.resto.repo.impl;

import org.howest.resto.domain.User;
import org.howest.resto.repo.UserRepository;

import java.util.Optional;

public class UserRepositoryImpl extends GenericRepositoryImpl<Integer, User> implements UserRepository {

    public UserRepositoryImpl() {

    }

    @Override
    public void initialize() {

        this.insert(new User("Debra", "Edwards"));
        this.insert(new User("Ryan", "Hernandez"));
        this.insert(new User("Anna", "Howard"));
        this.insert(new User("Thomas", "Cook"));

        //TODO add youw own user account to the inital database data
    }

    @Override
    public Optional<User> findByLoginAndPassword(String login, String password) {
        return this.entityCollection.stream().filter(u->u.getLogin().equalsIgnoreCase(login) && u.getPassword().equals(password)).findFirst();
    }
}
