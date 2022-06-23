/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv2;

import static ferit.hr.lv2.Zaposlenik.CalucalteWithData;

/*
    3. BONUS: Napravi klasu “Test” u istom paketu. Kreirajte objekt tipa “Zarulja” i isprobajte rad. Kreirajte objekt tipa “Zaposlenik”
    i isprobajte rad obje metode za izračun place zaposlenika.
 */

public class Test {    
    
    public static void main(String[] args) {
        Zarulja Osram = new Zarulja();
        for(int i = 0; i < 10; i++) {
            Osram.PritisniPrekidac();
            Osram.Provjeri();
        }        
        System.out.println();
        Zaposlenik zap = new Zaposlenik(10, 32, 4673.22);
        zap.CaluclateWithNoData();
        CalucalteWithData(zap);
    }    
}
