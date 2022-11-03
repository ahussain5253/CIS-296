package com.example.samplejavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void HelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}