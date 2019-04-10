package org.howest.resto.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.SubScene;
import org.howest.resto.enums.RestoScreen;
import org.howest.resto.factory.RestoScreenFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private SubScene subScene;

    public void initialize(URL location, ResourceBundle resources) {

        initScreenView(RestoScreen.MenuOverview);
    }


    private void initScreenView(RestoScreen menuOverview) {
        RestoScreenFactory fact = new RestoScreenFactory();
        //TODO take a close look at these method calls, do we have everything we need?
        switch (menuOverview) {
            case MenuOverview:
                subScene.setRoot(fact.createMenuOverviewScreen());
                break;
            case MenuItemPriceNew:
                subScene.setRoot(fact.createMenuItemPriceNewScreen());
                break;
            case MenuItemPriceEdit:
                subScene.setRoot(fact.createMenuItemPriceEditScreen());
                break;
            case MeuItemOverview:
                subScene.setRoot(fact.createMeuItemOverviewScreen());
                break;
            case MenuItemNew:
                subScene.setRoot(fact.createMenuItemNewScreen());
                break;
            case MenuItemEdit:
                subScene.setRoot(fact.createMenuItemEditScreen());
                break;
            case OrderOverview:
                subScene.setRoot(fact.createOrderOverviewScreen());
                break;
            case TableOverview:
                subScene.setRoot(fact.createTableOverviewScreen());
                break;
            case TableNew:
                subScene.setRoot(fact.createTableNewScreen());
                break;
            case TableEdit:
                subScene.setRoot(fact.createTableEditScreen());
                break;
            case WaiterOverview:
                subScene.setRoot(fact.createWaiterOVerviewScreen());
                break;
            case WaiterNew:
                subScene.setRoot(fact.createWaiterNewScreen());
                break;
            case WaiterEdit:
                subScene.setRoot(fact.createWaiterEditScreen());
                break;
        }
    }

    @FXML
    private void signOut(ActionEvent event) {
        /*
            FIXME Sing out our current user.
                - We should prompt the login screen
                - The main controller should no longer exist one the user has logged out!
                    - this means we should be able to get back to our RestoJavaFxApp somehow 🤔
         */
    }

    @FXML
    private void closeApplication(ActionEvent event) {
        //TODO Close the JavaFX application
    }

    //(Menu) click events

    @FXML
    private void openMenuOverviewScreen(ActionEvent event) {
        initScreenView(RestoScreen.MenuOverview);
    }

    @FXML
    private void openNewMenuItemPriceScreen(ActionEvent event) {
        initScreenView(RestoScreen.MenuItemPriceNew);
    }

    @FXML
    private void openEditMenuItemPriceScreen(ActionEvent event) {
        //TODO Change the current view to open-edit-MenuItemPrice screen
        throw new NotImplementedException();
    }

    //(MenuItem) click events
    @FXML
    private void openMenuItemOverviewScreen(ActionEvent event) {
        initScreenView(RestoScreen.MeuItemOverview);
    }

    @FXML
    private void openNewMenuItemScreen(ActionEvent event) {
        initScreenView(RestoScreen.MenuItemNew);
    }

    @FXML
    private void openEditMenuItemScreen(ActionEvent event) {
        //TODO Change the current view to open-edit-MenuItem screen
        throw new NotImplementedException();
    }

    //(Order) click events
    @FXML
    private void openOrderOverviewScreen(ActionEvent event) {
        initScreenView(RestoScreen.OrderOverview);
    }

    //(Table) click events
    @FXML
    private void openTableOverviewScreen(ActionEvent event) {
        initScreenView(RestoScreen.TableOverview);
    }

    @FXML
    private void openNewTableScreen(ActionEvent event) {
        initScreenView(RestoScreen.TableNew);
    }

    @FXML
    private void openEditTableScreen(ActionEvent event) {
        //TODO Change the current view to open-edit-Table screen
        throw new NotImplementedException();

    }

    //(Waiter) click events

    @FXML
    private void openWaiterOverviewScreen(ActionEvent event) {
        initScreenView(RestoScreen.WaiterOverview);
    }

    @FXML
    private void openNewWaiterScreen(ActionEvent event) {
        initScreenView(RestoScreen.WaiterNew);

    }

    @FXML
    private void openEditWaiterScreen(ActionEvent event) {
        //TODO Change the current view to open-edit-Waiter screen
        throw new NotImplementedException();
    }
}
