/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.models;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author freexx
 */
public class biens {
    
    private int id_biens;
    private String biens_localisation;
    private int biens_numero_lot;
    private String biens_nom;
    private String biens_inconue_de;
    
    //Faire intervenir le combobox pour lister les pieces par efaut.
    //TODO : Je dois faire une liste avec les valeurs par defaut des piences tout en inserant le nombre de ses piences dans le bial
    private String biens_etat_lieux;
    private int biens_pieces_sejou;
    private int biens_pieces_chambres;
    private int biens_pieces_salle_manger;
    private int biens_pieces_salles_eau;
    private int biens_pieces_salles_bain;
    private int biens_pieces_bureau;
    private int biens_pieces_cuisine;
    private int biens_pieces_dependances;
    private int biens_pieces_piscine;
    private int biens_pieces_jardin;
    
    private int biens_nombre_piece;
    private int biens_garantie;
    
    private int biens_bailleurs_id;
    
    //Variable pour convenir sur l'etat des lieux avec lee preneur
    private String biens_date_etat_lieux;


    private Map<String, String> hash_map_pieces = new HashMap<>();
    private HashMap<String, String> hash_map_pieces1 = new HashMap<>();

    public biens() {
    }

    
    /**
     * @return the id_biens
     */
    public int getId_biens() {
        return id_biens;
    }

    /**
     * @param id_biens the id_biens to set
     */
    public void setId_biens(int id_biens) {
        this.id_biens = id_biens;
    }

    /**
     * @return the biens_localisation
     */
    public String getBiens_localisation() {
        return biens_localisation;
    }

    /**
     * @param biens_localisation the biens_localisation to set
     */
    public void setBiens_localisation(String biens_localisation) {
        this.biens_localisation = biens_localisation;
    }

    /**
     * @return the biens_numero_lot
     */
    public int getBiens_numero_lot() {
        return biens_numero_lot;
    }

    /**
     * @param biens_numero_lot the biens_numero_lot to set
     */
    public void setBiens_numero_lot(int biens_numero_lot) {
        this.biens_numero_lot = biens_numero_lot;
    }

    /**
     * @return the biens_nom
     */
    public String getBiens_nom() {
        return biens_nom;
    }

    /**
     * @param biens_nom the biens_nom to set
     */
    public void setBiens_nom(String biens_nom) {
        this.biens_nom = biens_nom;
    }

    /**
     * @return the biens_inconue_de
     */
    public String getBiens_inconue_de() {
        return biens_inconue_de;
    }

    /**
     * @param biens_inconue_de the biens_inconue_de to set
     */
    public void setBiens_inconue_de(String biens_inconue_de) {
        this.biens_inconue_de = biens_inconue_de;
    }

    /**
     * @return the biens_nombre_piece
     */
    public int getBiens_nombre_piece() {
        return biens_nombre_piece;
    }

    /**
     * @param biens_nombre_piece the biens_nombre_piece to set
     */
    public void setBiens_nombre_piece(int biens_nombre_piece) {
        this.biens_nombre_piece = biens_nombre_piece;
    }

    /**
     * @return the biens_garantie
     */
    public int getBiens_garantie() {
        return biens_garantie;
    }

    /**
     * @param biens_garantie the biens_garantie to set
     */
    public void setBiens_garantie(int biens_garantie) {
        this.biens_garantie = biens_garantie;
    }

    /**
     * @return the biens_etat_lieux
     */
    public String getBiens_etat_lieux() {
        return biens_etat_lieux;
    }

    /**
     * @param biens_etat_lieux the biens_etat_lieux to set
     */
    public void setBiens_etat_lieux(String biens_etat_lieux) {
        this.biens_etat_lieux = biens_etat_lieux;
    }

    /**
     * @return the biens_pieces_sejou
     */
    public int getBiens_pieces_sejou() {
        return biens_pieces_sejou;
    }

    /**
     * @param biens_pieces_sejou the biens_pieces_sejou to set
     */
    public void setBiens_pieces_sejou(int biens_pieces_sejou) {
        this.biens_pieces_sejou = biens_pieces_sejou;
    }

    /**
     * @return the biens_pieces_chambres
     */
    public int getBiens_pieces_chambres() {
        return biens_pieces_chambres;
    }

    /**
     * @param biens_pieces_chambres the biens_pieces_chambres to set
     */
    public void setBiens_pieces_chambres(int biens_pieces_chambres) {
        this.biens_pieces_chambres = biens_pieces_chambres;
    }

