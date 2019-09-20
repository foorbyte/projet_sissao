/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.base_donnees;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafxapplication1.models.Models_Preneurs;
import javafxapplication1.models.Bailleurs;

/**
 *
 * @author freexx
 */
//Exception in thread "JavaFX Application Thread" java.lang.NullPointerException 	at package() 	at .lambda$initialize$2

public class Base_Donnee_DAO_Bailleurs {

    

    private Bailleurs bailleurs = new Bailleurs();
    
    private final javafxapplication1.base_donnees.Base_Donnees_Interface_DAO base_donnees = javafxapplication1.base_donnees.Base_Donees_Factory.choisie_base_donnees("mysql");
    private final Connection connection = base_donnees.connecter();
    private final Base_Donnees_Mysql base_Donnees_Mysql = new Base_Donnees_Mysql();
    
    private PreparedStatement pst;
    private ResultSet rs;
    private String requete;
    //private Connection connection;
    
    public  void bailleurs_ajouter_un(String text, String text0, String text1, String text2) throws SQLException {

        String requete = "INSERT INTO bailleurs(bailleurs_nom, bailleurs_prenon, bailleurs_date_naissance, bailleurs_addresse)VALUES( ?, ?, ?, ?)";
        //base_Donnees_Mysql.connecter();
        //Models_Preneurs models_Preneurs = new Models_Preneurs();
    pst = connection.prepareStatement(requete);
            
           pst.execute();
           System.out.println("...(bien)");
    }
    
    public Base_Donnee_DAO_Bailleurs() {
    }
    //https://www.youtube.com/watch?v=L8iuBXl-F8U
    
