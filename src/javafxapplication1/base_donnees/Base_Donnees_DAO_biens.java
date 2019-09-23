/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.base_donnees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafxapplication1.models.Bailleurs;
import javafxapplication1.models.Models_Preneurs;
import javafxapplication1.models.biens;

/**
 *
 * @author freexx
 */
public class Base_Donnees_DAO_biens implements Base_Donnees_Interfaces_crud <javafxapplication1.models.biens>{

         private  javafxapplication1.models.biens model_biens = new biens() ;

    private final javafxapplication1.base_donnees.Base_Donnees_Interface_DAO base_donnees = javafxapplication1.base_donnees.Base_Donees_Factory.choisie_base_donnees("mysql");
    private final Connection connection = base_donnees.connecter();
    private final Base_Donnees_Mysql base_Donnees_Mysql = new Base_Donnees_Mysql();
    
    private PreparedStatement pst;
    private ResultSet rs;
    private String requete;
    
    //biens = new biens();
    //Le controlleur pour inserer les biens declarer par les bailleurs
    @Override
    public boolean ajout(biens o) {
        base_Donnees_Mysql.connecter();
        requete = "INSERT INTO biens("
                + "Biens_adresse, Biens_numero_lot, Biens_nom, bienscol_inconnu, Biens_garantie,"
                + " bienscol_salle_sejou, bienscol_salle_chambre, bienscol_salle_manger, bienscol_salle_eau,"
                + "bienscol_salle_bain, bienscol_salle_cuisine, bienscol_salle_dependance,"
                + "bienscol_salle_piscine, bienscol_salle_jardin, bienscol_nombre"
                + ")VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
        //https://www.youtube.com/watch?v=h3W-dEeoPVA&t=256s
//https://www.youtube.com/watch?v=OjOxUC95I2g&list=PLd4Jo6d-yhDJDu6z0luwaKpW2QD-jGVGc&index=13
 //https://www.youtube.com/watch?v=rlYpN26kLAc&index=18&list=PLd4Jo6d-yhDJDu6z0luwaKpW2QD-jGVGc
            pst = connection.prepareStatement(requete);
            //pst.setInt(0, models_Preneurs.getPreneurs_id());
            //https://platform.netbeans.org/tutorials/nbm-crud.html
            //pst.setInt(1, model_biens.getId_biens());
            pst.setString(1, model_biens.getBiens_localisation());
            pst.setInt(2, model_biens.getBiens_numero_lot());
            pst.setString(3, model_biens.getBiens_nom());
            pst.setString(4, model_biens.getBiens_inconue_de());
            pst.setInt(5, model_biens.getBiens_garantie());            
            pst.setInt(6, model_biens.getBiens_pieces_sejou());
            pst.setInt(7, model_biens.getBiens_pieces_chambres());
            pst.setInt(8, model_biens.getBiens_pieces_salle_manger());
            pst.setInt(9, model_biens.getBiens_pieces_salles_eau());
            pst.setInt(10, model_biens.getBiens_pieces_bureau());
            pst.setInt(11, model_biens.getBiens_pieces_cuisine());
            pst.setInt(12, model_biens.getBiens_pieces_dependances());
            pst.setInt(13, model_biens.getBiens_pieces_piscine());
            pst.setInt(14, model_biens.getBiens_pieces_jardin());
            pst.setInt(15, model_biens.getBiens_nombre_piece());
            
            pst.setInt(16, model_biens.getBiens_bailleurs_id());
            

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
    

    @Override
    public boolean modifier(biens o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean supprimer(biens o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ObservableList<Bailleurs> lister() {

        ObservableList<Bailleurs> observableList = FXCollections.observableArrayList();
    
    String sql = " SELECT bailleurs_nom FROM bailleurs";
          Bailleurs models_bailleurs = new Bailleurs();
        try{
            
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            //System.out.println("ICI");;
            while (rs.next()) {
             /*   
               observableList.add( rs.getString(2));
               
            observableList.add(model_biens);
            
            models_Preneurs1.getFirstName(rs.getString(1));
            observableList.add(models_Preneurs1);
            
            observableList.add(rs.getString(1));
            */
            models_bailleurs.setBailleurs_nom(rs.getString(1));
            observableList.add(models_bailleurs);
            }
            //list_standard_preneurs.add(models_Preneurs1);
            return observableList;
        }catch(SQLException e){
            e.printStackTrace();
        }
 
        return observableList;
    }

    //Pour recuper l'id du bailleurs et l'inserrer dans les biens
    public int recupe_id_combobox_bien(ComboBox comboBox) throws SQLException{
             
        String sql = " SELECT * FROM bailleurs WHERE bailleurs_id=?";
        pst = connection.prepareStatement(sql);
        
        
        return 0;
        
    }

   
   
}
