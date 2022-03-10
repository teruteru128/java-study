package com.twitter.teruteru128.study.fx.sample1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    public MainController() {
    }

    @FXML
    public Button helloButton;

    @FXML
    public void onHello(ActionEvent event) {
        Button button = (Button) event.getSource();
        String newText = button.getText() + "!";
        if(newText.length() >= 16){
            newText = newText.replaceAll("!+", "");
            System.out.println(newText);
        }
        button.setText(newText);
    }
}
