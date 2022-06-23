/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv2;

/*
    1. Napiši klasu „Zarulja“ koja ima jedan privatni član bool tipa: „Stanje“, defaultni konstruktor koji postavlja stanje u FALSE te
    javne metode „PritisniPrekidac“ koji će paliti i gasiti žarulju i „Provjeri“ koja će ispisivati „Svijetli“ ili „Mrak je“ ovisno o
    trenutnom stanju (0 – mrak, 1 - svijetli). Kreiraj objekt „Osram“ klase „Zarulja“ te upali i ugasi žarulju nekoliko puta.
 */

public class Zarulja {
 
    private boolean Stanje;

    public Zarulja() { this.Stanje = false; }
    
    public void PritisniPrekidac() { this.Stanje = !this.Stanje; }
    
    public void Provjeri() { System.out.println(!this.Stanje ? "Mrak je" : "Svijetli"); }
    
}
