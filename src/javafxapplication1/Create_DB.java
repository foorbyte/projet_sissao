/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author freexx
 */
public class Create_DB {
    final static String DATABASE_URL = "jdbc:mysql://localhost/";
    static Connection connection = null;
    static Statement statement = null;
    
    public Connection getConnection() throws Exception{
		try {
			String url = "jdbc:mysql://localhost:3307";
			String user = "root";
			String pw = "ok";
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, user, pw);
			
                        return connection;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
                
	}
    // Creation des table dans le code java
    private static void createTable() throws SQLException {
        
    String sql_stmt = "CREATE TABLE IF NOT EXISTS preneurs (\n"
            + "    `preneurs_id` SMALLINT(5) UNSIGNED NOT NULL AUTO_INCREMENT,\n"
            + "    `preneurs_nom` VARCHAR(45) NOT NULL,\n"
            + "    `preneur_prenom` VARCHAR(45) NOT NULL,\n"
            + "    `email` VARCHAR(50) DEFAULT NULL,\n"
            + "    `active` TINYINT(1) NOT NULL DEFAULT '1',\n"
            + "    PRIMARY KEY (`preneurs_id`)\n"
            + ");";
    String useDatabaseQuery = "USE sissao1;";
    
    

    statement = connection.createStatement();

    statement.executeUpdate(sql_stmt);
    statement.executeLargeUpdate(useDatabaseQuery);

    System.out.println("La table has successfully been created");
}
    
    
    public static void Create_DB() {
         String sql_stmt = "CREATE DATABASE IF NOT EXISTS `sissao1`;";
    
        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql_stmt);
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    System.out.println("Base de donnee sissao1 has successfully been created");
    }
    
    
    
    
   public static void main(String[] args) {
        try {
            DriverManager.setLoginTimeout(23);
            connection = DriverManager.getConnection(DATABASE_URL, "root", "ok");

            Create_DB();
            Create_DB.createTable();
            
        } catch (SQLException ex) {
            System.out.println("The following exception has occured: " + ex.getMessage());
        } finally {

            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                System.out.println("The following exception has occured: " + ex.getMessage());
            }
        }
    }

}

