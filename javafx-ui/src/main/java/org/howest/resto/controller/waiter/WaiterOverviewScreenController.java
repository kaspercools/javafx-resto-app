package org.howest.resto.controller.waiter;

import org.howest.service.WaiterService;
/* FIXME
    - Link click events
    - Fill TableView
    - When a user double clicks on a table row the MenuItemPrice edit screen should open
    - Add item should open up the WaiterNewScreen via your MainController
    - RemoveSelected should remove the entity that is linked to the selected row in the ListView.
        - Before actually removing your entity, make sure to ask the user for confirmation!
    - Implement functionality to search your TableView using the input given by your search TextField
*/
public class WaiterOverviewScreenController {

    private final WaiterService waiterService;

    public WaiterOverviewScreenController(WaiterService waiterService) {
        this.waiterService = waiterService;
    }
}
