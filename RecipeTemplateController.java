package com.example.progettoispw;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class RecipeTemplateController {

    @FXML
    private Button goBackButton;
    @FXML
    private Label difficult;
    @FXML
    private Label cookingTime;
    @FXML
    private Label dishType;
    @FXML
    private VBox ingredientBox;
    @FXML
    private TextArea descriptionArea;
    @FXML
    private Label recipeTitle;


    @FXML
    private Button likeButton;

    public void goBack() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Home.fxml")));
        Stage window=(Stage) goBackButton.getScene().getWindow();
        window.setScene(new Scene(root, 850, 594));
    }

    public void setLike(){

    }



}