    /**
     * @return the biens_pieces_salle_manger
     */
    public int getBiens_pieces_salle_manger() {
        return biens_pieces_salle_manger;
    }

    /**
     * @param biens_pieces_salle_manger the biens_pieces_salle_manger to set
     */
    public void setBiens_pieces_salle_manger(int biens_pieces_salle_manger) {
        this.biens_pieces_salle_manger = biens_pieces_salle_manger;
    }

    /**
     * @return the biens_pieces_salles_eau
     */
    public int getBiens_pieces_salles_eau() {
        return biens_pieces_salles_eau;
    }

    /**
     * @param biens_pieces_salles_eau the biens_pieces_salles_eau to set
     */
    public void setBiens_pieces_salles_eau(int biens_pieces_salles_eau) {
        this.biens_pieces_salles_eau = biens_pieces_salles_eau;
    }

    /**
     * @return the biens_pieces_salles_bain
     */
    public int getBiens_pieces_salles_bain() {
        return biens_pieces_salles_bain;
    }

    /**
     * @param biens_pieces_salles_bain the biens_pieces_salles_bain to set
     */
    public void setBiens_pieces_salles_bain(int biens_pieces_salles_bain) {
        this.biens_pieces_salles_bain = biens_pieces_salles_bain;
    }

    /**
     * @return the biens_pieces_bureau
     */
    public int getBiens_pieces_bureau() {
        return biens_pieces_bureau;
    }

    /**
     * @param biens_pieces_bureau the biens_pieces_bureau to set
     */
    public void setBiens_pieces_bureau(int biens_pieces_bureau) {
        this.biens_pieces_bureau = biens_pieces_bureau;
    }

    /**
     * @return the biens_pieces_cuisine
     */
    public int getBiens_pieces_cuisine() {
        return biens_pieces_cuisine;
    }

    /**
     * @param biens_pieces_cuisine the biens_pieces_cuisine to set
     */
    public void setBiens_pieces_cuisine(int biens_pieces_cuisine) {
        this.biens_pieces_cuisine = biens_pieces_cuisine;
    }

    /**
     * @return the biens_pieces_dependances
     */
    public int getBiens_pieces_dependances() {
        return biens_pieces_dependances;
    }

    /**
     * @param biens_pieces_dependances the biens_pieces_dependances to set
     */
    public void setBiens_pieces_dependances(int biens_pieces_dependances) {
        this.biens_pieces_dependances = biens_pieces_dependances;
    }

    /**
     * @return the biens_pieces_piscine
     */
    public int getBiens_pieces_piscine() {
        return biens_pieces_piscine;
    }

    /**
     * @param biens_pieces_piscine the biens_pieces_piscine to set
     */
    public void setBiens_pieces_piscine(int biens_pieces_piscine) {
        this.biens_pieces_piscine = biens_pieces_piscine;
    }

    /**
     * @return the biens_pieces_jardin
     */
    public int getBiens_pieces_jardin() {
        return biens_pieces_jardin;
    }

    /**
     * @param biens_pieces_jardin the biens_pieces_jardin to set
     */
    public void setBiens_pieces_jardin(int biens_pieces_jardin) {
        this.biens_pieces_jardin = biens_pieces_jardin;
    }

    /**
     * @return the hash_map_pieces
     */
    public Map<String, String> getHash_map_pieces() {
        return hash_map_pieces;
    }

    /**
     * @param hash_map_pieces the hash_map_pieces to set
     */
    public void setHash_map_pieces(Map<String, String> hash_map_pieces) {
        this.hash_map_pieces = hash_map_pieces;
    }

    /**
     * @return the hash_map_pieces1
     */
    public HashMap<String, String> getHash_map_pieces1() {
        return hash_map_pieces1;
    }

    /**
     * @param hash_map_pieces1 the hash_map_pieces1 to set
     */
    public void setHash_map_pieces1(HashMap<String, String> hash_map_pieces1) {
        this.hash_map_pieces1 = hash_map_pieces1;
    }

    /**
     * @return the biens_bailleurs_id
     */
    public int getBiens_bailleurs_id() {
        return biens_bailleurs_id;
    }

    /**
     * @param biens_bailleurs_id the biens_bailleurs_id to set
     */
    public void setBiens_bailleurs_id(int biens_bailleurs_id) {
        this.biens_bailleurs_id = biens_bailleurs_id;
    }
    
    
    
    
    
}
/*





*/