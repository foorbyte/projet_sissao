/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.base_donnees;

import java.sql.Connection;
import java.util.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author freexx
 */
public interface Base_Donnees_Interfaces_crud <T> {
      public boolean ajout(T o);
    public boolean modifier(T o);
    public boolean supprimer(T o);
        public ObservableList lister ();
}
