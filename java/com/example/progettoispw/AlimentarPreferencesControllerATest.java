package com.example.progettoispw;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AlimentarPreferencesControllerATest {
    private AlimentarPreferencesControllerA apca;
    private String preferenzeUtenteDalDB;
    private String preferenzeAttuali;
    @Test
    public void getPrefTest() throws IOException, ClassNotFoundException {
        apca=new AlimentarPreferencesControllerA();
        preferenzeUtenteDalDB="preferenze alimentari delll'utente";
        preferenzeAttuali=apca.getPref();
        assertEquals(preferenzeUtenteDalDB,preferenzeAttuali);



    }

}