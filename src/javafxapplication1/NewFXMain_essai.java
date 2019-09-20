/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author freexx
 */
public class NewFXMain_essai extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
       
        
         Parent root = FXMLLoader.load(getClass().getResource("/javafxapplication1/FXML_essai.fxml"));

        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    

    
        
        
        
        //StackPane root = new StackPane();
        //root.getChildren().add(btn);
        
        //Scene scene = new Scene(root, 300, 250);
        
        //primaryStage.setTitle("Hello World!");
        //primaryStage.setScene(scene);
        //primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
