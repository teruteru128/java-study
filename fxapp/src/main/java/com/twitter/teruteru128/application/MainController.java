package com.twitter.teruteru128.application;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {

    private Logger logger = System.getLogger(MainController.class.getName());

    private Stage stage;
    @FXML
    private Button centerButton;

    @FXML
    private Button yes;
    @FXML
    private Button no;
    @FXML
    private Button ok;
    @FXML
    private Button cancel;

    /**
     * @param stage the stage to set
     */
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    void ok() {
        logger.log(Level.INFO, "hello!");
    }

    @FXML
    void close(ActionEvent event) {
        stage.hide();
    }
}
