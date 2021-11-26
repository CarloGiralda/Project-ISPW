package com.example.progettoispw;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField username;
    @FXML
    private TextField password;

    @FXML
    private Button registerlink;

    @FXML
    private Button login = new Button();
    @FXML
    private Button forgotPasswordButton=new Button();
    @FXML
    private Button googleLoginButton= new Button();
    @FXML
    private CheckBox rememberMeCheckBox= new CheckBox();

    final String def="Gabriele";
    final String deff="Lerani";

    String str1,str2;

    @FXML
    public int gotoForgotPassword(){
        return 1;
    }
    @FXML
    public int rememberMe(){
        return 1;
    }
    @FXML
    public int gotoGoogleLogin() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Stage window=(Stage) googleLoginButton.getScene().getWindow();
        window.setScene(new Scene(root, 240, 400));
        return 1;
    }
    @FXML
    public void checkUsernameAndPassword(ActionEvent e) throws IOException {
        str1 = username.getText();
        str2 = password.getText();
        System.out.println(str1+' '+str2);

        if(str1.equals(def) && str2.equals(deff)){
            System.out.println("Username e password corretti");
            Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
            Stage window=(Stage) login.getScene().getWindow();
            window.setScene(new Scene(root, 240, 400));
        }
        else{
            System.out.println("Username e password sbagliati");
        }
    }

    @FXML
    public void gotoRegisterNow() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RegisterPage.fxml"));
        Stage window=(Stage) registerlink.getScene().getWindow();
        window.setScene(new Scene(root, 240, 400));
    }
}