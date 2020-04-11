package com.twitter.teruteru128.study.fx.sample3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Teruteru
 *
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * (非 Javadoc)
     * 
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parameters params = this.getParameters();
        System.out.println(params.getRaw().contains("--admin"));
        for (String e : params.getRaw()) {
            System.out.println(e);
        }
        primaryStage.setScene(new Scene(new VBox(), 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

}