/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2_uloha2;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Eduardo Martinez
 */
public class C2_Uloha2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        existingKey(Long.valueOf(1));
    }
    
    private static boolean existingKey(Long key){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("C2_Uloha2PU");
        EntityManager em = emf.createEntityManager();
        
        OsobaU1 osoba = (OsobaU1) em.find(OsobaU1.class, key);
        if (osoba == null) {
            System.out.println("Osoba s takýmto kľučom nie je v tabuľke.");
            return false;
        } else {
            System.out.println("Meno: " + osoba.getMeno());
            System.out.println("Narodeny/a: " + osoba.getNarodena());
            System.out.println("Vyska: " + osoba.getVyska());
            System.out.println("Vaha: " + osoba.getVaha());
            return true;
        }
    }
    
}
