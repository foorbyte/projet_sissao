/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metiers_com;

import metiers_com.Produits;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.exolab.castor.xml.Serializer;

/**
 *
 * @author freexx
 */
public class Categories implements Serializable{
    private int categories_id;
    public String Categories_nom;
    private List<Produits> produits = new ArrayList<Produits>();

    //Accessor for name
   public String name()
   {
     return Categories_nom;
   }
   
    
    public Categories() {
    }
    
  public Categories(String s){
      Categories_nom = s;
  }
    /**
     * @return the categories_id
     */
    public int getCategories_id() {
        return categories_id;
    }

    /**
     * @param categories_id the categories_id to set
     */
    public void setCategories_id(int categories_id) {
        this.categories_id = categories_id;
    }

    /**
     * @return the Categories_nom
     */
    public String getCategories_nom() {
        return Categories_nom;
    }

    /**
     * @param Categories_nom the Categories_nom to set
     */
    public void setCategories_nom(String Categories_nom) {
        this.Categories_nom = Categories_nom;
    }

    /**
     * @return the produits
     */
    public List<Produits> getProduits() {
        return produits;
    }

    /**
     * @param produits the produits to set
     */
    public void setProduits(List<Produits> produits) {
        this.produits = produits;
    }
    
}
