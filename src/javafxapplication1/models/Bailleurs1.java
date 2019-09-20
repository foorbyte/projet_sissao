/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author freexx
 */
public class Bailleurs1 {
   
    private IntegerProperty bailleurs_id;
    private StringProperty bailleurs_nom;
    private StringProperty bailleurs_prenom;
    private StringProperty bailleurs_date_naissance;
    private StringProperty bailleurs_addresse;
    private StringProperty bailleurs_sexe;

    public Bailleurs1() {
        this.bailleurs_id = new SimpleIntegerProperty();
        this.bailleurs_nom = new SimpleStringProperty();
        this.bailleurs_prenom = new SimpleStringProperty();
        this.bailleurs_date_naissance = new SimpleStringProperty();
        this.bailleurs_addresse = new SimpleStringProperty();
    }

    /**
     * @return the bailleurs_id
     */
    public int getBailleurs_id() {
        return bailleurs_id.get();
    }

    /**
     * @param bailleurs_id the bailleurs_id to set
     */
    public void setBailleurs_id(int bailleurs_id) {
        this.bailleurs_id.set(bailleurs_id);
    }

    /**
     * @return the bailleurs_nom
     */
    public String getBailleurs_nom() {
        return bailleurs_nom.get();
    }

    /**
     * @param bailleurs_nom the bailleurs_nom to set
     */
    public void setBailleurs_nom(String bailleurs_nom) {
        this.bailleurs_nom.set(bailleurs_nom);
    }

    /**
     * @return the bailleurs_prenom
     */
    public String getBailleurs_prenom() {
        return bailleurs_prenom.get();
    }

    /**
     * @param bailleurs_prenom the bailleurs_prenom to set
     */
    public void setBailleurs_prenom(String bailleurs_prenom) {
        this.bailleurs_prenom.set(bailleurs_prenom);
    }

    /**
     * @return the bailleurs_date_naissance
     */
    public String getBailleurs_date_naissance() {
        return bailleurs_date_naissance.get();
    }

    /**
     * @param bailleurs_date_naissance the bailleurs_date_naissance to set
     */
    public void setBailleurs_date_naissance(String bailleurs_date_naissance) {
        this.bailleurs_date_naissance.set(bailleurs_date_naissance);
    }

    /**
     * @return the bailleurs_addresse
     */
    public String getBailleurs_addresse() {
        return bailleurs_addresse.get();
    }

    /**
     * @param bailleurs_addresse the bailleurs_addresse to set
     */
    public void setBailleurs_addresse(String bailleurs_addresse) {
        this.bailleurs_addresse.set(bailleurs_addresse);
    }

    /**
     * @return the bailleurs_sexe
     */
    public String getBailleurs_sexe() {
        return bailleurs_sexe.get();
    }

    /**
     * @param bailleurs_sexe the bailleurs_sexe to set
     */
    public void setBailleurs_sexe(String bailleurs_sexe) {
        this.bailleurs_sexe.set(bailleurs_sexe);
    }

    
}
