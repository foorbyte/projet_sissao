//https://www.youtube.com/watch?v=GAkA9drveFc&index=13&list=PLA1W9ojL1mVwql7mYQrMqHJ7GEb9xEg8q

//https://www.youtube.com/watch?v=aJIsZyiQuWE&list=PLR7lDCnFejO_vlNeE6Ghl6gps38MvJiTm&index=10

package javafxapplication1.controlleurs;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafxapplication1.base_donnees.Base_Donnee_DAO_Bailleurs;
import javafxapplication1.base_donnees.Base_Donnees_Mysql;
import javafxapplication1.models.Bailleurs;
import javafxapplication1.models.Bailleurs1;

/**
 * FXML Controller class
 *
 * @auth */
public class Controller_Bailleurs implements Initializable{

    
    
    @FXML
    private Button bouton_ajouter;
    @FXML
    private TableView<Bailleurs> table_bailleurs;
    @FXML
    private TableColumn<Bailleurs1, String> colonne_nom;
    @FXML
    private TableColumn<Bailleurs, String> colonne_prenom;
    @FXML
    private TableColumn<Bailleurs, String> colonne_date_naissance;
    @FXML
    private TableColumn<Bailleurs, String> colonne_addresse;
    @FXML
    private Button bouton_supprier;
    @FXML
    private Button bouton_modifier_;
    @FXML
    private Button bouton_afficher_;

    /**
     * Initializes the controller class.
     */
    boolean  verifier_execution_base_donnees ;
    boolean verifier_modification_base_donnees;
    
    //-------- FILE CHOOSSER ---------
    private final FileChooser fileChooser = new FileChooser();
    private final Desktop desktop = Desktop.getDesktop();
    
    private Image image ;
    
    //----------- LES DECLARATION POUR DB----------
    private final javafxapplication1.base_donnees.Base_Donnees_Interface_DAO base_donnees = javafxapplication1.base_donnees.Base_Donees_Factory.choisie_base_donnees("mysql");
    private final Connection connection = base_donnees.connecter();
    private final Base_Donnees_Mysql base_Donnee_Mysql= new Base_Donnees_Mysql();
    private ObservableList<Bailleurs> adaptateur_list_table;
    String bailleurs_id;
    String preneurs_nom;
    String preneurs_prenom;
    String preneurs_date_aissance;
    String preneurs_addresse;
    Base_Donnee_DAO_Bailleurs bddaob = new Base_Donnee_DAO_Bailleurs();
    Bailleurs bailleurs;
    
    @FXML
    private TextField saisie_bailleurs_nom;
    @FXML
    private TextField saisie_bailleurs_prenom;
    @FXML
    private TextField saisie_bailleurs_addresse;
    @FXML
    private DatePicker saisie_bailleurs_date;
    @FXML
    private CheckBox check_box_sexe;
    @FXML
    private ComboBox<?> combo_box;
    @FXML
    private TableColumn<?, ?> colonne_id;
    @FXML
    private RadioButton sexe_feminin;
    @FXML
    private RadioButton sexe_masculin;
    @FXML
    private TextField saisie_bailleurs_ville;
    @FXML
    private TextField saisie_bailleurs_profession;
    @FXML
    private Button bouton_imprimer_bail;
    @FXML
    private Button bouton_choisir_image_terrain;
    @FXML
    private ImageView saisie_image;
    @FXML
    private TextArea saisie_text_area_image;
    @FXML
    private AnchorPane anchorpane_bailleurs;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        iniialiseer_table5();
        gestion_evenement_sur_table();
        base_Donnee_Mysql.connecter();
        
        
        bailleurs = new Bailleurs();
        adaptateur_list_table = FXCollections.observableArrayList();
        
//-------------------------affichage table-------------------        
        bouton_afficher_.setOnMouseClicked((event) -> {
          
            try {
            
                   iniialiseer_table1();
            } catch (SQLException ex) {
                Logger.getLogger(Controller_Bailleurs.class.getName()).log(Level.SEVERE, null, ex);
            }
         
             /* try {
                //https://www.youtube.com/watch?v=L8iuBXl-F8U
                //colonne_nom.setCellValueFactory(cellData ->cellData.getValue().);
                //iniialiseer_table();
                /* try {
                
                iniialiseer_table1();
                } catch (SQLException ex) {
                ex.printStackTrace();
                }
                iniialiseer_table3();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            */           
    });
//-----------------------fin affichage table----------------------        
//------------------------ evenement suppession -----------------
    bouton_supprier.setOnMouseClicked(event ->{
           
            
            if( verifier_execution_base_donnees == true){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ajout d'un nouveau propriétaire");
                alert.setHeaderText("Information");
                alert.setContentText("\"Element bien ajouté\"");
                alert.showAndWait();
                //vider_champ();//AcrzDVOqf0&w
            }else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ajout d'un nouveau propriétaire");
                alert.setHeaderText("Information");
                alert.setContentText("/n \"Element non ajouté \" n/");
                alert.showAndWait();
            } 
       });
