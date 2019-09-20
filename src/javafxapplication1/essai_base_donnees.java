/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafxapplication1.base_donnees.Base_Donnee_DAO_Bailleurs;
import javafxapplication1.base_donnees.Base_Donnees_Mysql;
import javafxapplication1.models.Bailleurs;

/**
 *
 * @author freexx
 */
public class essai_base_donnees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Bailleurs bailleurs = new Bailleurs();
    
      javafxapplication1.base_donnees.Base_Donnees_Interface_DAO base_donnees = javafxapplication1.base_donnees.Base_Donees_Factory.choisie_base_donnees("mysql");
    Connection connection = base_donnees.connecter();
    Base_Donnees_Mysql base_Donnees_Mysql = new Base_Donnees_Mysql();
    
     PreparedStatement pst;
     ResultSet rs = null;
     String requete;
     
                 int numColumns = rs.getMetaData().getColumnCount();
while ( rs.next() ) {
            for ( int i = 1 ; i <= numColumns ; i++ ) {
                // Column numbers start at 1.
                // Also there are many methods on the result set to return
                // the column as a particular type. Refer to the Sun documentation
                // for the list of valid conversions.
                System.out.println( "COLUMN " + i + " = " + rs.getObject(i) );
            } // for
        } // while


    Base_Donnee_DAO_Bailleurs bddaob = new Base_Donnee_DAO_Bailleurs();

     List<Bailleurs> list_test= bddaob.afficher_list();
     
     if(list_test != null){
         for(int x=0; !list_test.isEmpty() ; x++ ){
             list_test.get(x).getBailleurs_id();
             list_test.get(x).getBailleurs_nom();
             list_test.get(x).getBailleurs_prenom();
             list_test.get(x).getBailleurs_date_naissance();
             list_test.get(x).getBailleurs_addresse();
             //list_test.get(x).getBailleurs_prenom();
             System.out.println("--------------------------");
         }
     }else{
         System.out.println(" NO");
     }
    }
    
    
}
