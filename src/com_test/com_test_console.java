/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com_test;

import java.sql.Connection;
import metiers_com.Categories;
import metiers_com.Produits;
import metiers_com.SingletonConnection;
import metiers_com.implementation_catalogue;

/**
 *
 * @author freexx
 */
public class com_test_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Connection connection = SingletonConnection.getConnection();
        implementation_catalogue essai = new implementation_catalogue();
        Categories c = new Categories();
       String s ;
       
      System.out.println(""+c.getCategories_nom()+"ICI");

        //c.setCategories_nom("Ordinateurs");
        //essai.ajout_categories(c.getCategories_nom());
        c.setCategories_nom("Imprimantes");
       // s = c.name() ;
        // s = "eeeeeeee";
        String ajout_cat = "okbis";
        c = new Categories("CA");
        System.out.println("categorie nom contient alors:"+c.Categories_nom);
        System.out.println(
                String.format("essai %s", ajout_cat));
        
        System.out.println(""+c.getCategories_nom()+"ICI");
        
        boolean i = essai.ajout_categories2(c.getCategories_nom());
        if(i= true){
            System.out.println("ok");
        }
        
        //Produits produits = new Produits();
        //produits.setProduits_nom("HP");
        //essai.ajout_produits1(produits);
        
        //essai.ajout_categories(c);
        
        essai.avoire_produits_meta_data();
    }
    
}