//----------------------------------FIN SUPPRESSION-------------------
//--------------------------------EVENEMENT DE MOFIF------------------
        bouton_modifier_.setOnMouseClicked(event ->{
           
          
                preneurs_nom = saisie_bailleurs_nom.getText();
                bailleurs.setBailleurs_nom(preneurs_nom);
                bailleurs.setBailleurs_prenom(saisie_bailleurs_prenom.getText());
                preneurs_date_aissance = saisie_bailleurs_date.getEditor().getText();
               
                bailleurs.setBailleurs_date_naissance(preneurs_date_aissance);

                bailleurs.setBailleurs_addresse(saisie_bailleurs_addresse.getText());

                verifier_execution_base_donnees = bddaob.modifier(bailleurs);

            
          /*  verifier_execution_base_donnees = bddaob.modifier(bailleurs);

            
            if( verifier_execution_base_donnees == true){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ajout d'un nouveau propriétaire");
                alert.setHeaderText("Information");
                alert.setContentText("\"Element bien ajouté\"");
                alert.showAndWait();
                //vider_champ();//AcrzDVOqf0&w
            }else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ajout d'un nouveau propriétaire");
                alert.setHeaderText("Information");
                alert.setContentText("/n \"Element non ajouté \" n/");
                alert.showAndWait();
            } */
        });
//--------------------------------FIN MODIF-------------------------                
//-------------------------------CODE POUR AJOUTER BAILLEURS-------------------        
        bouton_ajouter.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                /*
                try{
                bddaob.bailleurs_ajouter_un(saisie_bailleurs_nom.getText(),saisie_bailleurs_prenom.getText(),
                saisie_bailleurs_date.getEditor().getText(), saisie_bailleurs_addresse.getText());
                base_Donnee_Mysql.connecter();
                //LocalDate localDate_nais                        saisie_bailleurs_date.getEditor().getText(), saisie_bailleurs_addresse.getText());
                }catch(Exception e){
                e.printStackTrace();
                }
                */
                
             
                
                //sexe.isSelected()?"F":"M";
                
                preneurs_nom = saisie_bailleurs_nom.getText();
                bailleurs.setBailleurs_nom(preneurs_nom);
                //preneurs_prenom = saisie_bailleurs_prenom.getText();
                bailleurs.setBailleurs_prenom(saisie_bailleurs_prenom.getText());
                preneurs_date_aissance = saisie_bailleurs_date.getEditor().getText();
                
                //preneurs_date_aissance = saisie_bailleurs_date.converterProperty().toString();
//           String essai_date = localDate_naissance.toString();
bailleurs.setBailleurs_date_naissance(preneurs_date_aissance);

bailleurs.setBailleurs_addresse(saisie_bailleurs_addresse.getText());

verifier_execution_base_donnees = bddaob.ajout(bailleurs);

//insert into preneurs(preneurs_id, prenuers_nom, preneurs_prenom, preneurs_date_naissance, preneurs_addresse) values(0, 'Koné', 'Abdoul Aziz', '09/02/91', 'Abidjan');
//create table preneurs ( preneurs_id INT(20) NOT NULL AUTO_INCREMENT COMMENT 'id, autoincrémenté', preneurs_nom VARCHAR(255) NOT NULL, preneurs_prenon VARCHAR(255) NOT NULL, preneurs_date_naissance text, preneurs_addresse text, PRIMARY KEY (preneurs_id))
/*
create table bailleurs ( bailleurs_id INT(20) NOT NULL AUTO_INCREMENT ,
bailleurs_nom VARCHAR(255)  ,
bailleurs_prenon VARCHAR(255) ,
bailleurs_date_naissance text,
bailleurs_addresse text, 
PRIMARY KEY (bailleurs_id));
*/
if( verifier_execution_base_donnees == true){
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Ajout d'un nouveau propriétaire");
    alert.setHeaderText("Information");
    alert.setContentText("\"Element bien ajouté\"");
    alert.showAndWait();
    //vider_champ();//AcrzDVOqf0&w
    iniialiseer_table5();
}else{
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Ajout d'un nouveau propriétaire");
    alert.setHeaderText("Information");
    alert.setContentText("/n \"Element non ajouté \" n/");
    alert.showAndWait();
}
            }
        });
