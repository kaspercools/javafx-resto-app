package org.howest.resto.controller.menu;

import org.howest.service.MenuService;

/* FIXME
    - Link click events
    - Fill TableView
    - When a user double clicks on a table row the MenuItemPrice edit screen should open
    - Add item should open up the MenuItemPriceNewScreen via your MainController
    - RemoveSelected should remove the entity that is linked to the selected row in the ListView.
        - Before actually removing your entity, make sure to ask the user for confirmation!
    - Implement functionality to search your TableView using the input given by your search TextField
*/
public class MenuOverviewScreenController {
    private final MenuService menuService;

    public MenuOverviewScreenController(MenuService menuService) {
        this.menuService = menuService;
    }
}
