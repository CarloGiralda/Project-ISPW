package com.example.progettoispw;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MyListControllerATest {
private MyListControllerA mlca;
private ArrayList<RecipeBean> sd;
private ArrayList<RecipeBean> si;//-->lista di ricette correttamente inserite dall'utente chef,prese dal db

    @Test
    public void getRecipesChefTest() throws IOException, ClassNotFoundException {


        //caso in cui ricette inserite giuste dopo averle aggiunte
        //ISTANZIAZIONE OGGETTI USATI NEL TEST CASE
            mlca=new MyListControllerA();
            //inserire qui le ricette inserite dallo chef
             si=new ArrayList<RecipeBean>();

        //ESECUZIONE METODO DA TESTARE
            //Mi faccio restituire le ricette inserite dallo chef avviando il caso d'uso
             sd=mlca.getRecipesChef();
        //ASSERZIONE NEL VALORE ATTESO
            //Verifico se le ricette inserite dalo chef nel DB sono uguali a quelle che ho ricevuto da My list
             assertEquals(si,sd);
             System.out.println("Test caso 1 eseguito e passato con successo!");

        //caso in cui le ricette attese inserite  non corrispondono a quelle nel DB
        //ISTANZIAZIONE OGGETTI USATI NEL TEST CASE
              //modificare array in modo che non corrisponda all'array corretto di ricette inserite dallo chef
        //ESECUZIONE METODO DA TESTARE
              sd=mlca.getRecipesChef();
        //ASSERZIONE NEL VALORE ATTESO
              assertEquals(si,sd);
             System.out.println("Test caso 2 eseguito e passato con successo!");

        //caso in cui lo chef non ha ancora inserito ricette
        //ISTANZIAZIONE OGGETTI USATI NEL TEST CASE
             si=null;
        //ESECUZIONE METODO DA TESTARE
             sd=mlca.getRecipesChef();
        //ASSERZIONE NEL VALORE ATTESO
             assertEquals(si,sd);
             System.out.println("Test caso 3 eseguito e passato con successo!");

    }
}