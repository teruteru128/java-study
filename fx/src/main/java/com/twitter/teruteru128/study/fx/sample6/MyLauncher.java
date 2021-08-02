package com.twitter.teruteru128.study.fx.sample6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyLauncher extends Application {

    public MyLauncher() {
    }

    /**
     * @inheritDoc
     */
    @Override
    public void start(Stage primaryStage) {
        Circle circ = new Circle(40, 40, 30);
        circ.setFill(Color.RED);
        Group root = new Group(circ);
        Scene scene = new Scene(root, 400, 300);

        //primaryStage.setTitle("My JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.setTitle("Launcher");
        primaryStage.show();
    }
}