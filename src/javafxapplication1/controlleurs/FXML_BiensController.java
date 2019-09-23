/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.controlleurs;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafxapplication1.base_donnees.Base_Donnee_DAO_Bailleurs;
import javafxapplication1.base_donnees.Base_Donnees_DAO_biens;
import javafxapplication1.base_donnees.Base_Donnees_Mysql;
import javafxapplication1.models.Bailleurs;
import javafxapplication1.models.Models_Preneurs;
import javafxapplication1.models.biens;

/**
 * FXML Controller class
 *
 * @author freexx
 */
public class FXML_BiensController implements Initializable {

    @FXML
    private JFXTextField saisie_nom_biens;
    @FXML
    private JFXTextField saisie_numero_biens;
    @FXML
    private JFXTextField saisie_nombre_piece;
    @FXML
    private JFXComboBox<Bailleurs> choix_bailleurs;
    @FXML
    private JFXButton bouton_ajout_bailleurs;
    @FXML
    private JFXTextField saisie_montant_caution_biens;
    @FXML
    private JFXRadioButton disponible_biens;
    @FXML
    private JFXRadioButton indisponible_bien;
    @FXML
    private JFXButton bouton_validation;
    @FXML
    private JFXButton bouton_imprimer;
    @FXML
    private GridPane gridpane_essai;
    @FXML
    private JFXTextField saisie_sejou_nombre;
    @FXML
    private JFXTextField saisie_salle_eau_nombre;
    @FXML
    private JFXTextField saisie_salle_manger_nombre;
    @FXML
    private JFXTextField saisi_bureau_nombre;
    @FXML
    private JFXTextField saisie_cuisine_nombre;
    @FXML
    private JFXTextField saisie_dependance_nombre;
    @FXML
    private JFXTextField saisie_piscine_nombre;
    @FXML
    private JFXTextField saisie_jardin_nombre;
    @FXML
    private TableView<?> tableau;
    @FXML
    private TableColumn<?, ?> tableau_col_nom_piece;
    @FXML
    private TableColumn<?, ?> tableau_col_nombre_piece;
    @FXML
    private JFXTextField saisie_date_etat_lieux;
    @FXML
    private JFXTextField saisie_conversion_loyer;

    
    /**
     * Initializes the controller class.
     */
    
     //----------- LES DECLARATION POUR DB----------
    private final javafxapplication1.base_donnees.Base_Donnees_Interface_DAO base_donnees = javafxapplication1.base_donnees.Base_Donees_Factory.choisie_base_donnees("mysql");
    private final Connection connection = base_donnees.connecter();
    private final Base_Donnees_Mysql base_Donnee_Mysql= new Base_Donnees_Mysql();
    private ObservableList<Bailleurs> adaptateur_models;
    // ------------- Les variables -------------
    int biens_id;
    String biens_localisation;
    String biens_nom;
    int biens_numero;
    int biens_caution;
    String biens_inconu;
    int biens_pieces_sejou;
    int biens_pieces_manger;
    int biens_pieces_eau;
    int biens_pieces_bain;
    int biens_pieces_bureau;
    int biens_pieces_dependance;
    int biens_pieces_cuisine;
    int biens_pieces_piscine;
    int biens_pieces_jardin;
    
    Base_Donnees_DAO_biens bddao = new Base_Donnees_DAO_biens();
    biens models_biens;
    @FXML
    private JFXTextField saisie_localisation_biens;
    @FXML
    private JFXTextField saisie_de_inconnu;
    @FXML
    private JFXTextField saisie_bain_nombre;
    boolean verifier_execution_base_donnees;
    @FXML
    private JFXTextField saisie_salle_chambre_nombre;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO essai
        
        base_Donnee_Mysql.connecter();

        models_biens = new biens();
        adaptateur_models = FXCollections.observableArrayList();
        
        //----------------- la methode ajout de bien -----------------
        bouton_validation.setOnMouseClicked((event) -> {
            
            models_biens.setBiens_localisation(saisie_localisation_biens.getText().toString());
            System.out.println(saisie_localisation_biens.getText());
            models_biens.setBiens_numero_lot(Integer.parseInt(saisie_numero_biens.getText()));
            models_biens.setBiens_nom(saisie_nom_biens.getText().toString());
            models_biens.setBiens_inconue_de(saisie_de_inconnu.getText().toString());
            
            models_biens.setBiens_garantie(Integer.parseInt(saisie_montant_caution_biens.getText()));
            System.out.println(Integer.parseInt(saisie_montant_caution_biens.getText()));
            
            models_biens.setBiens_pieces_sejou(Integer.parseInt(saisie_sejou_nombre.getText()));
            models_biens.setBiens_pieces_chambres(Integer.parseInt(saisie_salle_chambre_nombre.getText()));
            models_biens.setBiens_pieces_salle_manger(Integer.parseInt(saisie_salle_manger_nombre.getText()));
            models_biens.setBiens_pieces_salles_eau(Integer.parseInt(saisie_numero_biens.getText()));
            models_biens.setBiens_pieces_salles_bain(Integer.parseInt(saisie_bain_nombre.getText()));
            models_biens.setBiens_pieces_cuisine(Integer.parseInt(saisie_cuisine_nombre.getText()));
            models_biens.setBiens_pieces_dependances(Integer.parseInt(saisie_dependance_nombre.getText()));
            models_biens.setBiens_pieces_piscine(Integer.parseInt(saisie_piscine_nombre.getText()));
            models_biens.setBiens_pieces_jardin(Integer.parseInt(saisie_jardin_nombre.getText()));
            models_biens.setBiens_nombre_piece(Integer.parseInt(saisie_nombre_piece.getText()));
         
            choix_bailleurs.getSelectionModel().selectedIndexProperty().addListener(observable -> 
                    System.out.printf("Indice sélectionné: %d", choix_bailleurs.getSelectionModel().getSelectedIndex()).println()); 
            int combo_bailleurs_nombre = choix_bailleurs.getSelectionModel().getSelectedIndex() ;
            models_biens.setBiens_bailleurs_id(combo_bailleurs_nombre);
            
            verifier_execution_base_donnees = bddao.ajout(models_biens);
            custom_alert(verifier_execution_base_donnees);
        });
        
        adaptateur_models = bddao.lister();
        choix_bailleurs.setItems(adaptateur_models);
        
        // Ajout d'un evernement sur le combobox pour pouvoir recuper latable reference par la cle
        /*choix_bailleurs.setOnMouseClicked((event) -> {
            Bailleurs bailleurs_test = new Bailleurs();
            //bailleurs_test essai_event = choix_bailleurs.getSelectionModel().getSelectedItem();
            choix_bailleurs.getSelectionModel().selectedItemProperty().addListener((observable) -> {
                System.out.println(choix_bailleurs.getSelectionModel().getSelectedItem());

            });
            
        });
*/
        
       choix_bailleurs.getSelectionModel().selectedIndexProperty().addListener(observable -> System.out.printf("Indice sélectionné: %d", choix_bailleurs.getSelectionModel().getSelectedIndex()).println()); 

    }

//Creation d'une methode alert pour ...
    public void custom_alert(boolean booler){
        if( booler == true){
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Ajout d'un nouveau propriétaire");
    alert.setHeaderText("Information");
    alert.setContentText("\"Element bien ajouté\"");
    alert.showAndWait();
    //vider_champ();//AcrzDVOqf0&w
    //iniialiseer_table5();
    }else{
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ajout d'un nouveau propriétaire");
        alert.setHeaderText("Information");
        alert.setContentText("/n \"Element non ajouté \" n/");
        alert.showAndWait();
    }
   }
    
}
