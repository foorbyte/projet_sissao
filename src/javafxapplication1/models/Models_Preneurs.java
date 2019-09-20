/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author freexx
 */
public class Models_Preneurs {
/*
    
    public int getPreneurs_loyer_menuel() {
        return preneurs_loyer_menuel.get();
    }

   
   // public void setPreneurs_loyer_menuel(int preneurs_loyer_menuel) {
       // this.preneurs_loyer_menuel.set(preneurs_loyer_menuel);
    //}
     public void setPreneurs_loyer_menuel(int preneurs_loyer_menuel) {
        this.preneurs_loyer_menuel.set(preneurs_loyer_menuel);
    }

  
    public String getPreneurs_date_debut() {
        return preneurs_date_debut.get();
    }

    
    public void setPreneurs_date_debut(String preneurs_date_debut) {
        this.preneurs_date_debut.set(preneurs_date_debut);
    }

  
    
    public String getPreneurs_date_fin() {
        return preneurs_date_fin.get();
    }

    /**
     * @param preneurs_date_fin the preneurs_date_fin to set
     *
    public void setPreneurs_date_fin(String preneurs_date_fin) {
        this.preneurs_date_fin.set(preneurs_date_fin);
    }

    /**
     * @return the preneurs_charges_locatives
     *
    public int getPreneurs_charges_locatives() {
        return preneurs_charges_locatives.get();
    }

    /**
     * @param preneurs_charges_locatives the preneurs_charges_locatives to set
     *
    public void setPreneurs_charges_locatives(int preneurs_charges_locatives) {
        this.preneurs_charges_locatives.set(preneurs_charges_locatives);
    }

    /**
     * @return the preneurs_taxes_assainissement
     
    public float getPreneurs_taxes_assainissement() {
        return preneurs_taxes_assainissement.get();
    }

    /**
     * @param preneurs_taxes_assainissement the preneurs_taxes_assainissement to set
    
    public void setPreneurs_taxes_assainissement(float preneurs_taxes_assainissement) {
        this.preneurs_taxes_assainissement.set(preneurs_taxes_assainissement);
    }

   
    public int getPreneurs_caution() {
        return preneurs_caution.get();
    }

    /**
     * @param preneurs_caution the preneurs_caution to set
  
    public void setPreneurs_caution(int preneurs_caution) {
        this.preneurs_caution.set(preneurs_caution);
    }

    /**
     * @return the preneurs_caution_consommation
    
    public int getPreneurs_caution_consommation() {
        return preneurs_caution_consommation.get();
    }

    /**
     * @param preneurs_caution_consommation the preneurs_caution_consommation to set
  
    public void setPreneurs_caution_consommation(int preneurs_caution_consommation) {
        this.preneurs_caution_consommation.set(preneurs_caution_consommation);
    }

    /**
     * @return the preneurs_honoraires_transaction
     
    public int getPreneurs_honoraires_transaction() {
        return preneurs_honoraires_transaction.get();
    }

    /**
     * @param preneurs_honoraires_transaction the preneurs_honoraires_transaction to set
     
    public void setPreneurs_honoraires_transaction(int preneurs_honoraires_transaction) {
        this.preneurs_honoraires_transaction.set(preneurs_honoraires_transaction);
    }

    /**
     * @return the preneurs_honoraires_transaction_TPS
     
    public int getPreneurs_honoraires_transaction_TPS() {
        return preneurs_honoraires_transaction_TPS.get();
    }

    /**
     * @param preneurs_honoraires_transaction_TPS the preneurs_honoraires_transaction_TPS to set
     
    public void setPreneurs_honoraires_transaction_TPS(int preneurs_honoraires_transaction_TPS) {
        this.preneurs_honoraires_transaction_TPS.set(preneurs_honoraires_transaction_TPS);
    }

    /**
     * @return the preneurs_enregistrement_bail_timbre
     
    public int getPreneurs_enregistrement_bail_timbre() {
        return preneurs_enregistrement_bail_timbre.get();
    }

    /**
     * @param preneurs_enregistrement_bail_timbre the preneurs_enregistrement_bail_timbre to set
     
    public void setPreneurs_enregistrement_bail_timbre(int preneurs_enregistrement_bail_timbre) {
        this.preneurs_enregistrement_bail_timbre.set(preneurs_enregistrement_bail_timbre);
    }

    /**
     * @return the preneurs_honoraire_redaction
     
    public int getPreneurs_honoraire_redaction() {
        return preneurs_honoraire_redaction.get();
    }

    /**
     * @param preneurs_honoraire_redaction the preneurs_honoraire_redaction to set
     
    public void setPreneurs_honoraire_redaction(int preneurs_honoraire_redaction) {
        this.preneurs_honoraire_redaction.set(preneurs_honoraire_redaction);
    }

    /**
     * @return the preneurs_frais_etat_lieux
     
    public int getPreneurs_frais_etat_lieux() {
        return preneurs_frais_etat_lieux.get();
    }

    /**
     * @param preneurs_frais_etat_lieux the preneurs_frais_etat_lieux to set

    public void setPreneurs_frais_etat_lieux(int preneurs_frais_etat_lieux) {
        this.preneurs_frais_etat_lieux.set(preneurs_frais_etat_lieux);
    }

    /**
     * @return the preneurs_autre
    
    public int getPreneurs_autre() {
        return preneurs_autre.get();
    }

    /**
     * @param preneurs_autre the preneurs_autre to set
    
    public void setPreneurs_autre(int preneurs_autre) {
        this.preneurs_autre.set(preneurs_autre);
    }
    
    */
    private int preneurs_id;
    private String preneurs_nom;
    
