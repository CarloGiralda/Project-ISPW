package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField email;

    String[] user=new String[1024];
    String[] pass=new String[1024];
    String[] em=new String[1024];
    int j,k,l;

    @FXML
    protected void getUsername(ActionEvent event){
        int i=0;
        while(user[i]!=null){
            i++;
        }
        user[i]=username.getText();
        j=i;
    }

    @FXML
    protected void getPassword(ActionEvent event){
        int i=0;
        while(pass[i]!=null){
            i++;
        }
        pass[i]=password.getText();
        k=i;
    }

    @FXML
    protected void getEmail(ActionEvent event){
        int i=0;
        while(em[i]!=null){
            i++;
        }
        em[i]=email.getText();
        l=i;
    }

    @FXML
    protected void SignUp(ActionEvent event){
        if(j==k && k==l){
            System.out.println("Accettato");
        }else{
            System.out.println(("Rifiutato"));
        }
    }
}