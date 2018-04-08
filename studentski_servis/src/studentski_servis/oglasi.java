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
   
   String regija;
   String kontakt;
  
   
   public void oglasi()
   {
       ime = "Neznano";
       opis = "Neznan"; 
       stevilka = 0;
       prosta_mesta = 0;
       bruto_placa = 0;
       neto_placa = 0;
       trajanje = 0; 
   }

   public void izpisi ()
   {
       
       System.out.println("Ime:"+ ime );
       System.out.println("Opis:"+ opis );
       System.out.println("Stevilka:"+ stevilka );
       
   }
   
   public String dodaja_oglasa ()
   {
       return null;
   }
   
   public void izbris_oglasa ()
   {
   }
   
   
   
    
}