//------------------- FIN AJOUT ---------------------------
//-------------------- CODE POUR CHOISIR IMAGE ----------------
bouton_choisir_image_terrain.setOnMouseClicked((event) -> {
    fileChooser.setTitle("Choisir des images");
    fileChooser.getExtensionFilters().addAll(
     new FileChooser.ExtensionFilter("Text Files", "*.txt")
    , new FileChooser.ExtensionFilter("tous types de fichier", "*.*"
    ), new FileChooser.ExtensionFilter("les images", "*.png", "*.jpg", "*.gif"));
    Stage stage = new Stage();
    stage  = (Stage) anchorpane_bailleurs.getScene().getWindow();
    File file = fileChooser.showOpenDialog(stage);
            /*
    try {
                desktop.open(file);
                
                       } catch (IOException ex) {
ex.printStackTrace();            }
    */
            
            if (file != null) {
                System.out.println(""+file.getAbsolutePath());
                image = new Image(file.getAbsoluteFile().toURI().toString(), saisie_image.getFitWidth(), saisie_image.getFitHeight(), true, true);
                saisie_image.setImage(image);
                saisie_image.setPreserveRatio(true);
            }
                
       //https://www.google.com/search?ei=-55pXIGcMd-HjLsPn_W80A0&q=javafx+insert+image+to+database&oq=javafx+insert+image+in+data&gs_l=psy-ab.3.0.0i22i30.1170136.1186679..1187765...0.0..0.525.4135.0j22j1j5-1......0....1..gws-wiz.......0i71j0i8i10i30j0i8i30j33i22i29i30j0i203j0i22i10i30.E0M07gdzpBQ         
});
  /* if (file != null) {
                                    openFile(file);
                                    List<File> files = Arrays.asList(file);
                                    printLog(textArea, files);
                                }
            */ 
//https://www.youtube.com/watch?v=px8lMITbjpY&index=5&list=PLRGx0oGhYQoH0OHLl6l6lZNck79kayjcA
//-----------------------FIN IMAGE-----------------------
    
    }

public void iniialiseer_table(){
    //colonne_nom.setCellValueFactory(
               // (TableColumn.CellDataFeatures<models_Bailleurs,String> CellData) ->CellData.getValue.
       // );
       
      colonne_nom.setCellValueFactory(new PropertyValueFactory("bailleurs_nom"));
       colonne_prenom.setCellValueFactory(new PropertyValueFactory("bailleurs_prenom"));
       colonne_date_naissance.setCellValueFactory(new PropertyValueFactory("bailleurs_date_naissance"));
       colonne_addresse.setCellValueFactory(new PropertyValueFactory("bailleurs_addresse"));
       //adaptateur_list_table.add(actualiser_table());
    //colonne_prenom.setCellValueFactory(new PropertyValueFactory<Bailleurs, String>("bailleurs_preneom"));
      table_bailleurs.setItems(actualiser_table());
}
public  ObservableList<Bailleurs> actualiser_table(){
    
    return FXCollections.observableArrayList(bddaob.afficher_list());
    //return adaptateur_list_table.add(bddaob.afficher_list());
}


