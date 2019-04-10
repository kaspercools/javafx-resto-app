package org.howest.service.impl;

import org.howest.resto.domain.User;
import org.howest.resto.repo.RestoRepositoryProvider;
import org.howest.resto.repo.UserRepository;
import org.howest.service.UserService;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl() {
        RestoRepositoryProvider repoProvider = RestoRepositoryProvider.getInstance();
        this.userRepository = (UserRepository) repoProvider.getRepository(UserRepository.class).get();
    }


    @Override
    public User add(User entity) {
        // TODO Validate and add a new User
        throw new NotImplementedException();
    }

    @Override
    public User update(User entity) {
        // TODO Validate and update User
        throw new NotImplementedException();
    }

    @Override
    public void delete(User entity) {
        // TODO Validate and delete User
        throw new NotImplementedException();
    }

    @Override
    public User getById(User entity) {
        // TODO get a User by his id
        throw new NotImplementedException();
    }

    @Override
    public List<User> getAll() {
        // TODO get all Users from repository
        throw new NotImplementedException();
    }
}
