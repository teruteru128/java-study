package com.twitter.teruteru128.test.fx.sample4;

import java.util.Map;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "Main.fxml"));
            GridPane root = loader.load();
            if (this.getParameters().getRaw().contains("--admin")) {
                loader.<MainController> getController().setAdminMode(true);
            }
            for (String s : this.getParameters().getRaw()) {
                System.out.printf("%s raw%n",s);
            }
            for (String s : this.getParameters().getUnnamed()) {
                System.out.printf("%s unnamed%n",s);
            }
            for (Map.Entry<String, String> s : this.getParameters().getNamed()
                    .entrySet()) {
                System.out.printf("%s,[key=%s,val=%s] named%n",s,s.getKey(),s.getValue());
            }
            Scene scene = new Scene(root);
            scene.getStylesheets().add(
                    getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace(System.err);
            throw e;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
