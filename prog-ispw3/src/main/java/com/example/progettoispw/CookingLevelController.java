package com.example.progettoispw;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;


import java.io.File;
import java.io.IOException;
import java.nio.file.ClosedFileSystemException;
import java.util.Objects;

public class CookingLevelController {

    @FXML private Button confirmButton;
    @FXML private Button goBackButton;
    @FXML private Label selectedButtonLabel;
    @FXML private RadioButton r1;
    @FXML private RadioButton r2;
    @FXML private RadioButton r3;

    private CookingLevelControllerA clca;
    private LogBean login;
    private FileController fl;
    private BackControllerA bca;

    public CookingLevelController(){
        fl=new FileController();
        clca=new CookingLevelControllerA();
        bca=new BackControllerA();
    }

    public void initialize() throws IOException, ClassNotFoundException {
        login=fl.getLog();
        if(bca.getSpecialization().equalsIgnoreCase("User") || bca.getSpecialization().equalsIgnoreCase("Premium")) {
            if (login != null && login.getCL() != null) {
                String cl = login.getCL();
                switch (cl.toLowerCase()) {
                    case "beginner" -> r1.setSelected(true);
                    case "intermediate" -> r2.setSelected(true);
                    case "advanced" -> r3.setSelected(true);
                }
            }
        }else{
            clca.setCL("Advanced");
            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(true);
            r1.setDisable(true);
            r2.setDisable(true);
            r3.setDisable(true);
            confirmButton.setDisable(true);
        }
    }

    @FXML
    public void goBack() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Settings.fxml")));
        Stage window=(Stage) goBackButton.getScene().getWindow();
        window.setScene(new Scene(root, 850, 594));
    }

    @FXML
    public void handleCookingLevel(ActionEvent actionEvent){
        selectedButtonLabel.setText(((RadioButton)actionEvent.getSource()).getText());
        System.out.println(selectedButtonLabel.getText() + " selected");
    }

    @FXML
    public void confirmCL() throws IOException, ClassNotFoundException {
        String level = selectedButtonLabel.getText();
        //setta il cooking level dell'utente
        clca.setCL(level);
    }

}
