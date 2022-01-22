package com.example.progettoispw;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class RecipeTemplateControllerA {
    private RecipeBean rb;
    private RecipeTemplateDAO dao;
    private Recipe recipe;
    private FileInterDAO filedao;
    private ArrayList<RecipeBean> rbs;
    private ArrayList<Recipe> recipes;
    private ArrayList<Recipe> r;
    private Recipe rec;
    private ArrayList<Meal> meals;

    public RecipeTemplateControllerA(){
        filedao= FileInterDAO.getInstance();
        dao=RecipeTemplateDAO.getInstance();
        rbs=new ArrayList<>();
        r=new ArrayList<>();
        meals=new ArrayList<>();
    }

    public RecipeBean getRecipe() throws IOException, ClassNotFoundException {
        recipe=dao.getRecipe();
        rb=Convert.ConvertEntityToBean(recipe);
        return rb;
    }

    public ArrayList<RecipeBean> getArray() throws IOException, ClassNotFoundException {
        rbs.clear();
        recipes=filedao.readRecipe();
        for (Recipe value : recipes) {
            rbs.add(Convert.ConvertEntityToBean(value));
        }
        return rbs;
    }

    public ArrayList<RecipeBean> getSaving() throws IOException, ClassNotFoundException {
        rbs.clear();
        recipes=filedao.readSaved();
        for (Recipe value : recipes) {
            rbs.add(Convert.ConvertEntityToBean(value));
        }
        return rbs;
    }

    public RecipeBean getMeal(int choose) throws IOException, ClassNotFoundException {
        meals=filedao.readPlan(IndexTrace.dayget()-1);
        if(IndexTrace.timeget()==1 || IndexTrace.timeget()==3){
            Meal meal=meals.get(IndexTrace.timeget()-1);
            recipe=meal.getRecipe();
            rb=Convert.ConvertEntityToBean(recipe);
        }else if(IndexTrace.timeget()==2){
            MealLunch meal= (MealLunch) meals.get(IndexTrace.timeget()-1);
            recipe=meal.getRecipe(choose);
            rb=Convert.ConvertEntityToBean(recipe);
        }
        return rb;
    }

    public RecipeBean getRecipeChef() throws IOException, ClassNotFoundException {
        rbs.clear();
        recipes=filedao.readChef();
        rb=Convert.ConvertEntityToBean(recipes.get(IndexTrace.chefget()));
        return rb;
    }

    public void saveRecipe(RecipeBean rb) throws IOException, ClassNotFoundException {
        rec=Convert.ConvertBeanToEntity(rb);
        r=filedao.readSaved();
        if(r!=null) {
            for (Recipe value : r) {
                if (value.getName().equals(rec.getName()) && value.getChef().equals(rec.getChef())) {
                    return;
                }
            }
        }
        filedao.writeSaved(rec);
    }
}
