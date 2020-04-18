package com.twitter.teruteru128.application;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        var c = getClass();
        var fxml = c.getResource("Main.fxml");
        FXMLLoader loader = new FXMLLoader(fxml);
        BorderPane root = loader.load();
        MainController controller = loader.getController();
        controller.setStage(primaryStage);

        Scene scene = new Scene(root);
        var css = c.getResource("application.css");
        var cssef = css.toExternalForm();
        System.out.println(cssef);
        scene.getStylesheets().add(cssef);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
