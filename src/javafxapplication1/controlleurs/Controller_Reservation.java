/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.controlleurs;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafxapplication1.base_donnees.Base_Donnee_DAO_Bailleurs;
import javafxapplication1.base_donnees.Base_Donnees_Mysql;
import javafxapplication1.models.Bailleurs;

/**
 * FXML Controller class
 *
 * @author freexx
 */
public class Controller_Reservation implements Initializable {

    @FXML
    private ChoiceBox<Bailleurs> choicebox_preneurs;
    @FXML
    private ComboBox<Bailleurs> combosbox_preneurs;

    /**
     * Initializes the controller class.
     */
    ObservableList<Bailleurs> list_preneurs;
    Bailleurs bailleurs = new Bailleurs();
    private final javafxapplication1.base_donnees.Base_Donnees_Interface_DAO base_donnees = javafxapplication1.base_donnees.Base_Donees_Factory.choisie_base_donnees("mysql");
    private final Connection connection = base_donnees.connecter();
    private final Base_Donnees_Mysql base_Donnees_Mysql = new Base_Donnees_Mysql();
    
    Base_Donnee_DAO_Bailleurs bddaob = new Base_Donnee_DAO_Bailleurs();
    
    private PreparedStatement pst;
    private ResultSet rs;
    private String requete;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        list_preneurs = FXCollections.observableArrayList();
        bddaob.lien_info(connection, list_preneurs);
        combosbox_preneurs.setItems(list_preneurs);
        
        choicebox_preneurs.setItems(list_preneurs);
        
        //String id = bailleurs.setBailleurs_nom("KOne");
        //list_preneurs.add(id);
    }    

    
    
}
