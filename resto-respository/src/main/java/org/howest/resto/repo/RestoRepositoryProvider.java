package org.howest.resto.repo;

import org.howest.resto.repo.impl.*;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class RestoRepositoryProvider implements Initializable {
    private Set<Initializable> repositoryCollection;

    private RestoRepositoryProvider() {
        repositoryCollection = new LinkedHashSet<>();
        initialize();
    }

    public static RestoRepositoryProvider getInstance() {
        return RestoRepositoryProviderInnerClass.instance;
    }

    @Override
    public void initialize() {
        repositoryCollection.clear();
        MenuItemTypeRepository menuItemTypeRepositoryRepo = new MenuItemTypeRepositoryImpl();
        repositoryCollection.add(menuItemTypeRepositoryRepo);

        MenuItemRepository menuItemRepository = new MenuItemRepositoryImpl(menuItemTypeRepositoryRepo);
        repositoryCollection.add(menuItemRepository);

        MenuRepository menuRepository = new MenuRepositoryImpl(menuItemRepository);
        repositoryCollection.add(menuRepository);

        UserRepository userRepo = new UserRepositoryImpl();
        repositoryCollection.add(userRepo);

        WaiterRepository waiterRepository = new WaiterRepositoryImpl(userRepo);
        repositoryCollection.add(waiterRepository);
        repositoryCollection.add(new TableRepositoryImpl(waiterRepository));

        repositoryCollection.add(new OrderRepositoryImpl(waiterRepository, menuItemRepository));

        // initialize all repos
        for (Initializable initializableRepository :
                repositoryCollection) {
            initializableRepository.initialize();
        }
    }

    public <T extends Initializable> Optional<T> getRepository(Class repositoryClass) {
        for (Initializable repository : repositoryCollection) {
            if (repositoryClass.isInstance(repository)) {
                return Optional.of((T) repository);
            }
        }
        return Optional.empty();
    }

    private static class RestoRepositoryProviderInnerClass {
        static final RestoRepositoryProvider instance = new RestoRepositoryProvider();
    }
}
