/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.controlleurs;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafxapplication1.base_donnees.Base_Donnee_DAO_Preneurs;
import javafxapplication1.base_donnees.Base_Donnees_Mysql;
import javafxapplication1.models.Models_Preneurs;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;



/**
 * FXML Controller class
 *
 * @author freexx
 */
public class Controller_Preneurs implements Initializable {
    
  //public  ObservableList<Models_Preneurs> list1 = FXCollections.observableArrayList(
     //new Models_Preneurs(1, "ee", "edd","11/11/11","dddd")
    // );
  public  ObservableList<Models_Preneurs> list1;
    @FXML
    private TextField saisie_preneurs_prenom;
    @FXML
    private Button bouton_ajouter;
    @FXML
    private Button bouton_supprier;

    @FXML
    private TextField saisie_preneurs_nom;
    
    Boolean  verifier_execution_base_donnees1 = new Boolean(true);
    
    //int verifier_execution_base_donnees ;
    boolean  verifier_execution_base_donnees ;
    boolean verifier_modification_base_donnees;
    
    private final javafxapplication1.base_donnees.Base_Donnees_Interface_DAO base_donnees = javafxapplication1.base_donnees.Base_Donees_Factory.choisie_base_donnees("mysql");
    //private final Connection connection = base_donnees.connecter();
    private final Base_Donnees_Mysql base_Donnee_Mysql= new Base_Donnees_Mysql();
    private final Connection connection = base_Donnee_Mysql.connecter();
    private ObservableList<Models_Preneurs> adaptateur_list_table;
    
    private FileInputStream fileInputStream;
    private Image image;
    
    String preneurs_nom;
    String preneurs_prenom;
    String preneurs_date_aissance;
    String preneurs_addresse;
    Base_Donnee_DAO_Preneurs bddaop = new Base_Donnee_DAO_Preneurs();
    Models_Preneurs models_Preneurs;
    //Create_DB create_DB = new Create_DB();    
    
   
    @FXML
    //private TableView<Models_Preneurs> table_preneurs;
        private TableView<Models_Preneurs> table_preneurs;

    @FXML
    private TableColumn<Models_Preneurs, String> colonne_nom;
    //Models_Preneurs, String
    @FXML
    private TableColumn<Models_Preneurs, String> colonne_prenom;
    @FXML
    private TableColumn<Models_Preneurs, String> colonne_date_naissance;
    
    @FXML
    private Button bouton_afficher_preneur;
    @FXML
    private Button bouton_modifier_preneurs;
    @FXML
    private ListView<Models_Preneurs> list_vieww;
    @FXML
    private TableColumn<Models_Preneurs, String> colonne_id;
    @FXML
    private TableColumn<Models_Preneurs, String> colonne_address;
    
      ObservableList<Models_Preneurs> models_Preneur_obd_1= FXCollections.observableArrayList();
        ObservableList<Models_Preneurs> models_Preneurs_obs = FXCollections.observableArrayList();
    @FXML
    private TextField saisie_preneurs_addresse;
    @FXML
    private DatePicker saisie_preneurs_date;
    @FXML
    private TextField saisie_loye_menuel;
    @FXML
    private DatePicker saisie_date_debut_loyer;
    @FXML
    private DatePicker saisie_date_fin_loyer;
    @FXML
    private TextField saisie_taxes_assainissement;
    @FXML
    private TextField saisiee_caution;
    @FXML
    private TextField saisie_caution_consommation;
    @FXML
    private TextField saisie_honoraires_transaction;
    @FXML
    private TextField saisie_honoraires_transaction_tps;
    @FXML
    private TextField saisie_frais_etat_lieux;
    @FXML
    private TextField saisie_honoraire_redaction;
    @FXML
    private TextField saisie__enregistrement_bail_timbre;
    @FXML
    private TextField saisie_autre;
    @FXML
    private TextField saisie_charges_locatives;
    @FXML
    private Button bouton_Imprimer;
    @FXML
    private TextField test;
    @FXML
    private Button bouton_rechercher_id;
    @FXML
    private TextField saisie_recherche;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    
        exemple_foreach();
        
        
        models_Preneur_obd_1.add(new Models_Preneurs(0, "un", "deux", "trois", "quatre"));
        //models_Preneurs_obs = avoir_model();
        //remplir_table((FXCollections) models_Preneurs_obs);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, "uuu");
        int nbr = arrayList.size();
        System.out.println("iiiiiiiiiiiiiii"+ arrayList.size());
       //  ObservableList<Person> teamMembers = getTeamMembers();
         
