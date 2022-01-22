package com.example.progettoispw;

import java.io.IOException;
import java.util.ArrayList;

public class MyListControllerA {
    private FileInterDAO filedao;
    private ArrayList<Recipe> recipes;
    private ArrayList<RecipeBean> rbs;

    public MyListControllerA(){
        filedao=FileInterDAO.getInstance();
        rbs=new ArrayList<>();
    }

    public ArrayList<RecipeBean> getRecipesChef() throws IOException, ClassNotFoundException {
        recipes=filedao.readChef();
        if(recipes==null){
            return null;
        }
        rbs.clear();
        for (Recipe recipe : recipes) {
            rbs.add(Convert.ConvertEntityToBean(recipe));
        }
        return rbs;
    }
}
