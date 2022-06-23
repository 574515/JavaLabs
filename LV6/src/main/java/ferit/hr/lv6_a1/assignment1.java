/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv6_a1;

/*
    1) Napiši klasu Zivotinja koja ima protected String parametar vrsta i metodu kreciSe koja ispisuje “zivotinja se krece”.
    Klase Konj, Riba i Ptica naslijeđuju klasu Zivotinja i svaka u konstruktoru postavlja parametar vrsta klase Zivotinja na
    svoju vrstu. Također, svaka klasa override-a metodu kreciSe sa svojom specifičnom porukom (npr. “trcim”, “plivam”, “letim”).
    U main metodi klase Test napraviti objekte svih klasa i isprobati metode kretanja.
    -> BONUS: napraviti niz od 4 elementa i napuniti ga sa jednim objektom svake od gore navedenih klasa. Napraviti petlju
    koja će proći kroz niz i pokrenuti metodu kreciSe na svakom od objekata niza.
 */

public class assignment1 {
    
    public static void main(String[] args) {
        /*assignment1Animal animal = new assignment1Animal();
        animal.move();
        assignment1Bird bird = new assignment1Bird();
        bird.move();
        assignment1Fish fish = new assignment1Fish();
        fish.move();
        assignment1Horse horse = new assignment1Horse();
        horse.move();
        
        assignment1Animal[] animals = new assignment1Animal[4];
        animals[0] = animal;
        animals[1] = bird;
        animals[2] = fish;
        animals[3] = horse;
        for(int i = 0; i < 4; i ++) {
            animals[i].move();
        }*/
        assignment1Bird bird = new assignment1Bird();
        bird.move();
        assignment1Fish fish = new assignment1Fish();
        fish.move();
        assignment1Horse horse = new assignment1Horse();
        horse.move();
        horse.works();
    }
    
}
