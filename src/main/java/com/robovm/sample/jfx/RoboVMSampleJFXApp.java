package com.robovm.sample.jfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class RoboVMSampleJFXApp extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        BorderPane rootNode = new BorderPane();
        rootNode.setCenter(new Label("RoboVM and JavaFX"));

        Scene scene = new Scene(rootNode, 400, 200);
        scene.getStylesheets().add("/styles/styles.css");

        stage.setTitle("RoboVM and JavaFX");
        stage.setScene(scene);
        stage.show();
    }
}
