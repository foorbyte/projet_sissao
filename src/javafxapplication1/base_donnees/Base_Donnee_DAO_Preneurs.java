/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.base_donnees;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafxapplication1.Create_DB;
import javafxapplication1.models.Models_Preneurs;
import javafxapplication1.base_donnees.Base_donnees_DAO;
import javafxapplication1.models.Bailleurs;

/**
 *
 * @author freexx
 */
//Exception in thread "JavaFX Application Thread" java.lang.NullPointerException 	at package() 	at .lambda$initialize$2

public class Base_Donnee_DAO_Preneurs {

    private final javafxapplication1.base_donnees.Base_Donnees_Interface_DAO base_donnees = javafxapplication1.base_donnees.Base_Donees_Factory.choisie_base_donnees("mysql");
    private final Base_Donnees_Mysql base_Donnees_Mysql = new Base_Donnees_Mysql();
    //private final Connection connection = base_donnees.connecter();
    private final Connection connection = base_Donnees_Mysql.connecter();
    
    private PreparedStatement pst;
    private ResultSet rs;
    private String requete;
    //private Connection connection;
    Models_Preneurs models_Preneurs;
    public Base_Donnee_DAO_Preneurs() {
    }
    
    public List<Models_Preneurs> get_All(){
        base_Donnees_Mysql.connecter();
        ArrayList<Models_Preneurs> arrayList = new ArrayList<>();
        
        //String sql = "SELECT * FROM preneurs ORDER BY preneurs_id ASC;";
        String sql = "SELECT * FROM preneurs;";
        try{
            Models_Preneurs models_Preneurs = new Models_Preneurs();
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                 models_Preneurs.setPreneurs_id(rs.getInt(1));
                //models_Preneurs.setPreneurs_nomm(rs.getString(2));
               models_Preneurs.setPreneurs_nom(rs.getString("preneurs_nomm"));
                models_Preneurs.setPreneurs_prenom(rs.getString(3));
                models_Preneurs.setPreneurs_date_naissance(rs.getString(4));
                models_Preneurs.setPreneurs_addresse(rs.getString(5));
                
               
           
                
                //arrayList.add(models_Preneurs);
            }              
            arrayList.add(models_Preneurs);

            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return arrayList;
    }
     //public void lier_info(Connection connection, ObservableList<Models_Preneurs> list_standard_preneurs){
     public Models_Preneurs lier_info( ObservableList<Models_Preneurs> list_standard_preneurs){
        list_standard_preneurs = FXCollections.observableArrayList();
         String sql = " SELECT * FROM preneurs";
          Models_Preneurs models_Preneurs1 = null;
        try{
            
            
            Models_Preneurs models_Preneurs = new Models_Preneurs();
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            System.out.println("ICI");;
            while (rs.next()) {
                
               
            models_Preneurs1 = new Models_Preneurs(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
            );
            list_standard_preneurs.add(models_Preneurs1);
            
            
               //models_Preneurs.setPreneurs_id(rs.getInt(1));
                
models_Preneurs.setPreneurs_nom(rs.getString(1));
                //models_Preneurs.setPreneurs_nomm(rs.getString("preneurs_nom"));
                //models_Preneurs.setPreneurs_prenom(rs.getString("preneurs_prenom"));
                models_Preneurs.setPreneurs_prenom(rs.getString(2));
                //models_Preneurs.setPreneurs_date_naissance(rs.getString(3));
                models_Preneurs.setPreneurs_date_naissance(rs.getString("preneurs_date_naissance"));
                //models_Preneurs.setPreneurs_addresse(rs.getString(4));
                
                //models_Preneurs.setPreneurs_addresse(rs.getString("preneurs_addresse"));
                
                //list_standard_preneurs.add(models_Preneurs);
                
                        int empId = rs.getInt(1);
            String empNo = rs.getString(2);
            String empName = rs.getString("preneurs_date_naissance");
            System.out.println("--------------------");
            System.out.println("EmpId:" + empId);
            System.out.println("EmpNo:" + empNo);
            System.out.println("EmpName:" + empName);
            }
                            //list_standard_preneurs.add(models_Preneurs);

        }catch(SQLException e){
            e.printStackTrace();
        }
        return models_Preneurs1;
    }
    
    
    
     
    public boolean supprimer(Models_Preneurs models_Preneurs){
        base_Donnees_Mysql.connecter();
        requete = " DELETE FROM preneurs WHERE preneurs_id=?";
        try{
            pst = connection.prepareStatement(requete);
            return true;
        }catch(SQLException e){
            e.printStackTrace();
          return false;
        }
    }
    
    
    
