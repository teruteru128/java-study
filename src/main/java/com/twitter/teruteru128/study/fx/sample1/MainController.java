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
        button.setText(button.getText() + "!");
    }
}
