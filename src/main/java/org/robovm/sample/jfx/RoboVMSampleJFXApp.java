package org.robovm.sample.jfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RoboVMSampleJFXApp extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        VBox rootNode = new VBox(10);
        rootNode.setStyle("-fx-padding: 20px");

        Label label = new Label("Enter your name");
        rootNode.getChildren().add(label);

        final TextField field = new TextField();
        rootNode.getChildren().add(field);

        final Label outputLabel = new Label();
        rootNode.getChildren().add(outputLabel);

        Button button = new Button("Say Hello");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                outputLabel.setText("Hello " + field.getText());
            }
        });
        rootNode.getChildren().add(button);


        Scene scene = new Scene(rootNode, 400, 200);
        //scene.getStylesheets().add("/styles/styles.css");

        stage.setTitle("RoboVM and JavaFX");
        stage.setScene(scene);
        stage.show();

    }
}
