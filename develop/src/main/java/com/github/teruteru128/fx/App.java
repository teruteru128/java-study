package com.github.teruteru128.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class App extends Application {
	public App() {
	}

	@Override
	public void start(Stage stage) throws Exception {
		var btn = new Button("test button");
		var scene = new Scene(btn, 200, 250);
		stage.setScene(scene);
		stage.show();
	}
}
