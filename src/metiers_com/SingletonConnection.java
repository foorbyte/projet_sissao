/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metiers_com;

import java.sql.*;

/**
 *
 * @author freexx
 */
public class SingletonConnection {
    private static Connection connectio;
    static {
        try{
             String url = "jdbc:mysql://localhost:3306/sissao1?zeroDateTimeBehavior=convertToNull";

            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            connectio = DriverManager.getConnection
       // ("jdbc:mysql://localhost3306/sissao1","root","ok");
             (url,"root","ok");
            
            System.err.println("Tentative de connexion");
            
        }catch(Exception exception){
            exception.printStackTrace();
        }
        
    }
    public static Connection getConnection(){
            return connectio;
        }
}
