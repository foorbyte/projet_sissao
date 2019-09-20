/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import metiers_com.Categories;
import metiers_com.Produits;

/**
 *
 * @author freexx
 */
public interface Interfaces_metiers {
    public void ajout_categories(Categories categories);
    public void ajout_produits(Produits produits, int ref_id_cat);
    public List<Produits> avoirProduits_parMC(String mc);
    public List<Categories> avoir_all_Categorieses();
    public List<Categories> avoir_Categorieses(int cat_id);
    
     public void avoire_produits(Produits produits);
    
}
