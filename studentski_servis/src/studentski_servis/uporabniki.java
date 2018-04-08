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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author domenosojnik
 */
public class uporabniki {
    
    private String ime;
    private String e_posta;
    private String geslo;
    private String l_rojstva;
    private String kraj;
    private int t_stevilka;
    
    public uporabniki()
    {
        
    }
    
    public String Prijava(String Ime, String Geslo)
    {
        
        Connection con;
        Statement stavek;
        ResultSet rezultati;
        String sql = "SELECT ime, geslo FROM uporabniki";
        
        
        
        baza povezava = new baza();
        con = povezava.getConnection();
        try {
            stavek = con.createStatement();
            rezultati = stavek.executeQuery(sql);
            
            while (rezultati.next()) {
            String imeKraja = rezultati.getString("ime");
            
            System.out.println(imeKraja);
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(prijavna_stran.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return null;
    }
    
}