        // ObservableList<String> names = FXCollections.observableArrayList(
          //"Julia", "Ian", "Sue", "Matthew", "Hannah", "Stephan", "Denise");
        //table_preneurs.setItems(teamMembers);
        // TODO
       // list1.add(  new Models_Preneurs(1, "ee", "edd","11/11/11","dddd"));
        //adaptateur_list_table.add(new Models_Preneurs(0, "tt", "dg", "erv", "edd"));
         //   list1 = FXCollections.observableArrayList();
       //table_preneurs.setItems(list1);
        //table_preneurs.getItems().add(new Models_Preneurs(1, "ee", "edd","11/11/11","dddd"));
        
        
        
        
        remplir_table();
        
            

            /*
        colonne_id.setCellValueFactory(new PropertyValueFactory<Models_Preneurs, Integer>("prenneurs_id"));
        colonne_nom.setCellValueFactory(new PropertyValueFactory<Models_Preneurs, String>("prenneurs_nomm"));
        colonne_prenom.setCellValueFactory(new PropertyValueFactory<Models_Preneurs, String>("prenneurs_prenom"));
        colonne_date_naissance.setCellValueFactory(new PropertyValueFactory<Models_Preneurs, String>("prenneurs_date_naissance"));
        colonne_address.setCellValueFactory(new PropertyValueFactory<Models_Preneurs, String>("prenneurs_addresse"));
        */
        
        //updateList();
        //set_table_cell();
        //load_from_data_base(base_Donnee_Mysql);
        //load_from_data_base();
        models_Preneurs = new Models_Preneurs();
        
        bouton_afficher_preneur.setOnMouseClicked((event) -> {
           // base_Donnee_Mysql.connecter();
           
        
          // bddaop.lier_info(connection, adaptateur_list_table);
          bddaop.lier_info( adaptateur_list_table);
          models_Preneurs = bddaop.lier_info(adaptateur_list_table);
          adaptateur_list_table.add(models_Preneurs);
          adaptateur_list_table.add(new Models_Preneurs(0, "tt", "dg", "erv", "edd"));
            adaptateur_list_table = FXCollections.observableArrayList();

            
            
            colonne_id.setCellValueFactory(new PropertyValueFactory<>("preneurs_id"));
            //            colonne_nom.setCellValueFactory(new PropertyValueFactory<Models_Preneurs, String>("preneurs_nomm"));

            colonne_nom.setCellValueFactory(new PropertyValueFactory<>("preneurs_nom"));
            colonne_prenom.setCellValueFactory(new PropertyValueFactory<>("preneurs_prenom"));
            colonne_date_naissance.setCellValueFactory(new PropertyValueFactory<>("preneurs_date_naissance"));
            colonne_address.setCellValueFactory(new PropertyValueFactory<>("preneurs_addresse"));
            
            //table_preneurs.setItems(adaptateur_list_table);
            
            
            
            
             list1.add(  new Models_Preneurs(1, "ee", "edd","11/11/11","dddd"));
        //adaptateur_list_table.add(new Models_Preneurs(0, "tt", "dg", "erv", "edd"));
            list1 = FXCollections.observableArrayList();
       //table_preneurs.setItems(list1);
        //table_preneurs.getItems().add(new Models_Preneurs(1, "ee", "edd","11/11/11","dddd"));
        
        
        
            //charger_preneurs_table();
            //adaptateur_list_table = FXCollections.observableArrayList();
             
        });
        
