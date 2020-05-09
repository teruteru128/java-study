package com.twitter.teruteru128.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class MainController {

    public MainController() {
    }

    private Stage stage;

    /**
     * @param stage the stage to set
     */
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    void close(ActionEvent event) throws Exception {
        //stage.hide();
        System.out.println("hello!");
    }
}
