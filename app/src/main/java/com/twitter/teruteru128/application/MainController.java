package com.twitter.teruteru128.application;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class MainController {

    private Logger logger = System.getLogger(MainController.class.getName());

    private Stage stage;

    /**
     * @param stage the stage to set
     */
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    void close(ActionEvent event) {
        stage.hide();
        logger.log(Level.INFO, "hello!");
    }
}
