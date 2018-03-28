/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentski_servis;

/**
 *
 * @author domenosojnik
 */
public class oglasi {
    
   String ime;
   int stevilka;
   String opis;
   
   public void oglasi()
   {
       ime = "Neznano";
       opis = "Neznan"; 
   }
   
   public void oglasi (String Ime)
   {
       ime = Ime;
       this.opis = "Neznan";
   }
   
   public void oglasi (String Ime, String Opis)
   {
       this.ime = Ime;
       this.opis = Opis;
   }
   
   public void oglasi (String Ime, String Opis, int Stevilka)
   {
       this.ime = Ime;
       this.opis = Opis;
       this.stevilka = Stevilka;
   }
   
    
}
