/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentski_servis;
import java.io.*;

import java.sql.Connection;   
import java.sql.DriverManager;   
import java.sql.SQLException;
import java.sql.*;


/**
 *
 * @author domenosojnik
 */

   

public class Studentski_servis {
    
   private static final String DRIVER = "org.postgresql.Driver";   
   private static final String URL = "jdbc:postgresql://horton.elephantsql.com:5432/ictmrwye";   
   private static final String USERNAME = "ictmrwye";   
   private static final String PASSWORD = "sdye_cJY9-xSgMK6Y8fhCCAHplX1jX8O";   
   
   private static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }  

    public static void main(String[] args) {
        // TODO code application logic here
        oglasi oglas_nov = new oglasi();
        oglas_nov.oglasi_vse("ime", "opis", 0);
        oglas_nov.izpisi();
        
        Studentski_servis povezava = new Studentski_servis();
        Studentski_servis.connect();
    }
    
}