public ObservableList<Bailleurs> recuper_table() throws SQLException{
    
    return bddaob.afficher(bailleurs);
}
public void iniialiseer_table1() throws SQLException{
    //colonne_nom.setCellValueFactory(
               // (TableColumn.CellDataFeatures<models_Bailleurs,String> CellData) ->CellData.getValue.
       // );
      adaptateur_list_table = recuper_table();
        ObservableList<Bailleurs> FXCollections = null;
      adaptateur_list_table = FXCollections ;
      //colonne_.setCellValueFactory(new PropertyValueFactory("bailleurs_id"));
      colonne_nom.setCellValueFactory(new PropertyValueFactory("bailleurs_nom"));
       colonne_prenom.setCellValueFactory(new PropertyValueFactory("bailleurs_prenom"));
       colonne_date_naissance.setCellValueFactory(new PropertyValueFactory("bailleurs_date_naissance"));
       colonne_addresse.setCellValueFactory(new PropertyValueFactory("bailleurs_addresse"));
    //colonne_prenom.setCellValueFactory(new PropertyValueFactory<Bailleurs, String>("bailleurs_preneom"));
      table_bailleurs.setItems(actualiser_table());
}

public void iniialiseer_table2(){
    //colonne_nom.setCellValueFactory(cellData -> cellData.getValue().getBailleurs_nom());
    //colonne_id.setCellValueFactory(cellData -> cellData.getValue().getBailleurs_id().as);
    
}

public void iniialiseer_table3() throws SQLException {
    //colonne_nom.setCellValueFactory(
               // (TableColumn.CellDataFeatures<models_Bailleurs,String> CellData) ->CellData.getValue.
       // );
      colonne_nom.setCellValueFactory(new PropertyValueFactory("bailleurs_id"));
      colonne_nom.setCellValueFactory(new PropertyValueFactory("bailleurs_nom"));
       colonne_prenom.setCellValueFactory(new PropertyValueFactory("bailleurs_prenom"));
       colonne_date_naissance.setCellValueFactory(new PropertyValueFactory("bailleurs_date_naissance"));
       colonne_addresse.setCellValueFactory(new PropertyValueFactory("bailleurs_addresse"));
    //colonne_prenom.setCellValueFactory(new PropertyValueFactory<Bailleurs, String>("bailleurs_preneom"));
    ObservableList<Bailleurs> essai =bddaob.get_all_record();
    table_bailleurs.setItems(essai);
//populate_table(essai);
}

    private void populate_table(ObservableList<Bailleurs> essai) {
            table_bailleurs.setItems(essai);

    }
    
    public void iniialiseer_table4() throws SQLException {
    //colonne_nom.setCellValueFactory(
               // (TableColumn.CellDataFeatures<models_Bailleurs,String> CellData) ->CellData.getValue.
       // );
//      colonne_nom.setCellValueFactory(cellData ->cellData.getValue().getBailleurs_id().);
      colonne_nom.setCellValueFactory(new PropertyValueFactory("bailleurs_nom"));
       colonne_prenom.setCellValueFactory(new PropertyValueFactory("bailleurs_prenom"));
       colonne_date_naissance.setCellValueFactory(new PropertyValueFactory("bailleurs_date_naissance"));
       colonne_addresse.setCellValueFactory(new PropertyValueFactory("bailleurs_addresse"));
    //colonne_prenom.setCellValueFactory(new PropertyValueFactory<Bailleurs, String>("bailleurs_preneom"));
    ObservableList<Bailleurs> essai =bddaob.get_all_record();
    table_bailleurs.setItems(essai);
//populate_table(essai);
}
    public void iniialiseer_table5() {
    
        
colonne_id.setCellValueFactory(new PropertyValueFactory("bailleurs_id"));      
colonne_nom.setCellValueFactory(new PropertyValueFactory("bailleurs_nom"));
       colonne_prenom.setCellValueFactory(new PropertyValueFactory("bailleurs_prenom"));
       colonne_date_naissance.setCellValueFactory(new PropertyValueFactory("bailleurs_date_naissance"));
       colonne_addresse.setCellValueFactory(new PropertyValueFactory("bailleurs_addresse"));

       table_bailleurs.setItems(bddaob.model_tableau_bailleurs());
//populate_table(essai);
}
    public void gestion_evenement_sur_table(){
        table_bailleurs.getSelectionModel().selectedItemProperty().addListener(
        new ChangeListener<Bailleurs>() {
            @Override
            public void changed(ObservableValue<? extends Bailleurs> observable, Bailleurs oldValue, Bailleurs newValue) {
                System.out.println(".changed()");
                saisie_bailleurs_nom.setText(newValue.getBailleurs_nom());
                //bouton_ajouter.setVisible(false);
                bouton_ajouter.setDisable(true);
            }
        });
    }
}