    private String preneurs_prenom;
    private String preneurs_date_naissance;
    private String preneurs_addresse;
    
     private int preneurs_loyer_menuel;
    private String preneurs_date_debut;
    private String preneurs_date_fin;
    private int preneurs_charges_locatives;
    private float preneurs_taxes_assainissement;
    private int preneurs_caution;
    private int preneurs_caution_consommation;
    private int preneurs_honoraires_transaction;
    private int preneurs_honoraires_transaction_TPS;
    private int preneurs_enregistrement_bail_timbre;
        private int preneurs_honoraire_redaction;
    private int preneurs_frais_etat_lieux;
    private int preneurs_autre;
    
    /*
    private IntegerProperty preneurs_loyer_menuel;
    private StringProperty preneurs_date_debut;
    private StringProperty preneurs_date_fin;
    private IntegerProperty preneurs_charges_locatives;
    private FloatProperty preneurs_taxes_assainissement;
    private IntegerProperty preneurs_caution;
    private IntegerProperty preneurs_caution_consommation;
    private IntegerProperty preneurs_honoraires_transaction;
    private IntegerProperty preneurs_honoraires_transaction_TPS;
    private IntegerProperty preneurs_enregistrement_bail_timbre;
        private IntegerProperty preneurs_honoraire_redaction;
    private IntegerProperty preneurs_frais_etat_lieux;
    private IntegerProperty preneurs_autre;
    */

    public Models_Preneurs() {
    }
    
    private  SimpleStringProperty firstName;

    public Models_Preneurs(int aInt_id, String string_nom, String string0, String string2, String dddd )
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.preneurs_id = aInt_id;
        this.preneurs_nom =string_nom;
        
