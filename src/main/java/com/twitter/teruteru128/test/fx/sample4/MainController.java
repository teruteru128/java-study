package com.twitter.teruteru128.test.fx.sample4;

import java.util.Collections;
import java.util.LinkedList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class MainController {
    @FXML
    private Button btnSend;
    @FXML
    private Button btnEnable;
    @FXML
    private Button btnDisable;
    @FXML
    private Button btnAdmin;
    private LinkedList<StatusUpdate> list1;
    private LinkedList<StatusUpdate> list2;
    Twitter twitter = null;
    private boolean adminMode = false;

    public MainController() {
        list1 = new LinkedList<StatusUpdate>();
        list1.add(new StatusUpdate("テスト"));
        list1.add(new StatusUpdate("で？"));
        list1.add(new StatusUpdate("てすてす"));
        list1.add(new StatusUpdate("オリオン座の下で？"));
        list1.add(new StatusUpdate("フタエノ"));
        list1.add(new StatusUpdate("キワミ"));
        list1.add(new StatusUpdate("アッー！"));
        Collections.shuffle(list1);
        list2 = new LinkedList<StatusUpdate>();
    }

    @FXML
    public void sendTweet() {
        if (twitter == null) {
            twitter = TwitterFactory.getSingleton();
        }
        try {
            twitter.updateStatus(getStatusUpdate());
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void enableSend() {
        setSendDisable(false);
    }

    @FXML
    public void disableSend() {
        setSendDisable(true);
    }

    private StatusUpdate getStatusUpdate() {
        StatusUpdate result = list1.removeFirst();
        list2.push(result);
        if (list1.isEmpty()) {
            list1.addAll(list2);
            list2.clear();
        }
        return result;
    }

    private void setSendDisable(boolean value) {
        btnDisable.setDisable(value);
        btnSend.setDisable(value);
        btnEnable.setDisable(!value);
    }

    public boolean isAdminMode() {
        return adminMode;
    }

    public void setAdminMode(boolean adminMode) {
        this.adminMode = adminMode;
        btnAdmin.setDisable(!adminMode);
    }
}
