/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.controlleurs;

import com.jfoenix.controls.JFXButton;
import com.sun.deploy.util.FXLoader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafxapplication1.Create_DB;

/**
 *
 * @author freexx
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private TabPane tab_pane_principale;
    @FXML
    private TitledPane bouton_relance;
    @FXML
    private Tab tab_pane_1_tableau_bord;
    @FXML
    private Button bouton_aller_tableau_bord;
    @FXML
    private Button bouton_ajout_preneurs;
    @FXML
    private Button bouton_ajout_bailleurs;
    @FXML
    private Button bouton_reservation;
    @FXML
    private Button bouton_mandat_gestion;
    @FXML
    private Button bouton_bail;
    @FXML
    private Button bouton_decompte_sortie;
    @FXML
    private Button bouton_facture_agence_pro;
    @FXML
    private Button button_shape;
    @FXML
    private JFXButton bouton_biens;
   
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    private Stage creatingEmailStage = new Stage();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //http://javafxportal.blogspot.com/2012/03/date-format-example.html
        //https://www.foreach.be/blog/java-8-date-and-time
        //https://www.google.com/search?client=safari&rls=en&ei=9GRhXMyXMdKqgweasZfgCw&q=parten+DATES+conversion+in+java&oq=parten+DATES+conversion+in+java&gs_l=psy-ab.3...32358.35601..36017...0.0..0.329.2386.0j3j4j3......0....1..gws-wiz.......0i71j35i39.p1Iv73mHgzM
        //https://dzone.com/articles/schedulers-in-java-and-spring
        //https://www.google.com/search?client=safari&rls=en&q=java+schedule&ie=UTF-8&oe=UTF-8
        //https://github.com/topics/scheduling?l=java&o=asc&s=forks
        //https://github.com/topics/reminder?l=java&o=asc&s=stars
        //android studio birthday reminder automatic scheduler planning
            new Thread(){
      @Override
      public void run() {
           try {
                  Thread.sleep(5000); // time after which pop up will be disappeared.
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
      };
}.start();
        
            
        
         bouton_decompte_sortie.setOnMouseClicked((event) -> {
              try {
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("/javafxapplication1/vues/FXML_decompte_location_sortie.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Ajouter un bailleur");
                stage.show();
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
         });
         
button_shape.setOnMouseClicked((event) -> {
    try {
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("/javafxapplication1/vues/FXML_Sharpe.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Ajouter un bailleur");
                stage.show();
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
});
        
        
        bouton_reservation.setOnMouseClicked((event) -> {
            try {
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("/javafxapplication1/vues/FXML_Document_Reservation.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Ajouter un bailleur");
                stage.show();
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        
        bouton_ajout_bailleurs.setOnMouseClicked((event) -> {
            
            try {
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("/javafxapplication1/vues/FXML_Bailleurs.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Ajouter un bailleur");
                stage.show();
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        });
        tab_pane_1_tableau_bord.setText("Fenetre de bord");
        //Le bouton pour ajouter un preneurs
        bouton_ajout_preneurs.setOnMouseClicked((event) -> {
            try{
                
            Parent root= FXMLLoader.load(getClass().getResource("/javafxapplication1/vues/FXML_Preneurs.fxml"));
            Dialog dialog = new Dialog();
            dialog.initModality(Modality.NONE);
            dialog.getDialogPane().setContent(root);
            dialog.show();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        });
        
        bouton_aller_tableau_bord.setOnMouseClicked((event) -> {
            
            tab_pane_principale.getTabs().add(tab_pane_1_tableau_bord);
            tab_pane_1_tableau_bord.setText("Tableau de bord");
            
             try {
                // creatingEmailStage.initStyle(StageStyle.UTILITY);
                 FXMLLoader loader = new FXMLLoader();
            tab_pane_principale = FXMLLoader.load(getClass().getResource("/javafxapplication1/vues/FXML_Tableau_Bord.fxml"));
                AnchorPane anchorPane = loader.load();
        Scene scene = new Scene(anchorPane);
        creatingEmailStage.setScene(scene);
        creatingEmailStage.setResizable(false);
        creatingEmailStage.show();
        Tab tab = loader.load();
        Tab t ;
        //tab.getTabs().add(t = new Tab);

       // tab.getTabs().remove(0);
        
             } catch (IOException ex) {
            ex.printStackTrace();
        }
        Tab t = new Tab();
        t.setContent(tab_pane_principale);
        this.tab_pane_principale.getTabs().add(t);
            
            tab_pane_1_tableau_bord.setContent(label);
            
        });
        
        //Aller sur les biens
         
        
         bouton_biens.setOnMouseClicked((event) -> {
            
            try {
                Stage stage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("/javafxapplication1/vues/FXML_Biens.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Ajouter un bailleur");
                stage.show();
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        });
    }    
    
    
    
}
