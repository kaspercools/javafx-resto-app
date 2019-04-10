package org.howest.resto.controller.table;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.howest.service.impl.TableServiceImpl;

/*
FIXME
    - We should be able to edit an existing table:
       - capacity (number of seats)
            - can not be larger than 6
       - talbe number
            - can not be larger than 20 (these are the max number of tables the  application should accept!)
    - Link click events
    - Create a custom viewmodel that is used for adding/editing you entity
        - You might have to create some sort of a mapper class to map your model objects to these ViewModels
            !--> DO NOT USE YOUR DOMAIN MODELS FOR THIS <--!
    - link the entity to your form via binding
    - validate your entity and use the provided error labels to show messages, make sure these are hidden at first!
    - Add item should open up the MenuItemPriceNewScreen via your MainController
    - RemoveSelected should remove the entity that is linked to the selected row in the ListView.
        - Before actually removing your entity, make sure to ask the user for confirmation!
    - A waiter is directly linked to a user, so when creating a waiter we must create both the User as well as the Waiter object in our in-memory database!
      Thus we use the fields provided in the given view to edit both the Waiter and the User model
*/
public class TableNewScreenController {
    private final TableServiceImpl menuService;

    public TableNewScreenController(TableServiceImpl menuService) {
        this.menuService = menuService;
    }

    @FXML
    private void save(ActionEvent e) {
        //TODO validate screen input
    }

    @FXML
    private void cancel(ActionEvent e) {
        //TODO send the MainController a message so that he knows that we want to go back to our talbeOverviewScreen!
    }
}
