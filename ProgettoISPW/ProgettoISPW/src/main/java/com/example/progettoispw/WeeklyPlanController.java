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
    private Button modifyPlanButton;
    @FXML
    private Button B1;
    @FXML
    private Button L1;
    @FXML
    private Button D1;
    @FXML
    private Button B2;
    @FXML
    private Button L2;
    @FXML
    private Button D2;
    @FXML
    private Button B3;
    @FXML
    private Button L3;
    @FXML
    private Button D3;
    @FXML
    private Button B4;
    @FXML
    private Button L4;
    @FXML
    private Button D4;
    @FXML
    private Button B5;
    @FXML
    private Button L5;
    @FXML
    private Button D5;
    @FXML
    private Button B6;
    @FXML
    private Button L6;
    @FXML
    private Button D6;
    @FXML
    private Button B7;
    @FXML
    private Button L7;
    @FXML
    private Button D7;
    @FXML
    public int gotoModifyPlan(){
        return 1;
    }
    @FXML
    public int gotoB1(){
        return 1;
    };
    @FXML
    public int gotoL1(){
        return 1;
    };
    @FXML
    public int gotoD1(){
        return 1;
    };
    @FXML
    public int gotoB2(){
        return 1;
    };
    @FXML
    public int gotoL2(){
        return 1;
    };
    @FXML
    public int gotoD2(){
        return 1;
    };
    @FXML
    public int gotoB3(){
        return 1;
    };
    @FXML
    public int gotoL3(){
        return 1;
    };
    @FXML
    public int gotoD3(){
        return 1;
    };
    @FXML
    public int gotoB4(){
        return 1;
    };
    @FXML
    public int gotoL4(){
        return 1;
    };
    @FXML
    public int gotoD4(){
        return 1;
    };
    @FXML
    public int gotoB5(){
        return 1;
    };
    @FXML
    public int gotoL5(){
        return 1;
    };
    @FXML
    public int gotoD5(){
        return 1;
    };
    @FXML
    public int gotoB6(){
        return 1;
    };
    @FXML
    public int gotoL6(){
        return 1;
    };
    @FXML
    public int gotoD6(){
        return 1;
    };
    @FXML
    public int gotoB7(){
        return 1;
    };
    @FXML
    public int gotoL7(){
        return 1;
    };
    @FXML
    public int gotoD7(){
        return 1;
    };


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
