package com.example.javamasterclassjavafx.SceneBuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label label;

    @FXML
    public void handleAction() {
        label.setText("Ok Button pressed.");
    }
}