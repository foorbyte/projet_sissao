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
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

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
    private JFXTextField saisie_de;
    @FXML
    private JFXTextField saisie_en;
    @FXML
    private JFXTextField saisie_nombre_piece_total_biens;
    @FXML
    private JFXTextField saisie_nom_pieces_biens;
    @FXML
    private JFXTextField saisie_nombre_piece;
    @FXML
    private JFXComboBox<?> choix_bailleurs;
    @FXML
    private JFXButton bouton_ajout_bailleurs;
    @FXML
    private JFXComboBox<?> choix_preneurs;
    @FXML
    private JFXButton bouton_ajouter_preneurs;
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

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
