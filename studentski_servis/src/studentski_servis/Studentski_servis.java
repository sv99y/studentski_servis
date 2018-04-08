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
        
         prijavna_stran jf = new prijavna_stran();
       jf.setExtendedState(prijavna_stran.MAXIMIZED_BOTH); 
       jf.setVisible(true);
       
       
}
}
        
       // Studentski_servis povezava = new Studentski_servis();
       // Studentski_servis.connect();
        