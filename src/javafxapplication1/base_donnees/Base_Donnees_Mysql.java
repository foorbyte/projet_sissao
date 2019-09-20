/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.base_donnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author freexx
 */
public class Base_Donnees_Mysql implements Base_Donnees_Interface_DAO{

    @Override
    public void setup() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void connect() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Connection connecter() {
        //Connection connection = null;
        try {
                        String url = "jdbc:mysql://localhost:3306/sissao1?zeroDateTimeBehavior=convertToNull";
			//String url = "jdbc:mysql://localhost:3306/sissao1";
			String user = "root";
			String pw = "ok";
                        Class.forName("com.mysql.cj.jdbc.Driver");
			//Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, user, pw);
			         System.out.println("ok 1");
                        return connection;
		} catch (Exception e) {
			System.out.println(e);
                        System.out.println("(NO)");
                        return null;
		}
        
		//return connection;
    }

    @Override
    public void deconncter(Connection connection) {
       

            try {
                if (connection != null) {
                    connection.close();
                }
               // if (statement != null) {
                 //   statement.close();
               // }
            } 
            catch (SQLException ex) {
                System.out.println("The following exception has occured: " + ex.getMessage());
            }
        }
    }
    

