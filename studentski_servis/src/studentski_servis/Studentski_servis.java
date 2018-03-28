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
public class Studentski_servis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        oglasi oglas_nov = new oglasi();
        oglas_nov.oglasi_vse("ime", "opis", 0);
        oglas_nov.izpisi();
        
    }
    
}