        bouton_modifier_preneurs.setOnMouseClicked((event) -> {
        //modifier via list
        ObservableList<Models_Preneurs> essai;
        //essai = table_preneurs.getItems() ;
        //essai = (ObservableList<Models_Preneurs>) table_preneurs.getSelectionModel().getSelectedItem();
        //essai.forEach(essai::remove);
        //https://www.youtube.com/watch?v=EVEiePe_UVw

// 
            preneurs_nom = saisie_preneurs_nom.getText();
            models_Preneurs.setPreneurs_nom(preneurs_nom);
            preneurs_prenom = saisie_preneurs_nom.getText();
            models_Preneurs.setPreneurs_prenom(preneurs_prenom);
            preneurs_date_aissance = saisie_preneurs_nom.getText();
            models_Preneurs.setPreneurs_nom(preneurs_date_aissance);
            preneurs_addresse = saisie_preneurs_nom.getText();
            models_Preneurs.setPreneurs_nom(preneurs_addresse);
            
            //verifier_modification_base_donnees = bddaop.ajout(models_Preneurs);
            
            if(verifier_modification_base_donnees != false){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ajout d'un nouveau preneur");
                alert.setHeaderText("Information");
                alert.setContentText("\"Element bien ajouté\"");
                alert.showAndWait();
              }else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ajout d'un nouveau preneur");
                alert.setHeaderText("Information");
                alert.setContentText("\"Element non ajouté\"");
                alert.showAndWait();
            }
        });
           
        
        
        bouton_rechercher_id.setOnMouseClicked((event) -> {
            String preneurs_id = saisie_recherche.getText();
            int id_preneurs = Integer.parseInt(preneurs_id);
            bddaop.avoir_preneurs_id(id_preneurs);
            saisie_preneurs_nom.setText(models_Preneurs.getPreneurs_nom());
            saisie_preneurs_prenom.setText(models_Preneurs.getPreneurs_prenom());
            
        });
            
        
        
        
        bouton_ajouter.setOnMouseClicked((event) -> {
        
            base_Donnee_Mysql.connecter();
            //LocalDate localDate_naissance = saisie_preneurs_saisie_preneurs_date.getValue();
            
            
            preneurs_nom = saisie_preneurs_nom.getText();
            models_Preneurs.setPreneurs_nom(preneurs_nom);
            preneurs_prenom = saisie_preneurs_prenom.getText();
            models_Preneurs.setPreneurs_prenom(preneurs_prenom);
            //preneurs_date_aissance = saisie_preneurs_saisie_preneurs_date.converterProperty().toString();
            preneurs_date_aissance = saisie_preneurs_date.getEditor().getText();
//            String essai_date = localDate_naissance.toString();
            models_Preneurs.setPreneurs_date_naissance(preneurs_date_aissance);
            //preneurs_addresse = saisie_preneurs_saisie_preneurs_addresse.getText();
            //models_Preneurs.setPreneurs_addresse(preneurs_addresse);
            models_Preneurs.setPreneurs_addresse(saisie_preneurs_addresse.getText());
            //verifier_execution_base_donnees = bddaop.ajout();
            //verifier_execution_base_donnees = bddaop.ajout();
            try{
                //https://stackoverflow.com/questions/36358044/convert-the-content-of-javafx-textfield-into-integer
                //http://java-buddy.blogspot.com/2015/07/validate-and-parse-javafx-textfield-to.html
              models_Preneurs.setPreneurs_loyer_menuel(Integer.parseInt(saisie_loye_menuel.getText())); 
              models_Preneurs.setPreneurs_date_debut(saisie_date_debut_loyer.getEditor().getText());
              models_Preneurs.setPreneurs_date_fin(saisie_date_fin_loyer.getEditor().getText());
              models_Preneurs.setPreneurs_charges_locatives(Integer.parseInt(saisie_charges_locatives.getText()));
              models_Preneurs.setPreneurs_taxes_assainissement(Float.parseFloat(saisie_taxes_assainissement.getText()));
              models_Preneurs.setPreneurs_caution(Integer.parseInt(saisiee_caution.getText()));
              models_Preneurs.setPreneurs_caution_consommation(Integer.parseInt(saisie_caution_consommation.getText()));
              models_Preneurs.setPreneurs_honoraires_transaction(Integer.parseInt(saisie_honoraires_transaction.getText()));
              models_Preneurs.setPreneurs_honoraires_transaction_TPS(Integer.parseInt(saisie_honoraires_transaction_tps.getText()));
              models_Preneurs.setPreneurs_enregistrement_bail_timbre(Integer.parseInt(saisie__enregistrement_bail_timbre.getText()));
              models_Preneurs.setPreneurs_honoraire_redaction(Integer.parseInt(saisie_honoraire_redaction.getText()));
              models_Preneurs.setPreneurs_frais_etat_lieux(Integer.parseInt(saisie_frais_etat_lieux.getText()));
              models_Preneurs.setPreneurs_autre(Integer.parseInt(saisie_autre.getText()));
               //models_Preneurs.setPreneurs_loyer_menuel(2222); 
                //String test1 = saisie_loye_menuel.getText().trim();
                String test2 = "123000";
                Integer.parseInt(test2);
                Integer.parseInt(test2);
                //Integer.parseInt(test1);
             // models_Preneurs.setPreneurs_loyer_menuel(Integer.parseInt(test1)); 
            // models_Preneurs.setPreneurs_date_debut(test1);
//saisie_loye_menuel.setText("22");
            //String essai = saisie_loye_menuel.getText();
          test.setText(  "ok " +models_Preneurs.getPreneurs_loyer_menuel());
         }catch(NumberFormatException nfe){
               nfe.printStackTrace();
            }
            
           
           
            
            
            
            
            
            verifier_execution_base_donnees = bddaop.ajout(models_Preneurs);

            //insert into preneurs(preneurs_id, prenuers_nom, preneurs_prenom, preneurs_date_naissance, preneurs_addresse) values(0, 'Koné', 'Abdoul Aziz', '09/02/91', 'Abidjan');
            //create table preneurs ( preneurs_id INT(20) NOT NULL AUTO_INCREMENT COMMENT 'id, autoincrémenté', preneurs_nom VARCHAR(255) NOT NULL, preneurs_prenon VARCHAR(255) NOT NULL, preneurs_date_naissance text, preneurs_addresse text, PRIMARY KEY (preneurs_id))
            if( verifier_execution_base_donnees == true){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ajout d'un nouveau preneur");
                alert.setHeaderText("Information");
                alert.setContentText("\"Element bien ajouté\"");
                alert.showAndWait();
                vider_champ();//AcrzDVOqf0&w
                remplir_table();
            }else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ajout d'un nouveau preneur");
                alert.setHeaderText("Information");
                alert.setContentText("\"Element non ajouté\"");
                alert.showAndWait();
            } 
           
        });
        
        
        
        
        
        
        
        
        
        bouton_Imprimer.setOnMouseClicked((event) -> {
           // JaperDesingn jd = JRXmloader.load("");
                        //connection=ConnectionManager.getConnection();
            try {
                
                long start = System.currentTimeMillis();
                System.err.println("Filling time : " + (System.currentTimeMillis() - start));

              JasperDesign jd =JRXmlLoader.load(new File("")
              .getAbsolutePath()+"/src/impressions/impression_preneurs_reservations.jrxml");

                HashMap params = new HashMap();
                params.put("preneurs_nom", "9123456789");
                params.put("preneurs_prenom", "intactabode@gmail.com");
                params.put("parameter1", "bode@gmail.com");


                JRDesignQuery  newQuery=new JRDesignQuery();
                newQuery.setText("select * from preneurs");
                jd.setQuery(newQuery);
                JasperReport jr=JasperCompileManager.compileReport(jd);
                JasperPrint jp=JasperFillManager.fillReport(jr,params, connection);
                JasperViewer.viewReport(jp);
                
                JRViewer jrv = new JRViewer(jp);
                jrv.validate();
                jrv.setVisible(true);
                jrv.setSize(new Dimension(800, 600));
                jrv.setLocation(300, 100);
                JasperPrintManager.printReport(jp, false);
               
                String ph_string = "/src/impressions/impression_preneurs_reservations.pdf";
                //https://www.youtube.com/watch?v=z7qjlNWEq1k
                
               // System.out.println("File Generated: " + outputFile);

                //JasperExportManager.exportReportToPdfstr(jp, ph_string );
                //JasperExportManager.exportReportToPdfStream(jp, ph_string );
                //https://www.javaquery.com/2018/06/how-to-set-value-in-text-field-of.html
                byte [] data = JasperExportManager.exportReportToPdf(jp);
                
//https://www.youtube.com/watch?v=cAkjuK89mZw
            } catch (Exception e) {
              // TODO: handle exception
              e.printStackTrace();
            }
        });
    }
    
    
    
    public void charger_preneurs_table(){
        colonne_nom.setCellValueFactory(new PropertyValueFactory<>("preneurs_nomm"));
        //colonne_nom.setCellValueFactory(new PropertyValueFactory<Models_Preneurs, String>("preneurs_nomm"));
    //    colonne_nom.setCellValueFactory((TableColumn.CellDataFeatures<Models_Preneurs, String> cellData) -> cellData.getValue().getPreneurs_nomm());
        ObservableList<Models_Preneurs> ici;
        ici = FXCollections.observableArrayList();

        //colonne_nom.setCellValueFactory(new PropertyValueFactory<>("preneurs_nom"));
        //https://www.youtube.com/watch?v=ks8HSbZRdf8
        //https://www.swtestacademy.com/database-operations-javafx/
        //empIdColumn.setCellValueFactory(cellData -> cellData.getValue().employeeIdP
        //https://www.youtube.com/watch?v=iSQ3-gMlJ6I&list=PLd4Jo6d-yhDJDu6z0luwaKpW2QD-jGVGc&index=25
    }
    public void vider_champ(){
        saisie_preneurs_nom.clear();
        saisie_preneurs_prenom.clear();
        saisie_preneurs_date.setValue(null);
        saisie_preneurs_addresse.clear();
    }
    
    private void updateList(){
        list_vieww.getItems().clear();
        Models_Preneurs models_Preneurs = new Models_Preneurs();
        for(int x = 10; models_Preneurs.equals(x); x++){
            list_vieww.getItems().add(models_Preneurs);
        }
    }
    private void set_table_cell(){
        colonne_nom.setCellValueFactory(new PropertyValueFactory<>("prenneurs_nom"));
        colonne_prenom.setCellValueFactory(new PropertyValueFactory<>("prenneurs_prenom"));
        colonne_date_naissance.setCellValueFactory(new PropertyValueFactory<>("prenneurs_date_naissance"));
        colonne_address.setCellValueFactory(new PropertyValueFactory<>("prenneurs_addresse"));
        
        //colonne_nom.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
    }
    //private void load_from_data_base(Base_Donnees_Mysql base_Donnees_Mysql){
      private void load_from_data_base(){ 
        //models_Preneurs.setPreneurs_nomm("Kone");
        
       // base_Donnees_Mysql.connecter();
        ArrayList<Models_Preneurs> arrayList = new ArrayList<>();
         
        ArrayList<String> maListe = new ArrayList<>();
        maListe.add("Un");
        maListe.add("Deux");
        maListe.add("Trois");
        maListe.add("Quatre");
         
        ObservableList<Models_Preneurs> data;
        data = FXCollections.observableArrayList();
        data.add(models_Preneurs);
       /* 
        String sql = "SELECT * FROM preneurs ORDER BY preneurs_id ASC;";
        try{
            Models_Preneurs models_Preneurs = new Models_Preneurs();
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                //models_Preneurs.setPreneurs_id(rs.getInt(1));
                models_Preneurs.setPreneurs_nomm(rs.getString(2));
                models_Preneurs.setPreneurs_prenom(rs.getString(3));
                models_Preneurs.setPreneurs_date_naissance(rs.getString(4));
                models_Preneurs.setPreneurs_addresse(rs.getString(5));
                
                arrayList.add(models_Preneurs);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        */
        
       // data.add();
       
//data.clear();
//       table_preneurs.setItems(data);
       
       
    }