        this.preneurs_prenom =string0;
        this.preneurs_date_naissance = string2;
        this.preneurs_addresse = dddd;
    }

   
    
    
    
    
    
    
   
    
    
    
    
    public int getPreneurs_id(){
        return preneurs_id;
    }
    
    public void setPreneurs_id(int preneurs_i){
        this.preneurs_id = preneurs_i;
    }
    public String getPreneurs_nom() {
        return preneurs_nom;
    }

    public void setPreneurs_nom(String preneurs_nom) {
        this.preneurs_nom = preneurs_nom;
    }

    public String getPreneurs_prenom() {
        return preneurs_prenom;
    }

    public void setPreneurs_prenom(String preneurs_prenom) {
        this.preneurs_prenom = preneurs_prenom;
    }

    public String getPreneurs_date_naissance() {
        return preneurs_date_naissance;
    }
    
    public void setPreneurs_date_naissance(String preneurs_date_naissance) {
        this.preneurs_date_naissance = preneurs_date_naissance;
    }

    /**
     * @return the preneurs_addresse
     */
    public String getPreneurs_addresse() {
        return preneurs_addresse;
    }

    /**
     * @param preneurs_addresse the preneurs_addresse to set
     */
    public void setPreneurs_addresse(String preneurs_addresse) {
        this.preneurs_addresse = preneurs_addresse;
    }

    
    
    
    /**
     * @return the firstName
     */
    public SimpleStringProperty getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(SimpleStringProperty firstName) {
        this.firstName = firstName;
    }

    
    
    
    private  String _firstName = "";
    private  SimpleStringProperty firstName1;
    public  String getFirstName1()
    {
        if (firstName1 == null)
            return _firstName;
        else
            return firstName1.get();
    }
    public final void setFirstName1(String value)
    {
        if (firstName1 == null)
            _firstName = value;
        else
            firstName1.set(value);
    }
    public final StringProperty firstName1Property()
    { 
           if (firstName1 == null)
            firstName1 = new SimpleStringProperty(
                this, "firstName", _firstName);
       return firstName1;
    }
    
    //private final StringProperty name = new SimpleStringProperty(this, "name");
        private final StringProperty name = new SimpleStringProperty();

    public final String getName() { 
    return name.get(); 
}
    public final void setName(final String value) { 
    name.set(value); 
}
    public final StringProperty nameProperty() { 
    return name; 
}

    /**
     * @return the preneurs_loyer_menuel
     */
    public int getPreneurs_loyer_menuel() {
        return preneurs_loyer_menuel;
    }

    /**
     * @param preneurs_loyer_menuel the preneurs_loyer_menuel to set
     */
    public void setPreneurs_loyer_menuel(int preneurs_loyer_menuel) {
        this.preneurs_loyer_menuel = preneurs_loyer_menuel;
    }

    /**
     * @return the preneurs_date_debut
     */
    public String getPreneurs_date_debut() {
        return preneurs_date_debut;
    }

    /**
     * @param preneurs_date_debut the preneurs_date_debut to set
     */
    public void setPreneurs_date_debut(String preneurs_date_debut) {
        this.preneurs_date_debut = preneurs_date_debut;
    }

    /**
     * @return the preneurs_date_fin
     */
    public String getPreneurs_date_fin() {
        return preneurs_date_fin;
    }

    /**
     * @param preneurs_date_fin the preneurs_date_fin to set
     */
    public void setPreneurs_date_fin(String preneurs_date_fin) {
        this.preneurs_date_fin = preneurs_date_fin;
    }

    /**
     * @return the preneurs_charges_locatives
     */
    public int getPreneurs_charges_locatives() {
        return preneurs_charges_locatives;
    }

    /**
     * @param preneurs_charges_locatives the preneurs_charges_locatives to set
     */
    public void setPreneurs_charges_locatives(int preneurs_charges_locatives) {
        this.preneurs_charges_locatives = preneurs_charges_locatives;
    }

    /**
     * @return the preneurs_taxes_assainissement
     */
    public float getPreneurs_taxes_assainissement() {
        return preneurs_taxes_assainissement;
    }

    /**
     * @param preneurs_taxes_assainissement the preneurs_taxes_assainissement to set
     */
    public void setPreneurs_taxes_assainissement(float preneurs_taxes_assainissement) {
        this.preneurs_taxes_assainissement = preneurs_taxes_assainissement;
    }

    /**
     * @return the preneurs_caution
     */
    public int getPreneurs_caution() {
        return preneurs_caution;
    }

    /**
     * @param preneurs_caution the preneurs_caution to set
     */
    public void setPreneurs_caution(int preneurs_caution) {
        this.preneurs_caution = preneurs_caution;
    }

    /**
     * @return the preneurs_caution_consommation
     */
    public int getPreneurs_caution_consommation() {
        return preneurs_caution_consommation;
    }

    /**
     * @param preneurs_caution_consommation the preneurs_caution_consommation to set
     */
    public void setPreneurs_caution_consommation(int preneurs_caution_consommation) {
        this.preneurs_caution_consommation = preneurs_caution_consommation;
    }

    /**
     * @return the preneurs_honoraires_transaction
     */
    public int getPreneurs_honoraires_transaction() {
        return preneurs_honoraires_transaction;
    }

    /**
     * @param preneurs_honoraires_transaction the preneurs_honoraires_transaction to set
     */
    public void setPreneurs_honoraires_transaction(int preneurs_honoraires_transaction) {
        this.preneurs_honoraires_transaction = preneurs_honoraires_transaction;
    }

    /**
     * @return the preneurs_honoraires_transaction_TPS
     */
    public int getPreneurs_honoraires_transaction_TPS() {
        return preneurs_honoraires_transaction_TPS;
    }

    /**
     * @param preneurs_honoraires_transaction_TPS the preneurs_honoraires_transaction_TPS to set
     */
    public void setPreneurs_honoraires_transaction_TPS(int preneurs_honoraires_transaction_TPS) {
        this.preneurs_honoraires_transaction_TPS = preneurs_honoraires_transaction_TPS;
    }

    /**
     * @return the preneurs_enregistrement_bail_timbre
     */
    public int getPreneurs_enregistrement_bail_timbre() {
        return preneurs_enregistrement_bail_timbre;
    }

    /**
     * @param preneurs_enregistrement_bail_timbre the preneurs_enregistrement_bail_timbre to set
     */
    public void setPreneurs_enregistrement_bail_timbre(int preneurs_enregistrement_bail_timbre) {
        this.preneurs_enregistrement_bail_timbre = preneurs_enregistrement_bail_timbre;
    }

    /**
     * @return the preneurs_honoraire_redaction
     */
    public int getPreneurs_honoraire_redaction() {
        return preneurs_honoraire_redaction;
    }

    /**
     * @param preneurs_honoraire_redaction the preneurs_honoraire_redaction to set
     */
    public void setPreneurs_honoraire_redaction(int preneurs_honoraire_redaction) {
        this.preneurs_honoraire_redaction = preneurs_honoraire_redaction;
    }

    /**
     * @return the preneurs_frais_etat_lieux
     */
    public int getPreneurs_frais_etat_lieux() {
        return preneurs_frais_etat_lieux;
    }

    /**
     * @param preneurs_frais_etat_lieux the preneurs_frais_etat_lieux to set
     */
    public void setPreneurs_frais_etat_lieux(int preneurs_frais_etat_lieux) {
        this.preneurs_frais_etat_lieux = preneurs_frais_etat_lieux;
    }

    /**
     * @return the preneurs_autre
     */
    public int getPreneurs_autre() {
        return preneurs_autre;
    }

    /**
     * @param preneurs_autre the preneurs_autre to set
     */
    public void setPreneurs_autre(int preneurs_autre) {
        this.preneurs_autre = preneurs_autre;
    }
}
