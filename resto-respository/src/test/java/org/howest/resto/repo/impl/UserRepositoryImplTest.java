package org.howest.resto.repo.impl;

import org.howest.resto.domain.User;
import org.howest.resto.repo.RestoRepositoryProvider;
import org.howest.resto.repo.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

public class UserRepositoryImplTest {

    private UserRepository userRepository;

    public UserRepositoryImplTest() {
        userRepository = (UserRepository) RestoRepositoryProvider.getInstance().getRepository(UserRepository.class).get();
    }

    @Before
    public void initRepoBeforeTest() {
        userRepository.initialize();
    }

    @Test
    public void findByLoginTest() {
        Optional<User> u = userRepository.findByLoginAndPassword("thomAs.cook","Thomas.Cook123!");

        Assert.assertTrue(u.isPresent());
        Assert.assertEquals(u.get().getFirstName(),"Thomas");
        Assert.assertEquals(u.get().getLastName(),"Cook");
    }

}