    //public static ObservableList<Bailleurs> get_bailleurs_objects (ResultSet resultSet) {
    public  ObservableList<Bailleurs> get_bailleurs_objects (ResultSet resultSet) {
        
            ObservableList<Bailleurs> list_adaptor = FXCollections.observableArrayList();
        
        try {
            while (resultSet.next()) {
                Bailleurs bailleurs = new Bailleurs();
                bailleurs.setBailleurs_id(rs.getInt("bailleurs_id"));
                bailleurs.setBailleurs_nom(rs.getString("bailleurs_nom"));
                bailleurs.setBailleurs_prenom(rs.getString("bailleurs_prenom"));
                bailleurs.setBailleurs_date_naissance(rs.getString("bailleurs_date_naissance"));
                bailleurs.setBailleurs_addresse(rs.getString("bailleurs_addresse"));
                list_adaptor.add(bailleurs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return list_adaptor;
                
    }
    public  ObservableList<Bailleurs> get_all_record() throws SQLException {
         String sql = " SELECT * FROM bailleurs";
         pst =  connection.prepareStatement(sql);
            //Logger log = new LoggerConsole(cc);
         ResultSet resultSet =  pst.executeQuery(sql);
         ObservableList<Bailleurs> list_adap = get_bailleurs_objects(resultSet);
        return list_adap;
         
         
    }
    
    public static void lien_info(Connection connection1, ObservableList<Bailleurs> list_standard){
          String sql = " SELECT * FROM bailleurs";
          list_standard = FXCollections.observableArrayList();
        try{
            Bailleurs bailleurs = new Bailleurs();
            Statement s = connection1.createStatement();
            ResultSet rs = s.executeQuery(sql);
            
            while (rs.next()) {
                bailleurs.setBailleurs_id(rs.getInt(1));
                bailleurs.setBailleurs_nom(rs.getString(2));
                bailleurs.setBailleurs_prenom(rs.getString(3));
                bailleurs.setBailleurs_date_naissance(rs.getString(4));
                bailleurs.setBailleurs_addresse(rs.getString(5));
                
                list_standard.add(bailleurs);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public boolean supprimer(Bailleurs models_Bailleurs){
        requete = " DELETE FROM bailleurs WHERE bailleurs_id=?";
        try{
            pst = connection.prepareStatement(requete);
            pst.setInt(1, models_Bailleurs.getBailleurs_id());
            pst.execute(); 
            
            
            
            return true;
        }catch(SQLException e){
            e.printStackTrace();
          return false;
        }
    }
    public List<Bailleurs> afficher_list(){
        base_Donnees_Mysql.connecter();
        List<Bailleurs> list_bailleurs = new ArrayList<>();
        requete = " select * FROM bailleurs ";
        //https://www.youtube.com/watch?v=3tmz-0g3EPs&index=3&list=PL7ubUtBKwzRkrV4gAPbtcUGOYq3j8yUW0
        try {
            pst =  connection.prepareStatement(requete);
            //Logger log = new LoggerConsole(cc);
            rs= pst.executeQuery();
            while (rs.next()) {
                bailleurs_ajouter_un(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
               
                //list_bailleurs.add(bailleurs_)
                bailleurs.setBailleurs_id(rs.getInt(1));
                bailleurs.setBailleurs_nom(rs.getString(2));
                bailleurs.setBailleurs_prenom(rs.getString(3));
                bailleurs.setBailleurs_date_naissance(rs.getString(4));
                bailleurs.setBailleurs_addresse(rs.getString(5));
                
                list_bailleurs.add(bailleurs);
            }
            //list_bailleurs.add(bailleurs);
        }catch(Exception e){
         e.printStackTrace();
         return null;
        }
        return list_bailleurs;
    }
    
    public ObservableList<Bailleurs> afficher(Bailleurs bailleurs) throws SQLException{
       //log("ok");
       base_Donnees_Mysql.connecter();
        //ObservableList<Models_Preneurs>data = null;
        ObservableList<Bailleurs> data = FXCollections.observableArrayList();
       
        requete = " select * FROM preneurs ";
        //https://www.youtube.com/watch?v=3tmz-0g3EPs&index=3&list=PL7ubUtBKwzRkrV4gAPbtcUGOYq3j8yUW0
        try {
            pst =  connection.prepareStatement(requete);
            //Logger log = new LoggerConsole(cc);
            while (rs.next()) {
                data.add(new Bailleurs(rs.getInt(0),rs.getString(1),rs.getString(2), 
                        rs.getString(3), rs.getString(4)));
                //bailleurs.setBailleurs_id(rs.getInt(0));
                
                /*bailleurs.setBailleurs_nom(rs.getString(1));
                bailleurs.setBailleurs_prenom(rs.getString(2));
                bailleurs.setBailleurs_date_naissance(rs.getString(3));
                bailleurs.setBailleurs_sexe(rs.getString(4));
                
                data.add(bailleurs);
                               */
                
                //list.getItems().addAll(list);
                //data.addAll(essai, essai1);
                //data.addAll(models_Preneurs.getPreneurs_nomm(rs.getString(0)), 
                //        (models_Preneurs.getPreneurs_prenom(rs.getString(1))
                  //              );
                
//data.add(rs.getString(1), rs.getString(2));
                
                //Obtiention des elements de la db
                //models_Preneurs.add(new
            }
            return data;
        } catch (SQLException ex) {
            ex.printStackTrace();
            //throw ex;
        }
        return data;

    }
    public boolean modifier (Bailleurs models_Bailleurs){
        requete = "update bailleurs set bailleurs_nom=?, bailleurs_prenom=?, bailleurs_date_naissance =?, bailleurs_addresse =? WHERE bailleurs_id =? ";
        try {
            pst = connection.prepareStatement(requete);
            
            pst.setString(1, models_Bailleurs.getBailleurs_nom());
            pst.setString(2, models_Bailleurs.getBailleurs_prenom());
            pst.setString(3, models_Bailleurs.getBailleurs_date_naissance());
            pst.setString(4, models_Bailleurs.getBailleurs_addresse());
            pst.setInt(5, models_Bailleurs.getBailleurs_id());
            
            pst.executeUpdate();
            //int i = pst.executeUpdate();
            return true;
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
        
    //public int ajout (Models_Preneurs models_Preneurs) {
    public boolean ajout (Bailleurs models_Bailleurs) {    
        base_Donnees_Mysql.connecter();
        //Models_Preneurs models_Preneurs = new Models_Preneurs();
        requete = "INSERT INTO bailleurs(bailleurs_nom, bailleurs_prenon, bailleurs_date_naissance, bailleurs_addresse)VALUES( ?, ?, ?, ?)";
        try {
        //https://www.youtube.com/watch?v=h3W-dEeoPVA&t=256s
//https://www.youtube.com/watch?v=OjOxUC95I2g&list=PLd4Jo6d-yhDJDu6z0luwaKpW2QD-jGVGc&index=13
 //https://www.youtube.com/watch?v=rlYpN26kLAc&index=18&list=PLd4Jo6d-yhDJDu6z0luwaKpW2QD-jGVGc
 pst = connection.prepareStatement(requete);
            //pst.setInt(0, models_Preneurs.getPreneurs_id());
            //https://platform.netbeans.org/tutorials/nbm-crud.html
            pst.setString(1, models_Bailleurs.getBailleurs_nom());
            pst.setString(2, models_Bailleurs.getBailleurs_prenom());
            pst.setString(3, models_Bailleurs.getBailleurs_date_naissance());
            pst.setString(4, models_Bailleurs.getBailleurs_addresse());
            
            pst.executeUpdate();
            //int i = pst.executeUpdate();
          // pst.execute();
            //rs = pst.executeQuery();
        return true;
        
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }        
        //return 0;
        
    }
    
    public ObservableList<Bailleurs> model_tableau_bailleurs(){
        ObservableList<Bailleurs> model_Bailleurs_tab = FXCollections.observableArrayList();
        
         String sql = " SELECT * FROM bailleurs";
        try{
            
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            //System.out.println("ICI");;
            while (rs.next()) {
                
               
             Bailleurs models_Bailleurs = new Bailleurs(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
            );
            model_Bailleurs_tab.add(models_Bailleurs);
            }
            //list_standard_preneurs.add(models_Preneurs1);
            return model_Bailleurs_tab;
        }catch(SQLException e){
            e.printStackTrace();
        }
    
        
        
        return model_Bailleurs_tab;
    }
}