/*
    private ObservableList<Person> getTeamMembers() {
        Person person = new Person();
        person.setFirstName("un");
        person.setLastName("deux"); 
         ObservableList<Person> data = FXCollections.observableArrayList();

        data.add(person); // your data
              return data;

    }
      
      // Inside ContentController
public void setItems(ObservableList<Person> data) {
    // Add observable list data to the table
//    table_preneurs.setItems(data);
}*/
      
 ObservableList<Models_Preneurs> avoir_model(){
     
               ObservableList<Models_Preneurs> models_Preneurs_obs = FXCollections.observableArrayList(

              //new Models_Preneurs(0,"ee","jd","ddd","dd"),
              //new Models_Preneurs(0, "un", "deux", "trois", "quatre")              
      );
               models_Preneurs_obs.add(
                       new Models_Preneurs(0, "un", "deux", "trois", "quatre")  );
               //https://www.youtube.com/watch?v=hbot9MQVHOM&t=0s&list=PLFE2CE09D83EE3E28&index=35
     return models_Preneur_obd_1;
 }

    private void remplir_table() {
        colonne_id.setCellValueFactory(new PropertyValueFactory<>("preneur_id"));
        
        //colonne_id.setCellValueFactory(cellData -> cellData.getValue().getPreneurs_id());

       // colonne_id.setCellValueFactory(cellData -> cellData.getValue().getPreneurs_id().asObject());
       colonne_id.setCellValueFactory(new PropertyValueFactory<>("preneurs_id"));
       colonne_nom.setCellValueFactory(new PropertyValueFactory<Models_Preneurs, String>("preneurs_nom"));
            colonne_prenom.setCellValueFactory(new PropertyValueFactory<Models_Preneurs, String>("preneurs_prenom"));
            colonne_date_naissance.setCellValueFactory(new PropertyValueFactory<>("preneurs_date_naissance"));
            colonne_address.setCellValueFactory(new PropertyValueFactory<>("preneurs_addresse"));
           table_preneurs.setItems(bddaop.avoir_model());
           // table_preneurs.setItems(avoir_model());
    }
  public void exemple_foreach(){
      int myint[] = {1, 2, 3, 4, 5};

  for (int i : myint)
  {
      System.out.println(i+"()");
  }
  
  List<Integer> listOfPrimes = Arrays.asList(2, 3, 5, 7, 11, 3, 17);
        
listOfPrimes.stream().forEach((i) -> { System.out.println(i); });
        listOfPrimes.stream().forEach( i -> System.out.print( i + ","));

  }
  
  
}


