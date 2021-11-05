package com.example.interfacce;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField username;
    @FXML
    private TextField password;

    @FXML
    private Button login = new Button();

    final String def="Gabriele";
    final String deff="Lerani";

    String str1,str2;

    @FXML
    public void checkUsernameAndPassword(ActionEvent e) {

        str1 = username.getText();
        str2 = password.getText();
        System.out.println(str1+' '+str2);

        if(str1.equals(def) && str2.equals(deff)){
            System.out.println("Username e password corretti");
        }
        else{
            System.out.println("Username e password sbagliati");
        }

    }

}
