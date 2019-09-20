/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metiers_com;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author freexx
 */
public class implementation_catalogue implements interfaces.Interfaces_metiers{

    PreparedStatement pst;
    ResultSet rs ;
            Connection connection = SingletonConnection.getConnection();
                        ResultSetMetaData rsmd;

                        
                        
   public boolean ajout_categories2(String s) {
        String sql = "INSERT INTO categories(categories_nom) VALUE(?)";
        try {
            Categories categories = new Categories();
            PreparedStatement pst = connection.prepareStatement
                (sql);
            pst.setString(1,categories.getCategories_nom() );
            int i = pst.executeUpdate();
            
            if(i==1){
                return true;
            }
            pst.close();
            //connection.close();
            
        } catch (SQLException ex) {
ex.printStackTrace();
        }
        return false;
    }                       
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
    @Override
    public void ajout_categories(Categories categories) {
        String sql = "INSERT INTO categories(categories_nom) VALUE(?)";
        try {
            PreparedStatement pst = connection.prepareStatement
                (sql);
            pst.setString(1, categories.getCategories_nom());
            pst.executeUpdate();
            pst.close();
            //connection.close();
            
        } catch (SQLException ex) {
ex.printStackTrace();
        }
    }

    @Override
    public void ajout_produits(Produits produits, int ref_id_cat) {
        String sql = "INSERT INTO produits(produits_nom,produits_quantite, produits_prix) VALUE(?, ?, ?)";
        try {
            PreparedStatement pst = connection.prepareStatement
                (sql);
            pst.setString(1, produits.getProduits_nom());
            pst.setInt(2, produits.getProduits_quantitie());
            pst.setDouble(3, produits.getProduits_prix());
            pst.executeUpdate();
            pst.close();
            //connection.close();
            
        } catch (SQLException ex) {
ex.printStackTrace();
        }
    }

    @Override
    public List<Produits> avoirProduits_parMC(String mc) {
        List<Produits> produit_list = new ArrayList<Produits>();
  String sql = "SELECT * FROM produits WHERE produits_nom LIKE ?";
        try {
            PreparedStatement pst = connection.prepareStatement
                (sql);
            pst.setString(1, "%"+mc+"%");
            ResultSet rs = pst.executeQuery();
            
             while(rs.next()){
                 Produits produits = new Produits();
               /*
                  for(int i=1; i<=rsmd.getColumnCount();i++){

                     System.out.println(""+rsmd.getColumnName(i));
                System.out.println(""+rs.getInt(0)+"\t \t");
                }
                 */
                    produits.setProduits_id(rs.getInt("produits_id"));
                    produits.setProduits_nom(rs.getString(1));
                    produits.setProduits_quantitie(rs.getInt(2));
                    produits.setProduits_prix(rs.getDouble(3));
               produit_list.add(produits);
                
            }
        } 
        catch(Exception e){
            e.printStackTrace();
        }
        return produit_list;
    }

    @Override
    public List<Categories> avoir_all_Categorieses() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categories> avoir_Categorieses(int cat_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void avoire_produits(Produits produits) {
         String sql = "SELECT * FROM produits";
        try {
            PreparedStatement pst = connection.prepareStatement
                (sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                System.out.println(""+rs.getInt(0));
                System.out.println(""+rs.getString(1));
                System.out.println(""+rs.getInt("produits_quantite"));
                System.out.println(""+rs.getDouble(3));
                
            }
                }
        catch(Exception e){
            e.printStackTrace();
        }

    }

       public void avoire_produits_meta_data() {
         String sql = "SELECT * FROM produits";
        try {
            PreparedStatement pst = connection.prepareStatement
                (sql);
            ResultSet rs = pst.executeQuery();
           // ResultSetMetaData rsmd = rs.getMetaData();
            for(int i=1; i<=rsmd.getColumnCount();i++){
                System.out.println(""+rsmd.getColumnName(i));
                 System.out.println(""+rs.getInt(0)+"\t \t");
            }
            while(rs.next()){
                for(int i=1; i<=rsmd.getColumnCount();i++){
                     System.out.println(""+rsmd.getColumnName(i));
                System.out.println(""+rs.getInt(0)+"\t \t");
                }
               
                System.out.println(""+rs.getString(1));
                System.out.println(""+rs.getInt("produits_quantite"));
                System.out.println(""+rs.getDouble(3));
                
            }
                }
        catch(Exception e){
            e.printStackTrace();
        }

    }
       
 public void ajout_produits1(Produits produits) {
        String sql = "INSERT INTO produits(produits_nom,produits_quantite, produits_prix) VALUE(?, ?, ?)";
        try {
            PreparedStatement pst = connection.prepareStatement
                (sql);
            pst.setString(1, produits.getProduits_nom());
            pst.setInt(2, produits.getProduits_quantitie());
            pst.setDouble(3, produits.getProduits_prix());
            pst.executeUpdate();
            pst.close();
            //connection.close();
            
        } catch (SQLException ex) {
ex.printStackTrace();
        }
        
  
    }
 
 
    
}

