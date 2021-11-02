package com.example.project;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene();
        stage.setScene(scene);
        stage.show();
    }

    String username;
    String def="Gabriele";
    String password;
    String deff="Lerani";

    public void getUsername(EventHandler event) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        username=br.readLine();
        if(username!=def){
            System.out.println("Ritenta");
        }
    }

    public void getPassword(EventHandler event) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        password=br.readLine();
        if(password!=deff){
            System.out.println("Riprova");
        }
    }

    public void logIn(){
        if(username==def && password==deff){
            System.out.println("Fatto");
        }
    }

    public static void main(String[] args) {
        launch();
    }
}