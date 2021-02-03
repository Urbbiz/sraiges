
package sraiges;

import java.util.ArrayList;
import java.util.List;

/*
Sraige sliauzia 100 cm
pamiega random 1-5
pasliauzia random 1-5 cm
10, 20, 30, .... cm spausdina "sraige1 nuslaiuze 11 cm"
sukam cikla

main yra 8 sraiges

 paleisti visas sraiges sliauzti
sulaukti kol baigs visos sraiges
*/

public class Sraiges {

    
    public static void main(String[] args) throws InterruptedException {
        
       ArrayList<String> rezultatuListas = new ArrayList();
        
     Sraige s1 = new Sraige("Alius",rezultatuListas);
     Sraige s2 = new Sraige("Taigis", rezultatuListas);
     Sraige s3 = new Sraige("Weipas", rezultatuListas);
     Sraige s4 = new Sraige("NaujasServeris",rezultatuListas);
     
     s1.start();
     s2.start();
     s3.start();
     s4.start();
   
     s1.join();
     s2.join();
     s3.join();
     s4.join();
     
     
     
        System.out.println("Rezultatu lentele------------------");
//     for (String i : rezultatuListas) {
//         System.out.println(i);
//     }
  for (int i = 0; i < Sraige.rezultatuListas1.size(); i++) {
//             int j = i + 1;
             System.out.println("Vieta: " + (i + 1) + " " + Sraige.rezultatuListas1.get(i));
        }
    }
    
}
