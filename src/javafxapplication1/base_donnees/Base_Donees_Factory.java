/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.base_donnees;

/**
 *
 * @author freexx
 */
public class Base_Donees_Factory {
    public static Base_Donnees_Interface_DAO choisie_base_donnees(String nom_base_donne){
        
        if(nom_base_donne == "mysql"){
            return new Base_Donnees_Mysql();
        }else if(nom_base_donne.equalsIgnoreCase("posgree")){
            
        }
        return null;
    }
}
