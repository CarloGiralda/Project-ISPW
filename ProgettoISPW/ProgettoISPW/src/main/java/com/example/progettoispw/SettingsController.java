package com.example.progettoispw;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SettingsController {
    @FXML
    private Button planButton;
    @FXML
    private Button homeButton;
    @FXML
    private Button savedButton;
    @FXML
    private Button cookingLevelButton;
    @FXML
    private Button privacyButton;
    @FXML
    private Button accountButton;
    @FXML
    private Button termsButton;
    @FXML
    private Button tutorialButton;
    @FXML
    public int gotoCookingLevel(){
        return 1;
    }
    @FXML
    public int gotoPrivacy(){
        return 1;
    }
    @FXML
    public int gotoAccount(){
        return 1;
    }
    @FXML
    public int gotoTerms(){
        return 1;
    }
    @FXML
    public int gotoTutorial(){
        return 1;
    }
    @FXML
    public void gotoweeklyplan() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("weeklyplan.fxml"));
        Stage window=(Stage) planButton.getScene().getWindow();
        window.setScene(new Scene(root, 240, 400));
    }

    @FXML
    public void gotoHome() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Stage window=(Stage) homeButton.getScene().getWindow();
        window.setScene(new Scene(root, 240, 400));
    }

    @FXML
    public void gotoSaved() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("saved.fxml"));
        Stage window=(Stage) savedButton.getScene().getWindow();
        window.setScene(new Scene(root, 240, 400));
    }
}
