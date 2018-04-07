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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;


/**
 *
 * @author domenosojnik
 */

   

public class Studentski_servis {

    public static void main(String[] args) {
        
       Connection c = null;
       Statement stmt = null;
      
       try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://horton.elephantsql.com:5432/ictmrwye",
            "ictmrwye", "sdye_cJY9-xSgMK6Y8fhCCAHplX1jX8O");
         
          stmt = c.createStatement();
    String sql = "INSERT INTO kraji (ime, p_stevilka) VALUES ('Velenje', 3320)";
   
    stmt.executeUpdate(sql);
    stmt.close();
   
    c.close();
    
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
   }
        
       // Studentski_servis povezava = new Studentski_servis();
       // Studentski_servis.connect();
        
       // domaca_stran jf = new domaca_stran();
       // jf.setExtendedState(domaca_stran.MAXIMIZED_BOTH); 
       // jf.setVisible(true);
        
        
        
   

    }
    
