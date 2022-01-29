package com.example.progettoispw;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SearchDAOTest {
    private SearchDAO sd;
    private ArrayList<Recipe> recipesfromdb;
    private ArrayList<Recipe> recipesfromdbactual;
    private String name;//dati di una ricetta nel db
    private String cl;
    private String fp;
    private String username;
    @Test
    public void seachRecTest() throws Exception {
        sd=SearchDAO.getInstance();
        recipesfromdbactual=sd.searchRec(name,cl,fp,username);
        assertEquals(recipesfromdb,recipesfromdbactual);



    }

}