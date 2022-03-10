package com.twitter.teruteru128.application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {

  @Override
  public void start(Stage primaryStage) throws IOException {
    var c = getClass();
    var fxml = c.getResource("Main.fxml");
    FXMLLoader loader = new FXMLLoader(fxml);
    Pane root = loader.load();
    MainController controller = loader.getController();
    controller.setStage(primaryStage);

    Scene scene = new Scene(root);
    var css = c.getResource("application.css");
    var cssef = css.toExternalForm();
    scene.getStylesheets().add(cssef);

    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
