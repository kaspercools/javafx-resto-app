package org.howest.resto.repo.impl;

import org.howest.resto.domain.FoodType;
import org.howest.resto.domain.MenuItem;
import org.howest.resto.repo.MenuItemRepository;
import org.howest.resto.repo.MenuItemTypeRepository;

import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

public class MenuItemRepositoryImpl extends GenericRepositoryImpl<Integer, MenuItem> implements MenuItemRepository{
    private final static String uniqueRef= UUID.randomUUID().toString();
    private final MenuItemTypeRepository menuItemTypeRepository;

    public MenuItemRepositoryImpl(MenuItemTypeRepository menuItemTypeRepository) {
        super();
        this.menuItemTypeRepository = menuItemTypeRepository;
    }

    @Override
    public void initialize() {
        // Voorgerechten
        this.insert(new MenuItem("Oostendse vissoep", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("voorgerecht").get(),
                FoodType.Food));
        this.insert(new MenuItem("Tonijn", "Tomaat met handgepelde Zeebrugse garnalen (75gr)",
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("voorgerecht").get(),
                FoodType.Food));
        this.insert(new MenuItem("Zeebareel", "Crème asperges, aardappel, garnaal",
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("voorgerecht").get(),
                FoodType.Food));
        this.insert(new MenuItem("Carpaccio van het West-Vlaamse rode rund met parmesaan schaafsel", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("voorgerecht").get(),
                FoodType.Food));
        this.insert(new MenuItem("Kingkrab", "Tagliatelle, kruidenboter, brunoise groentjes",
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("voorgerecht").get(),
                FoodType.Food));
        this.insert(new MenuItem("Huisbereide garnaalkroketten", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("voorgerecht").get(),
                FoodType.Food));
        this.insert(new MenuItem("Bisque van kreeft", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("voorgerecht").get(),
                FoodType.Food));

        // Hoofdgerechten
        this.insert(new MenuItem("Paling in't groen", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("hoofdgerecht").get(),
                FoodType.Food));
        this.insert(new MenuItem("Roggevleugel", "Kappers/hoeveboter/kruidenpuree",
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("hoofdgerecht").get(),
                FoodType.Food));
        this.insert(new MenuItem("Sliptongen", "Lentesla/dagverse frietjes/peterselie/citroen",
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("hoofdgerecht").get(),
                FoodType.Food));
        this.insert(new MenuItem("Kabeljauw", "Jonge spinazie/mousselinesaus/kruidenpuree",
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("hoofdgerecht").get(),
                FoodType.Food));
        this.insert(new MenuItem("Zeetong", "Lentesla/dagverse frietjes/peterselie/citroen",
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("hoofdgerecht").get(),
                FoodType.Food));
        this.insert(new MenuItem("Tomaat met handgepelde Zeebrugse garnalen ( 125 gram)", "Lentesla/dagverse frietjes/huisgemaakte ma- yonaise",
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("hoofdgerecht").get(),
                FoodType.Food));
        this.insert(new MenuItem("Begisch wit-blauw", "Ribstuk op houtvuur geroosterd/lentesla/Béar- naise/Dagverse frietjes",
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("hoofdgerecht").get(),
                FoodType.Food));
        this.insert(new MenuItem("West-Vlaams Rood \"Dry aged\"", "Op het houtvuur geroosterd/lentesla/dagverse frietjes",
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("hoofdgerecht").get(),
                FoodType.Food));

        // Desserts
        this.insert(new MenuItem("Salsa van lentefruit met vanille- roomijs", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("dessert").get(),
                FoodType.Food));
        this.insert(new MenuItem("Moelleux van chocolade met vanille-ijs", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("dessert").get(),
                FoodType.Food));
        this.insert(new MenuItem("Crème brûlée", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("dessert").get(),
                FoodType.Food));
        this.insert(new MenuItem("Passion Delight", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("dessert").get(),
                FoodType.Food));
        this.insert(new MenuItem("Dame Blanche", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("dessert").get(),
                FoodType.Food));

        // Aperitieven
        this.insert(new MenuItem("Coupe champagne Pommery Brut Apanage", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("aperitieven").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Kirr Royal au champagne Pommery Brut Apanage", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("aperitieven").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Campari soda/orange/tonic", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("aperitieven").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Martini Bianco / Rosso", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("aperitieven").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Kirr au vin blanc", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("aperitieven").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Sherry", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("aperitieven").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Offley Port", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("aperitieven").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Offley Oude Port ", "(10 jaar)",
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("aperitieven").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Portie kreukels of wulken of garnalen", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("aperitieven").get(),
                FoodType.Food));
        this.insert(new MenuItem("Portie langoustines", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("aperitieven").get(),
                FoodType.Food));
        this.insert(new MenuItem("Portie krabpoten", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("aperitieven").get(),
                FoodType.Food));
        this.insert(new MenuItem("Gepaneerde visstengels / tartaresaus", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("aperitieven").get(),
                FoodType.Food));

        // Cocktails
        this.insert(new MenuItem("Perfect Storm Ginger beer/limoensap/Rum", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("cocktails").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Tonicello Limoncello & tonic", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("cocktails").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Virgin Summer", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("cocktails").get(),
                FoodType.Drinks));

        // Frisdranken
        this.insert(new MenuItem("Pepsi", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("frisdranken").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Pepsi Max", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("frisdranken").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Spa Orange", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("frisdranken").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Ice tea", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("frisdranken").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Bru", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("frisdranken").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Bru plat", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("frisdranken").get(),
                FoodType.Drinks));

        // Bieren
        this.insert(new MenuItem("Sint-Hubertus", "6,80 % ambachtelijk abdijbier",
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("bieren").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Kriek Mystique", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("bieren").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Duvel", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("bieren").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Somersby 4.5%", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("bieren").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Carslberg 0,00 %", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("bieren").get(),
                FoodType.Drinks));
        this.insert(new MenuItem("Carlsberg", null,
                this.menuItemTypeRepository.findMenuItemTypeByNameIgnoreCase("bieren").get(),
                FoodType.Drinks));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItemRepositoryImpl)) return false;
        MenuItemRepositoryImpl that = (MenuItemRepositoryImpl) o;
        return Objects.equals(uniqueRef, that.uniqueRef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueRef);
    }

    @Override
    public List<MenuItem> findAllByTypeNameIgnoreCase(String menuItemTypeName) {
        return this.entityCollection.stream().filter(e -> e.getType().getName().equalsIgnoreCase(menuItemTypeName)).collect(Collectors.toList());
    }
}
