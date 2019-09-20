/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.controlleurs;

import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication1.base_donnees.Base_Donnee_DAO_Preneurs;
import javafxapplication1.base_donnees.Base_Donnees_Mysql;
import javafxapplication1.models.Models_Preneurs;
import org.apache.bcel.generic.AALOAD;

/**
 * FXML Controller class
 *
 * @author freexx
 */
public class FXML_decompte_location_sortieController implements Initializable {

    @FXML
    private ComboBox<Models_Preneurs> combox_box_list_preneurs;
    @FXML
    private TextField saisie_caution_due;
    @FXML
    private TextField saisie_loyer_due;
    @FXML
    private TextField saisie_penture_due;
    @FXML
    private TextField saisie_total_due;
    @FXML
    private TextField saisie_solde_due;
    @FXML
    private TextField saisie_caution_restituer;
    @FXML
    private TextField saisie_loyer_restitue;
    @FXML
    private TextField saisie_peinturrestitue;
    @FXML
    private TextField saisie_mo_restitue;
    @FXML
    private TextField saisie_mo_due;
    @FXML
    private TextField saisie_total_restitue;
    @FXML
    private TextField saisie_solde_restitue;
    @FXML
    private Button bouton_impression;
    @FXML
    private ListView<Models_Preneurs> liste_afficher;

    /**
     * Initializes the controller class.
     */
    //final ObservableList option = FXCollections.observableArrayList();
    final ObservableList<Models_Preneurs> option = FXCollections.observableArrayList();
    
    private final javafxapplication1.base_donnees.Base_Donnees_Interface_DAO base_donnees = javafxapplication1.base_donnees.Base_Donees_Factory.choisie_base_donnees("mysql");
    private final Connection connection = base_donnees.connecter();
    private final Base_Donnees_Mysql base_Donnee_Mysql= new Base_Donnees_Mysql();
    Base_Donnee_DAO_Preneurs bddaop = new Base_Donnee_DAO_Preneurs();
    Models_Preneurs models_Preneurs;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
 //https://www.youtube.com/watch?v=-Rsb2Vtlu_k&list=PLiOTikWriApEdE2CQKpyhJp9_tcuLdsh5&index=4 
//https://www.youtube.com/channel/UCpdkWp2zh5Qv1ZWlnqswdCw/playlists
 initialiseer_combo_box();
 initialiseer_list();
 //essaiarray_arraylist();
 essaiarray_arraylist1();
     }    
    
    
    
    public void initialiseer_combo_box() {
    
        combox_box_list_preneurs.setItems(bddaop.avoir_model_combox_bx());
//populate_table(essai);
}
    
     public void initialiseer_list() {
    
        liste_afficher.setItems(bddaop.avoir_model_list());
//populate_table(essai);
}
     
     public void essaiarray_arraylist(){
         int arr[] = new int[5];
         
         arr[0] = 1;
         arr[1] = 22;
         arr[2] = 21;
         
         arr[7]= 0;
         
         for(int i=0; i<= arr.length;i++){
             System.out.println(i+"contient"+arr[i]);
         }
         
     }

    private void essaiarray_arraylist1() {
        ArrayList<Object>  arrayList = new ArrayList();
        
        arrayList.add("zz");
        arrayList.add("zzs");
        for(int i=0; i<= arrayList.size();i++){
             System.out.println(i+"contient"+arrayList.get(i));
         }
            
    }
    
}
