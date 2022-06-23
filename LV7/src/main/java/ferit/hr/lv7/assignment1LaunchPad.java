/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv7;

/*
    1) NapisaN Java klasu LansirnaRampa koja ima metodu lansiraj koja odbrojava od 10 do 0 i ispisuje brojac. NapisaN Java klasu
    Raketa koja naslijedjuje klasu Thread i ima 2 parametra (objekta klase): String parametar ime i parametar LansirnaRampa. U
    parametarskom konstruktoru se postavi ime i LansirnaRampa, a u run metodi ispise ime rakete i najavi pocetak lansiranje te
    pokrene lansiranje (lansiraj metoda objekta LansirnaRampa). Nakon sto metoda za lansiranje zavrsi - ispise ime rakete i poruku
    o polijetanju.NapisaN Java klasu Test koja kreira nekoliko raketa i pokrece ih paralelno. Pokrenite program vise puta i promotrite
    kako se rakete / niN kreiraju (redoslijed), kako izvrsavaju i kako zavrsavaju.
 */

public class assignment1LaunchPad {

    public synchronized void launch() {           
        for(int i = 10; i >= 0; i--) System.out.println(i);
    }
}
