package org.howest.resto.controller.menu.itemprice;

import org.howest.service.MenuService;
/* FIXME
    - Link click events
    - Create a custom viewmodel that is used for adding/editing you entity
        - You might have to create some sort of a mapper class to map your model objects to these ViewModels
            !--> DO NOT USE YOUR DOMAIN MODELS FOR THIS <--!
    - link the entity to your form via binding
    - validate your entity and use the provided error labels to show messages, make sure these are hidden at first!
    - Add item should open up the MenuItemPriceNewScreen via your MainController
    - RemoveSelected should remove the entity that is linked to the selected row in the ListView.
        - Before actually removing your entity, make sure to ask the user for confirmation!
*/
public class MenuItemPriceNewScreenController {
    private final MenuService menuService;

    public MenuItemPriceNewScreenController(MenuService menuService) {
        this.menuService = menuService;
    }
}
