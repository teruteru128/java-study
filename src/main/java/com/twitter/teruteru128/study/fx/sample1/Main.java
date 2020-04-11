package com.twitter.teruteru128.study.fx.sample1;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public Main() {
    }

    /**
     * 
     * @param stage
     *            {@inheritDoc}
     * @throws IOException
     *             ファイルリソースの読み込みに失敗したとき。
     * @throws Exception
     * */
    @Override
    public void start(Stage stage) throws IOException, Exception {
        try {
            VBox root = FXMLLoader.load(getClass().getResource("MainUI.fxml"));
            Scene scene = new Scene(root, 800, 640);
            scene.getStylesheets().add(
                    getClass().getResource("application.css").toExternalForm());
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

}
