/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentski_servis;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


/**
 *
 * @author domenosojnik
 */
public class oglasi {
    
   
   int sifra;
   String opis;
   int prosta_mesta;
   float bruto_placa;
   float neto_placa;
   String trajanje;
   String kraj;
   String kontakt;
   String kategorija;
   boolean aktivnost;
   
   public oglasi()
   {
       
       opis = "Neznan"; 
       sifra = 0;
       prosta_mesta = 0;
       bruto_placa = 0;
       neto_placa = 0;
       trajanje = "Po dogovoru"; 
       kategorija = "Neznana";
       kraj = "Neznan";
       kontakt = "Neznan";
   }
   
   public oglasi(String Opis, int Sifra, int Prosta_mesta, float Bruto_placa, float Neto_placa, String Trajanje, String Kategorija, String Kraj, String Kontakt, boolean Aktivnost)
   {
       
       opis = Opis; 
       sifra = Sifra;
       prosta_mesta = Prosta_mesta;
       bruto_placa = Bruto_placa;
       neto_placa = Neto_placa;
       trajanje = Trajanje;
       kategorija = Kategorija;
       kraj = Kraj;
       kontakt = Kontakt;
       aktivnost = Aktivnost;
       
       
   }
   
   @Override
   public String toString()
   {
       return "Šifra: " + sifra +" Prosta mesta: " + prosta_mesta + " Bruto: " + bruto_placa + " EUR Neto: " + neto_placa + " EUR Trajanje: " + trajanje + " Kraj: " + kraj + "";
   }
   
   public String admintoString()
   {
       return "Šifra: " + sifra +" Prosta mesta: " + prosta_mesta + " Bruto: " + bruto_placa + " EUR Neto: " + neto_placa + " EUR Trajanje: " + trajanje + " Kraj: " + kraj + " Aktivnost: " + aktivnost + "";
   }
   
   public String usertoString()
   {
       return "Šifra: " + sifra +" Prosta mesta: " + prosta_mesta + " Bruto: " + bruto_placa + " EUR Neto: " + neto_placa + " EUR Trajanje: " + trajanje + "";
   }
   
    
}
