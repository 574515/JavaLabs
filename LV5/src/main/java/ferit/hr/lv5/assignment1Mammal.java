/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv5;

/*
    1) Napravi klasu Sisavac sa dva privatna parametra: dob i tezina. Klasa treba imati konstruktor koji postavlja ova parametra na
    0 i metode za dohvatiti i postaviti parametre (tzv. gettere i settere). Treba napraviti klase Pas i Macka koje obje naslijedjuju
    klasu Sisavac i imaju jos dodatni privatni parametar: vrsta u koji se zapisuje pasmina psa ili macke. Obje klase imaju metode za
    postaviti i dohvatiti vrstu, a imaju i metodu za opisivanje koja ispisuje koliko je teska, koliko je stara, koje je vrste i koje
    je pasmine. Napravite klasu Test, kreirajte objekte sisavca, psa i macke, postavite im parametre i pozovite metode za opis psa i macke.
 */

public class assignment1Mammal {
    protected int age;
    protected double weight;
    
    protected assignment1Mammal() {
        this.age = 0;
        this.weight = 0.0;
    }
    
    protected assignment1Mammal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }
    
    protected int getAge() {
        return age;
    }
    
    protected void setAge(int age) {
        this.age = age;
    }

    protected double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }
}
