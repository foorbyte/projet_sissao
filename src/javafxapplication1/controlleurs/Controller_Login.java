/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.controlleurs;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafxapplication1.models.Models_Preneurs;

/**
 * FXML Controller class
 *
 * @author freexx
 */
public class Controller_Login implements Initializable {

    @FXML
    private TextField saisie_nom_utilisateur;
    @FXML
    private Button bouton_connecter;
    @FXML
    private Button bouton_registre;
    @FXML
    private PasswordField saisie_mot_passe;

    /**
     * Initializes the controller class.
     */
   // Models_Preneurs models_Preneurs = new Models_Preneurs();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
    }    
    
}
