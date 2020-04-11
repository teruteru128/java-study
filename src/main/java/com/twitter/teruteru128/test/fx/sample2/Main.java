package com.twitter.teruteru128.test.fx.sample2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text1 = new Text("Big italic red text");
        text1.setFill(Color.RED);
        text1.setFont(Font.font("851手書き雑フォント", FontPosture.ITALIC, 40));
        Text text2 = new Text(" little bold blue text");
        text2.setFill(Color.BLUE);
        text2.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
        TextFlow textFlow1 = new TextFlow(text1, text2);
        TextFlow textFlow2 = new TextFlow(text1, text2);
        HBox vbox = new HBox(textFlow1, new Pane(), textFlow2);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}