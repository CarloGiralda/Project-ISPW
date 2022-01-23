package com.example.progettoispw;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HomeChefController {

    @FXML
    private AnchorPane paneHome;
    @FXML
    private AnchorPane paneSaved;
    @FXML
    private AnchorPane paneSearchRecipe;

    @FXML
    private Button addRecipeButton;
    @FXML
    private Button searchRecipeButton;
    @FXML
    private Button myListButton;
    @FXML
    private Button confirmSearchButton;

    @FXML
    private Button settingButton;
    @FXML
    private Button homeButton;
    @FXML
    private Button savedButton;

    @FXML
    private Button foodPreferencesButton;
    @FXML
    private Button shoppingListButton;

    @FXML
    private CheckBox recipe;
    @FXML
    private CheckBox time;
    @FXML
    private CheckBox ingredient;
    @FXML
    private CheckBox type;
    @FXML
    private TextField searchField;
    @FXML
    private Label labelerr;
    @FXML
    private VBox recipeBox;
    @FXML
    private VBox savedBox;


    private final SavedControllerA sca;
    private final SearchRecipeA sra;
    private final ArrayList<Button> buttons=new ArrayList<>();
    private ArrayList<AnchorPane> aps;

    public HomeChefController() throws IOException, ClassNotFoundException {
        sra=new SearchRecipeA();
        sca=new SavedControllerA();
        aps=new ArrayList<>();
    }

    @FXML
    public void gotoSettings() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Settings.fxml")));
        Stage window=(Stage) settingButton.getScene().getWindow();
        window.setScene(new Scene(root, 850, 594));
    }

    @FXML
    public void handleSideBar(ActionEvent event) throws IOException, ClassNotFoundException {
        Object source = event.getSource();
        if(source.equals(homeButton)) {
            if (checkPaneState(paneHome)) {

                manageButtonEffect(0);

                enablePane(paneSaved, false);
                enablePane(paneSearchRecipe, false);
                enablePane(paneHome, true);
            }
        }

        else if(source.equals(savedButton) && checkPaneState(paneSaved)) {
            manageButtonEffect(1);

            enablePane(paneSearchRecipe, false);
            enablePane(paneHome, false);
            enablePane(paneSaved, true);

            List<RecipeBean> recipes = sca.saved();
            aps.clear();
            buttons.clear();
            savedBox.getChildren().clear();
            if(recipes!=null && recipes.size()>0){
                for(int i = 0; i< recipes.size(); i++) {
                    buttons.add(new Button(recipes.get(i).getName()));
                    buttons.get(i).setPrefSize(556, 50);
                    buttons.get(i).setFont(Font.font("Centhury Gothic", 15));

                    aps.add(new AnchorPane());
                    aps.get(i).getChildren().addAll(buttons.get(i));
                    aps.get(i).setLeftAnchor(buttons.get(i), 10.0);
                    aps.get(i).setTopAnchor(buttons.get(i), 10.0);

                    savedBox.getChildren().add(buttons.get(i));
                }
            }
        }
    }

    @FXML
    public void gotoAddRecipe() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Add-recipe.fxml")));
        Stage window=(Stage) addRecipeButton.getScene().getWindow();
        window.setScene(GeneralScene.getAdd(root));
    }

    @FXML
    public void handleSearchRecipeMyListMenu(ActionEvent event) throws IOException {
        Object source = event.getSource();

        if (searchRecipeButton.equals(source)) {
            enablePane(paneSearchRecipe,true);
            enablePane(paneHome,false);
            enablePane(paneSaved,false);
            enablePane(paneHome,false);
        }

        else if (myListButton.equals(source)) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MyList.fxml")));
            Stage window=(Stage) myListButton.getScene().getWindow();
            window.setScene(GeneralScene.getAdd(root));
        }
    }

    @FXML
    public void showShoppingList() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ShoppingList.fxml")));
        Stage window=(Stage) shoppingListButton.getScene().getWindow();
        window.setScene(new Scene(root, 850, 594));
    }

    @FXML
    public void showFoodPreferences() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AlimentarPreferences.fxml")));
        Stage window=(Stage) foodPreferencesButton.getScene().getWindow();
        window.setScene(new Scene(root, 850, 594));
    }

    @FXML
    public void gobackFromSearchRecipe(){
        enablePane(paneSaved, false);
        enablePane(paneSearchRecipe, true);
        enablePane(paneHome, false);
    }

    @FXML
    public void addDynamicElement() throws IOException, ClassNotFoundException {
        RecipeBean rb;
        ArrayList<Button> bt = new ArrayList<>();
        ArrayList<Label> lb = new ArrayList<>();
        ArrayList<ImageView> iw = new ArrayList<>();
        List<RecipeBean> rbs = new ArrayList<>();

        recipeBox.getChildren().clear();
        try {
            if (recipe.isSelected()) {
                String rec = searchField.getText();
                rb = new RecipeBean(rec);
                rbs = sra.searchRecipe(rb);
                time.setSelected(false);
                ingredient.setSelected(false);
                type.setSelected(false);
            } else if (time.isSelected()) {
                String tm=searchField.getText();
                rbs=sra.searchRecipeTime(tm);
                ingredient.setSelected(false);
                type.setSelected(false);
            } else if (ingredient.isSelected()) {
                String ingr=searchField.getText();
                rbs=sra.searchRecipeIngr(ingr);
                type.setSelected(false);
            } else if (type.isSelected()) {
                String t=searchField.getText();
                rbs=sra.searchRecipeType(t);
            }
            aps = new ArrayList<>();
            for (int i = 0; i < rbs.size(); i++) {
                bt.add(new Button(rbs.get(i).getName()));
                bt.get(i).setMaxSize(100, 30);

                int finalI = i;
                bt.get(i).setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        IndexTrace.raset(finalI);
                        IndexTrace.setFive(0);
                        Parent root = null;
                        try {
                            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Recipetemplate.fxml")));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Stage window=(Stage) paneHome.getScene().getWindow();
                        window.setScene(GeneralScene.getRecipe(root));
                    }
                });

                lb.add(new Label(rbs.get(i).getChef()));
                lb.get(i).setMaxSize(100, 20);
                iw.add(new ImageView());
                iw.get(i).setImage(new Image(new ByteArrayInputStream(rbs.get(i).getImage())));
                iw.get(i).setFitHeight(75);
                iw.get(i).setFitWidth(100);
                aps.add(new AnchorPane());
                aps.get(i).getChildren().addAll(bt.get(i), lb.get(i), iw.get(i));
                aps.get(i).setMaxSize(564,75);
                aps.get(i).setLeftAnchor(bt.get(i), 10.0);
                aps.get(i).setTopAnchor(bt.get(i), 10.0);
                aps.get(i).setLeftAnchor(lb.get(i), 15.0);
                aps.get(i).setTopAnchor(lb.get(i), 40.0);
                aps.get(i).setRightAnchor(iw.get(i), 110.0);
                aps.get(i).setTopAnchor(iw.get(i), 0.0);
                recipeBox.getChildren().add(aps.get(i));
            }
        }catch(MyException e){
            labelerr.setText("Ricetta o immagine relativa non trovata");
        }
    }

    private void enablePane(AnchorPane pane,boolean able) {
        if (!able) {
            pane.toBack();
            pane.setOpacity(0);
            pane.setDisable(true);
        }
        else{
            pane.toFront();
            pane.setOpacity(1);
            pane.setDisable(false);
        }
    }

    private boolean checkPaneState(AnchorPane pane){
        return (pane.getOpacity() != 1);
    }

    private void manageButtonEffect(int index) {
        final Button[] sideBarButtons = {homeButton, savedButton};
        for (int elem = 0; elem < sideBarButtons.length; elem++) {
            if (elem == index) {
                sideBarButtons[elem].getStyleClass().remove("button, focus");
                sideBarButtons[elem].getStyleClass().add("buttonAfterClick");
            } else {
                sideBarButtons[elem].getStyleClass().clear();
                sideBarButtons[elem].getStyleClass().add("button");
            }
        }
    }


}
