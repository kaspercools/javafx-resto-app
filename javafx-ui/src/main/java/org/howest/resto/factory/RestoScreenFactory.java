package org.howest.resto.factory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.howest.resto.controller.menuItem.MenuItemNewController;
import org.howest.resto.controller.menu.MenuOverviewScreenController;
import org.howest.resto.controller.menu.itemprice.MenuItemPriceNewScreenController;
import org.howest.resto.controller.menuItem.MenuItemOverviewScreenController;
import org.howest.resto.controller.order.OrderOverviewScreenController;
import org.howest.resto.controller.table.TableNewScreenController;
import org.howest.resto.controller.table.TableOverviewScreenController;
import org.howest.resto.controller.waiter.WaiterNewScreenController;
import org.howest.resto.controller.waiter.WaiterOverviewScreenController;
import org.howest.service.impl.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;


public class RestoScreenFactory {

    public Parent createLoginScreen() {
        // TODO create the login screen. We can't call this function from our MainController!
        throw new NotImplementedException();
    }

    private Parent tryToLoadScreen(FXMLLoader loader) {
        try {
            return (Parent) loader.load();
        } catch (IOException e) {
            //TODO HANDLE EXCEPTION, show fancy error screen.

        }
        return null;
    }

    public Parent createTableOverviewScreen() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/tables/overview.fxml"));
        loader.setController(new TableOverviewScreenController(new TableServiceImpl()));
        return tryToLoadScreen(loader);
    }

    public Parent createTableNewScreen() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/tables/detail.fxml"));
        loader.setController(new TableNewScreenController(new TableServiceImpl()));
        return tryToLoadScreen(loader);
    }

    public Parent createTableEditScreen() {
        // TODO create a new edit screen. What about the id that we need to load the initial information?
        throw new NotImplementedException();
    }


    public Parent createOrderOverviewScreen() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/orders/overview.fxml"));
        loader.setController(new OrderOverviewScreenController(new OrderServiceImpl()));
        return tryToLoadScreen(loader);
    }

    public Parent createMenuItemEditScreen() {
        // TODO create a new edit screen. What about the id that we need to load the initial information?
        throw new NotImplementedException();
    }

    public Parent createMenuItemNewScreen() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/menu-items/detail.fxml"));
        loader.setController(new MenuItemNewController(new MenuItemServiceImpl()));
        return tryToLoadScreen(loader);
    }

    public Parent createMeuItemOverviewScreen() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/menu-items/overview.fxml"));
        loader.setController(new MenuItemOverviewScreenController(new MenuItemServiceImpl()));
        return tryToLoadScreen(loader);
    }

    public Parent createMenuItemPriceEditScreen() {
        // TODO create a new edit screen. What about the id that we need to load the initial information?
        throw new NotImplementedException();
    }

    public Parent createMenuItemPriceNewScreen() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/menu/item-price/detail.fxml"));
        loader.setController(new MenuItemPriceNewScreenController(new MenuServiceImpl()));
        return tryToLoadScreen(loader);
    }

    public Parent createMenuOverviewScreen() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/menu/overview.fxml"));
        loader.setController(new MenuOverviewScreenController(new MenuServiceImpl()));
        return tryToLoadScreen(loader);
    }

    public Parent createWaiterOVerviewScreen() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/waiters/overview.fxml"));
        loader.setController(new WaiterOverviewScreenController(new WaiterServiceImpl()));
        return tryToLoadScreen(loader);
    }

    public Parent createWaiterEditScreen() {
        // TODO create a new edit screen. What about the id that we need to load the initial information?
        throw new NotImplementedException();
    }

    public Parent createWaiterNewScreen() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/waiters/detail.fxml"));
        loader.setController(new WaiterNewScreenController(new WaiterServiceImpl()));
        return tryToLoadScreen(loader);
    }
}
