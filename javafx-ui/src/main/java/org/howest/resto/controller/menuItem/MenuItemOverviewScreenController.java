package org.howest.resto.controller.menuItem;

import org.howest.service.MenuItemService;

/* FIXME
    - Link click events
    - When a user double clicks on a table row the MenuItemPrice edit screen should open
    - Add item should open up the MenuItemNewScreen via your MainController
    - Notice that is no delete button. Make sure that when a user pressed the 'd' key on his keyboard the currently selected row is deleted
    - Implement functionality to search your TableView using the input given by your search TextField
*/
public class MenuItemOverviewScreenController {
    private final MenuItemService menuItemService;

    public MenuItemOverviewScreenController(MenuItemService menuItemService) {
        this.menuItemService = menuItemService;
    }
}
