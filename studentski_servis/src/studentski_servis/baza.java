/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentski_servis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author domenosojnik
 */


public class baza {
    
    private static String url = "jdbc:postgresql://horton.elephantsql.com:5432/ictmrwye";    
    private static String driverName = "org.postgresql.Driver";   
    private static String username = "ictmrwye";   
    private static String password = "sdye_cJY9-xSgMK6Y8fhCCAHplX1jX8O";
    private static Connection con;
    
   
    
    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return con;
    }
    
    
    
}