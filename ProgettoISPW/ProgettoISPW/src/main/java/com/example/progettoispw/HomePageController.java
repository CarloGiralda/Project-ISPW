package com.example.progettoispw;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {
    @FXML
    private Button planButton;
    @FXML
    private Button settingButton;
    @FXML
    private Button savedButton;
    @FXML
    private Button recipesHistoryButton;
    @FXML
    private Button saveButton;
    @FXML
    private Button supermarketButton;
    @FXML
    private Button plusButton;

    @FXML
    public int showRecipesHistory(){
        return 1;
    }
    @FXML
    public int showSavedRecipes(){
        return 1;
    }
    @FXML
    public int showSupermarkets(){
        return 1;
    }
    @FXML
    public int plusaction(){
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
    public void gotoSaved() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("saved.fxml"));
        Stage window=(Stage) savedButton.getScene().getWindow();
        window.setScene(new Scene(root, 240, 400));
    }
}
