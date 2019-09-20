/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metiers_com;

import java.io.Serializable;

/**
 *
 * @author freexx
 */
public class Produits implements Serializable{
    private int produits_id;
    private String produits_ref;
    private String produits_nom;
    private Double produits_prix;
    private int produits_quantitie;
    private Categories categories;

    public Produits() {
    }

    
    /**
     * @return the produits_id
     */
    public int getProduits_id() {
        return produits_id;
    }

    /**
     * @param produits_id the produits_id to set
     */
    public void setProduits_id(int produits_id) {
        this.produits_id = produits_id;
    }

    /**
     * @return the produits_ref
     */
    public String getProduits_ref() {
        return produits_ref;
    }

    /**
     * @param produits_ref the produits_ref to set
     */
    public void setProduits_ref(String produits_ref) {
        this.produits_ref = produits_ref;
    }

    /**
     * @return the produits_nom
     */
    public String getProduits_nom() {
        return produits_nom;
    }

    /**
     * @param produits_nom the produits_nom to set
     */
    public void setProduits_nom(String produits_nom) {
        this.produits_nom = produits_nom;
    }

    /**
     * @return the produits_prix
     */
    public Double getProduits_prix() {
        return produits_prix;
    }

    /**
     * @param produits_prix the produits_prix to set
     */
    public void setProduits_prix(Double produits_prix) {
        this.produits_prix = produits_prix;
    }

    /**
     * @return the produits_quantitie
     */
    public int getProduits_quantitie() {
        return produits_quantitie;
    }

    /**
     * @param produits_quantitie the produits_quantitie to set
     */
    public void setProduits_quantitie(int produits_quantitie) {
        this.produits_quantitie = produits_quantitie;
    }

    /**
     * @return the categories
     */
    public Categories getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(Categories categories) {
        this.categories = categories;
    }
    
    
}
