package com.example.progettoispw;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SavedController {
    @FXML
    private Button planButton;
    @FXML
    private Button settingButton;
    @FXML
    private Button homeButton;
    @FXML
    private TextField search;

    @FXML
    public int gosearch(){
        return 1;
    }

    @FXML
    public void gotoweeklyplan() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("weeklyplan.fxml"));
        Stage window=(Stage) planButton.getScene().getWindow();
        window.setScene(new Scene(root, 240, 400));
    }

    @FXML
    public void gotoImpostazioni() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Impostazioni.fxml"));
        Stage window=(Stage) settingButton.getScene().getWindow();
        window.setScene(new Scene(root, 240, 400));
    }

    @FXML
    public void gotoHome() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Stage window=(Stage) homeButton.getScene().getWindow();
        window.setScene(new Scene(root, 240, 400));
    }
}
