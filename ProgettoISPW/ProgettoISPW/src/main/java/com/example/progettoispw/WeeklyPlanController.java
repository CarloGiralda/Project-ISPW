package com.example.progettoispw;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class WeeklyPlanController {
    @FXML
    private Button homeButton;
    @FXML
    private Button settingButton;
    @FXML
    private Button savedButton;

    @FXML
    public void gotoHome() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Stage window=(Stage) homeButton.getScene().getWindow();
        window.setScene(new Scene(root, 240, 400));
    }

    @FXML
    public void gotoSettings() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Impostazioni.fxml"));
        Stage window=(Stage) settingButton.getScene().getWindow();
        window.setScene(new Scene(root, 240, 400));
    }

    @FXML
    public void gotoSaved() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("saved.fxml"));
        Stage window=(Stage) savedButton.getScene().getWindow();
        window.setScene(new Scene(root, 240, 400));
    }
}
