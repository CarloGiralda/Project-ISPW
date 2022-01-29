package com.example.progettoispw;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HistoryControllerATest {
    private HistoryControllerA hca;
    private ArrayList<RecipeBean> recipesHistory;
    private ArrayList<RecipeBean> recipesrx;
    @Test
    public void getRecipesTest() throws IOException, ClassNotFoundException {
         hca=new HistoryControllerA();
         recipesHistory =new ArrayList<RecipeBean>();//già settato l'array di ricette attese
         recipesrx=hca.getRecipes();
         assertEquals(recipesHistory,recipesrx);

    }

}