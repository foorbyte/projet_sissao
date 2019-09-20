/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author freexx
 */
public class Bailleurs {
   
    private Integer bailleurs_id;
    private String bailleurs_nom;
    private String bailleurs_prenom;
    private String bailleurs_date_naissance;
    private String bailleurs_addresse;
    private String bailleurs_sexe;

    public Bailleurs() {
    }

    public Bailleurs(int id, String string, String string0, String string1, String string2) {
        
        this.bailleurs_id = id;
        this.bailleurs_nom = string;
        this.bailleurs_prenom = string0;
        this.bailleurs_date_naissance = string1;
        this.bailleurs_addresse = string2;
    }
    

    public int getBailleurs_id() {
        return bailleurs_id;
    }
    public void setBailleurs_id(SimpleIntegerProperty bailleurs_id) {
        this.setBailleurs_id(bailleurs_id);
    }

    public String getBailleurs_nom() {
        return bailleurs_nom;
    }
    
    /*
      public int getBailleurs_id() {
        return bailleurs_id;
    }
    public void setBailleurs_id(SimpleIntegerProperty bailleurs_id) {
        this.setBailleurs_id(bailleurs_id);
    }

    public String getBailleurs_nom() {
        return bailleurs_nom;
    }
*/
 
    public void setBailleurs_nom(SimpleStringProperty bailleurs_nom) {
        this.setBailleurs_nom(bailleurs_nom);
    }

    
    public void setBailleurs_id(int bailleurs_id) {
        this.bailleurs_id = bailleurs_id;
    }

    public void setBailleurs_nom(String bailleurs_nom) {
        this.bailleurs_nom = bailleurs_nom;
    }

    public void setBailleurs_prenom(String bailleurs_prenom) {
        this.bailleurs_prenom =  bailleurs_prenom;
    }

    public void setBailleurs_date_naissance(String preneurs_date_aissance) {
        this.bailleurs_date_naissance = preneurs_date_aissance;
    }

    public void setBailleurs_addresse(String text) {
        this.bailleurs_addresse =text;
    }


    /**
     * @return the bailleurs_sexe
     */
    public String getBailleurs_sexe() {
        return bailleurs_sexe;
    }

    /**
     * @param bailleurs_sexe the bailleurs_sexe to set
     */
    public void setBailleurs_sexe(String bailleurs_sexe) {
        this.bailleurs_sexe = bailleurs_sexe;
    }

    /**
     * @return the bailleurs_prenom
     */
    public String getBailleurs_prenom() {
        return bailleurs_prenom;
    }

    /**
     * @return the bailleurs_date_naissance
     */
    public String getBailleurs_date_naissance() {
        return bailleurs_date_naissance;
    }

    /**
     * @return the bailleurs_addresse
     */
    public String getBailleurs_addresse() {
        return bailleurs_addresse;
    }
    
}
