/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Sample Skeleton for 'case.fxml' Controller Class
 */
package com.afpa.casesacocher;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class CaseController implements Initializable {

    @FXML // fx:id="TextUser"
    private TextField TextUser; // Value injected by FXMLLoader

    @FXML // fx:id="result"
    private Label result; // Value injected by FXMLLoader

    @FXML
    private ListView<?> listBg;

    @FXML // fx:id="bgRedBtn"
    private RadioButton bgRedBtn; // Value injected by FXMLLoader

    @FXML // fx:id="bgGreenBtn"
    private RadioButton bgGreenBtn; // Value injected by FXMLLoader
    @FXML // fx:id="bgRedBtn"
    private RadioButton bgBlueBtn; // Value injected by FXMLLoader
      @FXML
    private ListView<?> listText;

    @FXML // fx:id="textRedBtn"
    private RadioButton textRedBtn; // Value injected by FXMLLoader

  
    
    @FXML // fx:id="textGreenBtn"
    private RadioButton textWhiteBtn; // Value injected by FXMLLoader

    @FXML // fx:id="textBlackBtn"
    private RadioButton textBlackBtn; // Value injected by FXMLLoader

    @FXML // fx:id="lowercaseBtn"
    private RadioButton lowercaseBtn; // Value injected by FXMLLoader

    @FXML // fx:id="uppercaseBtn"
    private RadioButton uppercaseBtn; // Value injected by FXMLLoader

    @FXML // fx:id="checkBg"
    private CheckBox checkBg; // Value injected by FXMLLoader

    @FXML // fx:id="checkText"
    private CheckBox checkText; // Value injected by FXMLLoader

    @FXML // fx:id="checkCasse"
    private CheckBox checkCasse; // Value injected by FXMLLoader

    // activation ou désactivation de la partie fond
    public void font(){
        if(checkBg.isSelected()){
            
        }
    }
    public void change() {
        // La valeur du label prend la valeur du texte
        result.setText(TextUser.getText());
    }

    public void bgRed() {

        bgGreenBtn.setSelected(false);
        bgBlueBtn.setSelected(false);
        result.getStyleClass().removeIf(s -> s.startsWith("bg"));
         result.setStyle("-fx-background-color: red; ");
         if( textRedBtn.isSelected()){
            result.setStyle("-fx-background-color: red; " + "-fx-text-fill: red; ");
        } 
         if( textRedBtn.isSelected() && lowercaseBtn.isSelected()){
            result.setStyle("-fx-background-color: red; " + "-fx-text-fill: red; " + "-fx-text-tranform: lowercase;");
        } 
         if( textRedBtn.isSelected() && uppercaseBtn.isSelected()){
            result.setStyle("-fx-background-color: red; " + "-fx-text-fill: red; " + "-fx-text-tranform: uppercase;");
        } 
        if( textWhiteBtn.isSelected()){
            result.setStyle("-fx-background-color: red; " + "-fx-text-fill: white; ");
        } 
        if( textWhiteBtn.isSelected()){
            result.setStyle("-fx-background-color: red; " + "-fx-text-fill: white; ");
        } 
        if( textWhiteBtn.isSelected()&& lowercaseBtn.isSelected()){
            result.setStyle("-fx-background-color: red; " + "-fx-text-fill: white; " + "-fx-text-tranform: lowercase;");
        }
        if( textWhiteBtn.isSelected()&& uppercaseBtn.isSelected()){
            result.setStyle("-fx-background-color: red; " + "-fx-text-fill: white; " + "-fx-text-tranform: uppercaseBtn;");
        }
         if( textBlackBtn.isSelected()){
            result.setStyle("-fx-background-color: red;" + " -fx-text-fill: black; ");
        }
             if( textBlackBtn.isSelected() && lowercaseBtn.isSelected()){
            result.setStyle("-fx-background-color: red;" + " -fx-text-fill: black; " + "-fx-text-tranform: lowercase;");
        }
             if( textBlackBtn.isSelected() && uppercaseBtn.isSelected()){
            result.setStyle("-fx-background-color: red;" + " -fx-text-fill: black; " + "-fx-text-tranform: uppercase;");
        }
             
    }

    public void bgGreen() {

        bgRedBtn.setSelected(false);
        bgBlueBtn.setSelected(false);
         result.setStyle("-fx-background-color: green;");
        if( textRedBtn.isSelected()){
            result.setStyle("-fx-background-color: green;"+" -fx-text-fill: red; ");
        } 
             if( textBlackBtn.isSelected() && lowercaseBtn.isSelected()){
            result.setStyle("-fx-background-color: green;" + " -fx-text-fill: red; " + "-fx-text-tranform: lowercase;");
        }
             if( textBlackBtn.isSelected() && uppercaseBtn.isSelected()){
            result.setStyle("-fx-background-color: green;" + " -fx-text-fill: red; " + "-fx-text-tranform: uppercase;");
        }
        if( textWhiteBtn.isSelected()){
            result.setStyle("-fx-background-color: green;"+" -fx-text-fill: white; ");
        }
         if( textRedBtn.isSelected()){
            result.setStyle("-fx-background-color: green;"+" -fx-text-fill: black; ");
        }
        
    }

    public void bgBlue() {
        //recupération de la frase rentré par l'utilisateur

        bgRedBtn.setSelected(false);
        bgGreenBtn.setSelected(false);
        result.setStyle("-fx-background-color: blue; " );
        if( textRedBtn.isSelected()){
            result.setStyle("-fx-background-color: blue; "+"-fx-text-fill: red; ");
        } 
        if( textWhiteBtn.isSelected()){
            result.setStyle("-fx-background-color: blue; "+"-fx-text-fill: white; ");
        }
         if( textRedBtn.isSelected()){
            result.setStyle("-fx-background-color: blue; " + "-fx-text-fill: black; ");
        }
    }

    public void textRed() {
        //recupération de la frase rentré par l'utilisateur

        textWhiteBtn.setSelected(false);
        textBlackBtn.setSelected(false);
         result.setStyle("-fx-background-color: red;");
        if(bgGreenBtn.isSelected()){
             result.setStyle("-fx-background-color: green; "+ "-fx-text-fill: red;");
        }
        if(bgRedBtn.isSelected()){
            result.setStyle("-fx-background-color: red; "+ "-fx-text-fill: red;");
        }
         if(bgBlueBtn.isSelected()){
            result.setStyle("-fx-background-color: blue; "+ "-fx-text-fill: red;");
        }
        
       
    }

    public void textWhite() {
        //recupération de la frase rentré par l'utilisateur

        textRedBtn.setSelected(false);
        textBlackBtn.setSelected(false);
        result.setStyle("-fx-text-fill: white;");
        if(bgGreenBtn.isSelected()){
             result.setStyle("-fx-background-color: green; "+ "-fx-text-fill: white;");
        }
        if(bgRedBtn.isSelected()){
            result.setStyle("-fx-background-color: red; "+ "-fx-text-fill: white;");
        }
         if(bgBlueBtn.isSelected()){
            result.setStyle("-fx-background-color: blue; "+ "-fx-text-fill: white;");
        }
    }

    public void textBlack() {
        //recupération de la frase rentré par l'utilisateur

        textRedBtn.setSelected(false);
        textWhiteBtn.setSelected(false);
        result.setStyle("-fx-text-fill: black;");
           if(bgGreenBtn.isSelected()){
             result.setStyle("-fx-background-color: green; "+ "-fx-text-fill: black;");
        }
        if(bgRedBtn.isSelected()){
            result.setStyle("-fx-background-color: red; "+ "-fx-text-fill: black;");
        }
         if(bgBlueBtn.isSelected()){
            result.setStyle("-fx-background-color: blue; "+ "-fx-text-fill: black;");
        }
    }

    public void minusText() {
        uppercaseBtn.setSelected(false);
        result.setStyle("-fx-text-tranform: lowercase;");
          if( textRedBtn.isSelected() && lowercaseBtn.isSelected()){
            result.setStyle("-fx-background-color: red; " + "-fx-text-fill: red; " + "-fx-text-tranform: lowercase;");
        } 
    }

    public void majText() {
        lowercaseBtn.setSelected(false);
        result.setStyle("-fx-text-tranform: uppercase;");
            if( textBlackBtn.isSelected() && uppercaseBtn.isSelected()){
            result.setStyle("-fx-background-color: red;" + " -fx-text-fill: black; " + "-fx-text-tranform: uppercaseBtn;");
        }
    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    public void initialize(URL url, ResourceBundle rb) {

    }

}
