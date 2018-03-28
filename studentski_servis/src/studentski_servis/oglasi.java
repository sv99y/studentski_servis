/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentski_servis;
import java.io.*;


/**
 *
 * @author domenosojnik
 */
public class oglasi {
    
 
   String ime;
   int stevilka;
   String opis;
   int prosta_mesta;
   int bruto_placa;
   int neto_placa;
   int trajanje;
   boolean aktivnost; 
   String regija;
   String kontakt;
  
   
   public void oglasi()
   {
       ime = "Neznano";
       opis = "Neznan"; 
   }
   
   public void oglasi_ime (String Ime)
   {
       ime = Ime;
       opis = "Neznan";
   }
   
   public void oglasi_ime_opis (String Ime, String Opis)
   {
       ime = Ime;
       opis = Opis;
   }
   
   public void oglasi_vse (String Ime, String Opis, int Stevilka)
   {
       ime = Ime;
       opis = Opis;
       stevilka = Stevilka;
   }
   
   public void izpisi ()
   {
       
       System.out.println("Ime:"+ ime );
       System.out.println("Opis:"+ opis );
       System.out.println("Stevilka:"+ stevilka );
       
   }
   
   public void dodaja_oglasa ()
   {
   }
   
   public void izbris_oglasa ()
   {
   }
   
   public void aktivnost_oglasa (boolean aktivnost)
   {
       this.aktivnost = aktivnost;
   }
   
   
   
    
}
