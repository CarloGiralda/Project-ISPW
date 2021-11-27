package com.example.progettoispw;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterPageController {
    @FXML
    private Button registerButton;
    @FXML
    private TextField ageField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField username;
    @FXML
    private TextField passwordField;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField cookingLevelField;
    @FXML
    public int setAge(){
        return 1;
    }
    @FXML
    public int setEmail(){
        return 1;
    }
    @FXML
    public int setUsername(){
        return 1;
    }
    @FXML
    public int setPassword(){
        return 1;
    }
    @FXML
    public int setCookingLevel(){
        return 1;
    }
    @FXML
    public void gotoHome() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Stage window=(Stage) registerButton.getScene().getWindow();
        window.setScene(new Scene(root, 240, 400));
    }
}
