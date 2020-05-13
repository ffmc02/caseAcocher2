/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afpa.casesacocher;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author gaeta
 */

public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
       FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("case.fxml"));
       Parent root = fxmlLoader.load();
       Scene scene = new Scene(root);
//       scene.getStylesheets().add(getClass().getResource("case.css").toExternalForm());
       primaryStage.setScene(scene);
       primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
