package com.example.progettoispw;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WeeklyPlanControllerATest {

    private boolean bool1;
    private boolean bool2;
    private boolean bool3;
    private WeeklyPlanControllerA wpca;
    @Test
    public void calcTest() throws IOException, ClassNotFoundException {

        //caso calcolo del weekly plan con le preferenze alimentari e il livello culinario settati
        //ISTANZIAZIONE OGGETTI USATI NEL TEST CASE
         wpca=new WeeklyPlanControllerA();
        //ESECUZIONE METODO DA TESTARE
         bool1=wpca.calc();
        //ASSERZIONE NEL VALORE ATTESO
        assertEquals(true, bool1);
        //caso in cui livello culinario non è settato
        //ISTANZIAZIONE OGGETTI USATI NEL TEST CASE
        wpca=new WeeklyPlanControllerA();
        //ESECUZIONE METODO DA TESTARE
       bool2=wpca.calc();
        //ASSERZIONE NEL VALORE ATTESO
        assertEquals(false, bool2);
        System.out.println("Test caso 2 eseguito e passato con successo!");
     //caso in cui le preferenzea alimentari non sono state settate dall'utente
        //ISTANZIAZIONE OGGETTI USATI NEL TEST CASE
        wpca=new WeeklyPlanControllerA();
        //ESECUZIONE METODO DA TESTARE
        bool3=wpca.calc();
        //ASSERZIONE NEL VALORE ATTESO
        assertEquals(false, bool3);
        System.out.println("Test caso 3 eseguito e passato con successo!");

    }
}