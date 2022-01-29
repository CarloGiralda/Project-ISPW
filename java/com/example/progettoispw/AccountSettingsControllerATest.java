package com.example.progettoispw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class AccountSettingsControllerATest {
     private AccountSettingsControllerA asca;
    int b1;
    int b2;
    int b3;

    @Test
    public void confirmPassTest() throws Exception {
        //caso in cui la nuova password inserita non è vuota, può essere accettata
        //ISTANZIAZIONE OGGETTI USATI NEL TEST CASE
        asca=new AccountSettingsControllerA();
        String s=new String();
        s="234638jdhdi";
        //ESECUZIONE METODO DA TESTARE
        b1=asca.confirmPass(s);
        //ASSERZIONE NEL VALORE ATTESO mi aspetto un valore 0 ossia che termini con successo il caso d'uso
       assertEquals(0,b1);
        System.out.println("Test caso 1 eseguito e passato con successo!");
        //caso in cui la nuova password sia vuota
        //ISTANZIAZIONE OGGETTI USATI NEL TEST CASE
         asca=new AccountSettingsControllerA();
         s=new String("");
        //ESECUZIONE METODO DA TESTARE
        b2=asca.confirmPass(s);
        //ASSERZIONE NEL VALORE ATTESO  mi aspetto un valore 1 ossia che non termini con successo il caso d'uso
        assertEquals(1,b2);
        System.out.println("Test caso 2 eseguito e passato con successo!");

    }

}