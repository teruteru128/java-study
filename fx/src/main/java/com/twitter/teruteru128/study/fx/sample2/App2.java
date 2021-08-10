package com.twitter.teruteru128.study.fx.sample2;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class App2 extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Text text1 = new Text("Big italic red text");
        text1.setFill(Color.RED);
        var url = ClassLoader.getSystemResource("851tegaki_zatsu.ttf");
        Font font = Font.loadFont(url.toString(), 40);
        text1.setFont(font);
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
