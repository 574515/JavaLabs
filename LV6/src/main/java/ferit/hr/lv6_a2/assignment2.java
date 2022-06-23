/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv6_a2;

/*
    2) Napiši klasu Zaposlenik, Direktor, Tajnica i Vozac. Klasa Zaposlenik je apstraktna i sadrži private String parametre: ID, ime i
    prezime. Sadrži metode za postavljanje i dohvacanje tih parametara (get/set metode) i metode predstaviSe i radi. Metoda predstaviSe
    ispisuje podatke o zaposleniku (ime i prezime i ID). Metoda radi nema implementaciju, prazna je. Klasa Direktor, Tajnica i Vozac
    naslijeđuju klasu Zaposlenik i imaju metodu radi u kojoj opisuju način na koji rade (npr. “Odlucujem”, “Dogovaram, “Vozim” ili nešto
    slično). Klasa Direktor nadilazi (override-a) metodu predstaviSe na način da poziva originalnu metodu klase Zaposlenik (ključna riječ
    super) i u novom retku ispisuje svoj tip objekta (koristeći metodu getSimpleName() klase Class). U main metodi klase Test napraviti
    sve objekte i isprobati metode.
    -> BONUS: Modificiraj metodu predstaviSe klase Zaposlenik tako da prima objekt bilo kojeg tipa od klasa koje ju naslijedjuju (Direktor,
    Tajnica ili Vozac) i onda ispisuje tip tog objekta (koristeći metodu getSimpleName() klase Class), slično kao što je to radila metoda
    predstaviSe u klasi Direktor.
 */

public class assignment2 {
    
    public static void main(String[] args) {
        assignment2Manager manager = new assignment2Manager("001", "Ivan", "Horvat");
        manager.introduce(manager);
        manager.work();
        System.out.println();
        assignment2Secretary secretary = new assignment2Secretary("002", "Ana", "Maric");
        secretary.introduce(secretary);
        secretary.work();
        System.out.println();
        assignment2Driver driver = new assignment2Driver("003", "Pavao", "Brzic");
        driver.introduce(driver);
        driver.work();
    }
    
}
