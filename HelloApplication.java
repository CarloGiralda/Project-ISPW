package com.example.project;

import javafx.application.Application;
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

    public static void getUsername(){
        String username;
        String def;
        def = "Gabriele";
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        username=br.readLine();
        if(username!=def){
            System.out.println("Ritenta");
        }
    }

    public static void getPassword(){
        String password;
        String def="Lerani";
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        password=br.readLine();
        if(password!=def){
            System.out.println("Riprova");
        }
    }

    public static void main(String[] args) {
        launch();
    }
}