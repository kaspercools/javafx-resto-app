package org.howest.resto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.howest.resto.controller.MainController;

/*
    FIXME We need to create some hooks here so that we can nagivate between Login and MainController
 */
public class RestoJavaFxApp extends Application {
    public static void main(String[] args) {
        RestoJavaFxApp.launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/main-window/main-window.fxml"));
        primaryStage.setTitle("Howest resto app");
        loader.setController(new MainController());
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.setHeight(450);
        primaryStage.setWidth(800);
        primaryStage.show();
    }
}
