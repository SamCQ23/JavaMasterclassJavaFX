package com.example.javamasterclassjavafx.JavaFXApplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(
                "/com/example/javamasterclassjavafx/Application.fxml"));
//        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        stage.setTitle("Hello JavaFX!");
        stage.setScene(new Scene(root, 600, 275));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