    public boolean afficher(Models_Preneurs models_Preneurs, ObservableList<Models_Preneurs>data){
       //log("ok");
       base_Donnees_Mysql.connecter();
        //ObservableList<Models_Preneurs>data = null;
       data = FXCollections.observableArrayList();
       
        requete = " select * FROM preneurs ";
        //https://www.youtube.com/watch?v=3tmz-0g3EPs&index=3&list=PL7ubUtBKwzRkrV4gAPbtcUGOYq3j8yUW0
        try {
            pst =  connection.prepareStatement(requete);
            //Logger log = new LoggerConsole(cc);
            while (rs.next()) {
                //list
                rs.getInt(0);
                String essai = rs.getString(1);
                String essai1 = rs.getString(2);
                ObservableList<String> list = FXCollections.observableArrayList(essai, essai1);
                models_Preneurs.setPreneurs_nom(rs.getString(1));
                
                
                //list.getItems().addAll(list);
                //data.addAll(essai, essai1);
                //data.addAll(models_Preneurs.getPreneurs_nomm(rs.getString(0)), 
                //        (models_Preneurs.getPreneurs_prenom(rs.getString(1))
                  //              );
                
//data.add(rs.getString(1), rs.getString(2));
                
                //Obtiention des elements de la db
                //models_Preneurs.add(new
            }
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return false;
    }
    
    
    
    public boolean modifier (Models_Preneurs models_Preneurs){
        base_Donnees_Mysql.connecter();
        requete = "update preneurs set preneurs_id =?,preneurs_nom=?, preneurs_prenom=?  WHERE preneurs_nom =? ";
        try {
            pst = connection.prepareStatement(requete);
            
            pst.setString(1, models_Preneurs.getPreneurs_nom());
            pst.setString(2, models_Preneurs.getPreneurs_prenom());
            pst.setString(3, models_Preneurs.getPreneurs_date_naissance());
            pst.setString(4, models_Preneurs.getPreneurs_addresse());
            
            pst.executeUpdate();
            //int i = pst.executeUpdate();
            return true;
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    
    
    
    
    
        
    //public int ajout (Models_Preneurs models_Preneurs) {
    public boolean ajout (Models_Preneurs models_Preneurs) {    
        base_Donnees_Mysql.connecter();
        //Models_Preneurs models_Preneurs = new Models_Preneurs();
        //requete = "INSERT INTO preneurs( preneurs_nom, preneurs_prenon, preneurs_date_naissance, preneurs_addresse, preneurs_loyer_menuel)VALUES( ?, ?, ?, ?, ?)";
        try {
        //https://www.youtube.com/watch?v=h3W-dEeoPVA&t=256s
//https://www.youtube.com/watch?v=OjOxUC95I2g&list=PLd4Jo6d-yhDJDu6z0luwaKpW2QD-jGVGc&index=13
 //https://www.youtube.com/watch?v=rlYpN26kLAc&index=18&list=PLd4Jo6d-yhDJDu6z0luwaKpW2QD-jGVGc
 pst = connection.prepareStatement("INSERT INTO preneurs(preneurs_nom, preneurs_prenon, preneurs_date_naissance, preneurs_addresse, "
         + "preneurs_loyer_menuel, preneurs_date_debut, preneurs_date_fin,"
         + "preneurs_charges_locatives, preneurs_taxes_assainissement,"
         + "preneurs_caution, preneurs_caution_consommation,"
         + "preneurs_honoraires_transaction, preneurs_honoraires_transaction_TPS,"
         + "preneurs_enregistrement_bail_timbre, preneurs_honoraire_redaction,"
         + "preneurs_frais_etat_lieux, preneurs_autre)VALUES( ?, ?, ?, ?,"
         + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            //pst.setInt(0, models_Preneurs.getPreneurs_id());
            //https://platform.netbeans.org/tutorials/nbm-crud.html
            pst.setString(1, models_Preneurs.getPreneurs_nom());
            pst.setString(2, models_Preneurs.getPreneurs_prenom());
            pst.setString(3, models_Preneurs.getPreneurs_date_naissance());
            pst.setString(4, models_Preneurs.getPreneurs_addresse());
            
           pst.setInt(5, models_Preneurs.getPreneurs_loyer_menuel());
           pst.setString(6, models_Preneurs.getPreneurs_date_debut());
           
            pst.setString(7, models_Preneurs.getPreneurs_date_fin());
            pst.setInt(8, models_Preneurs.getPreneurs_charges_locatives());
            pst.setInt(9, models_Preneurs.getPreneurs_charges_locatives());
            pst.setFloat(10, models_Preneurs.getPreneurs_taxes_assainissement());
            pst.setInt(11, models_Preneurs.getPreneurs_caution());
            pst.setInt(12, models_Preneurs.getPreneurs_caution_consommation());
            pst.setInt(13, models_Preneurs.getPreneurs_honoraires_transaction());
            pst.setInt(14, models_Preneurs.getPreneurs_honoraires_transaction_TPS());
            pst.setInt(15, models_Preneurs.getPreneurs_enregistrement_bail_timbre());
            pst.setInt(16, models_Preneurs.getPreneurs_frais_etat_lieux());
            pst.setInt(17, models_Preneurs.getPreneurs_autre());
            
            //pst.executeUpdate();
            //int i = pst.executeUpdate();
           pst.execute();
            //rs = pst.executeQuery();
        return true;
        
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }        
        //return 0;
        
    }
    
    
    
    
    
    
    
    
    public ObservableList<Models_Preneurs> avoir_model(){
    ObservableList<Models_Preneurs> observableList = FXCollections.observableArrayList();
    
    String sql = " SELECT * FROM preneurs";
          Models_Preneurs models_Preneurs1 = null;
        try{
            
            Models_Preneurs models_Preneurs = new Models_Preneurs();
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            //System.out.println("ICI");;
            while (rs.next()) {
                
               
            models_Preneurs1 = new Models_Preneurs(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
            );
            observableList.add(models_Preneurs1);
            }
            //list_standard_preneurs.add(models_Preneurs1);
            return observableList;
        }catch(SQLException e){
            e.printStackTrace();
        }
 
        return observableList;
    }
    
    public ObservableList<Models_Preneurs> avoir_model_combox_bx(){
    ObservableList<Models_Preneurs> observableList = FXCollections.observableArrayList();
    
    String sql = " SELECT * FROM preneurs";
          Models_Preneurs models_Preneurs1 = null;
        try{
            
            //Models_Preneurs models_Preneurs = new Models_Preneurs();
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            //System.out.println("ICI");;
            while (rs.next()) {
                  //rs.getInt(1),
                   String nom = rs.getString(2);
                 String prenomdd =  rs.getString(3);
                  //  rs.getString(4),
                   // rs.getString(5)
           String week_days[] = 
                   { nom, prenomdd};
            
                   ArrayList<Models_Preneurs> integerList = new ArrayList<Models_Preneurs>();
   // integerList.add( );
//here we are not storing primitive in ArrayList, instead autoboxing will convert int primitive to Integer object

             /*
            models_Preneurs1 = new Models_Preneurs(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
            );*/
            //observableList.add(models_Preneurs1);
            observableList.add(models_Preneurs1);
            }
            //list_standard_preneurs.add(models_Preneurs1);
            return observableList;
        }catch(SQLException e){
            e.printStackTrace();
        }
 
        return observableList;
    }
    
    public ObservableList<Models_Preneurs> avoir_model_list(){
    ObservableList<Models_Preneurs> observableList = FXCollections.observableArrayList();
    
    String sql = " SELECT * FROM preneurs";
          Models_Preneurs models_Preneurs1 = null;
        try{
            
            //Models_Preneurs models_Preneurs = new Models_Preneurs();
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            //System.out.println("ICI");;
            while (rs.next()) {
                  //rs.getInt(1),
                   String nom = rs.getString(2);
                 String prenomdd =  rs.getString(3);
                  //  rs.getString(4),
                   // rs.getString(5)
           String week_days[] = 
                   { nom, prenomdd};
            
                   
             /*
            models_Preneurs1 = new Models_Preneurs(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
            );*/
            //observableList.add(models_Preneurs1);
            observableList.add(models_Preneurs1);
            }
            //list_standard_preneurs.add(models_Preneurs1);
            return observableList;
        }catch(SQLException e){
            e.printStackTrace();
        }
 
        return observableList;
    }
    
    public void supprimer_depuis_table(ObservableList<Models_Preneurs> omp){
        String sql = "delete preneurs_id from preneurs";
        //pst.execute();
        
    }
    
    public  boolean modifier_par_id(Models_Preneurs models_Preneurs){
      String sql = "UPDATE preneurs set preneurs_nom=?, preneurs_prenom=? WHERE preneurs_id=?";
     base_Donnees_Mysql.connecter();
        try {
             pst = connection.prepareStatement(sql);
            pst.setString(1, models_Preneurs.getPreneurs_nom());
            pst.setString(2, models_Preneurs.getPreneurs_prenom());
           // pst.setString(1, models_Preneurs.getPreneurs_nom());
          // pst.execute();
            pst.executeUpdate();
         return true;
         
        } catch (SQLException ex) {
        ex.printStackTrace();  
         return false;
           }
    
    }
         public boolean supprimer_avec_id(int preneurs_id){
        String sql = "delete from preneurs WHERE preneurs_id=?";
        String sql1 = "delete from preneurs WHERE"+preneurs_id+"=?";

        base_Donnees_Mysql.connecter();
        try {
             pst = connection.prepareStatement(sql);
            pst.setInt(1, preneurs_id);
           // pst.setString(1, models_Preneurs.getPreneurs_prenom());
           // pst.setString(1, models_Preneurs.getPreneurs_nom());
            //pst.execute();            
            pst.executeUpdate();
         return true;
         
        } catch (SQLException ex) {
        ex.printStackTrace();  
         return false;
           }  
    }
public void avoir_preneurs_id(int preneurs_id){
    //https://www.youtube.com/watch?v=28e6mnoUO9c&index=10&list=PLp7jZY_ad41tA3x8UFXphWcsYYFAUqxbm
        String sql = "SELECT * from preneurs WHERE preneurs_id=?";
        String sql1 = "SELECT * from preneurs WHERE"+preneurs_id+"=?";
        base_Donnees_Mysql.connecter();
        models_Preneurs = new Models_Preneurs();
        try {
             pst = connection.prepareStatement(sql);
             if(rs.next()){
            pst.setInt(1, models_Preneurs.getPreneurs_id());
           pst.setString(2, models_Preneurs.getPreneurs_prenom());
           pst.setString(3, models_Preneurs.getPreneurs_nom());
             }
            
            //pst.execute();
         //return true;
         
        } catch (SQLException ex) {
        ex.printStackTrace();  
        // return false;
           }  
    }       

    
    
}
