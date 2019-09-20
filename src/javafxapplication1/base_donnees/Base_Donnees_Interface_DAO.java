/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.base_donnees;

import java.sql.Connection;

/**
 *
 * @author freexx
 */
public interface Base_Donnees_Interface_DAO {
    public void setup()throws Exception;
    public void connect()throws Exception;
    public void close()throws Exception;
    
    public Connection connecter();
    public void deconncter (Connection connection);
}
