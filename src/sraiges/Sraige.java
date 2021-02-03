package sraiges;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sraige extends Thread {
    static ArrayList<String> rezultatuListas1 = new ArrayList();
    
    ArrayList rezultatuListas;
    public String vardas;
    public int nueitasKelias;
    public final int finisas = 100;

    public Sraige(String vardas, ArrayList<String> rezultatuListas) {
        this.vardas = vardas;
        this.rezultatuListas = rezultatuListas;
    }

    public void run() {
        Date d = new Date();
        System.out.println(this.vardas + " "+ d.getTime());
        
        do {
            int ejimas = new Random().nextInt(5) + 1;
            nueitasKelias += ejimas;
            if (this.nueitasKelias < finisas) {
                System.out.println(nueitasKelias + " " + vardas);
            } else {
                
                System.out.println("Finisas" + finisas + this.vardas);
                
                long skirtumas = new Date().getTime() - d.getTime();
                
               
                
                synchronized(rezultatuListas1){
             rezultatuListas1.add(this.vardas +" " + skirtumas); 
            }
            }
            
           

            try {
                Thread.sleep(new Random().nextInt(5) + 1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sraige.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (nueitasKelias < finisas);

    }
}
