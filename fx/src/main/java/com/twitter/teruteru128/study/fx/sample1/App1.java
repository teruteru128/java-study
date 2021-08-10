package com.twitter.teruteru128.study.fx.sample1;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 
 * @see https://openjfx.io/javadoc/14/
 */
public class App1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public App1() {
    }

    /**
     * 
     * @param stage {@inheritDoc}
     * @throws IOException ファイルリソースの読み込みに失敗したとき。
     */
    @Override
    public void start(Stage stage) throws IOException {
        var c = getClass();
        var mainUIURL = c.getResource("MainUI.fxml");
        VBox root = FXMLLoader.load(mainUIURL);
        Scene scene = new Scene(root, 800, 640);
        var CSSURL = c.getResource("application.css");
        String applicationCSSURL = CSSURL.toExternalForm();
        scene.getStylesheets().add(applicationCSSURL);
        stage.setScene(scene);
        stage.show();
    }

}
