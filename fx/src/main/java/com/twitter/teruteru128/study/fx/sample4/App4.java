package com.twitter.teruteru128.study.fx.sample4;

import java.io.IOException;
import java.util.Map;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App4 extends Application {

    public App4() {
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        var c = getClass();
        var fxml = c.getResource("Main.fxml");
        FXMLLoader loader = new FXMLLoader(fxml);
        Pane root = loader.load();
        MainController controller = loader.getController();
        controller.setStage(primaryStage);
        if (this.getParameters().getRaw().contains("--admin")) {
            controller.setAdminMode(true);
        }
        for (String s : this.getParameters().getRaw()) {
            System.out.printf("%s raw%n", s);
        }
        for (String s : this.getParameters().getUnnamed()) {
            System.out.printf("%s unnamed%n", s);
        }
        for (Map.Entry<String, String> s : this.getParameters().getNamed().entrySet()) {
            System.out.printf("%s,[key=%s,val=%s] named%n", s, s.getKey(), s.getValue());
        }
        Scene scene = new Scene(root);
        var css = c.getResource("application.css");
        var cssef = css.toExternalForm();
        scene.getStylesheets().add(cssef);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
