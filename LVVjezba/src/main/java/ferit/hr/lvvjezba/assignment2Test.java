/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lvvjezba;

import java.util.ArrayList;

/*
    2. Napravi interface Zivotinja koji ima metode: setIme, getIme i glasajSe. Kreirajte 2 klase: Ptica (implementira interface
    Zivotinja) i Lastavica (naslijeđuje klasu Ptica). Svaka klasa ima različitu implementaciju metode za “glasanje”. Napravite
    klasu Test i u njoj dva objekta: jedan objekt klase Ptica, drugi objekt klase Lastavica, postavite im ime, ispišite ime i
    pozovite metode “glasanja” za svaki od objekata

    3. Napravi niz od nekoliko objekata (od 2 do 5) i popuni ga sa objektima Ptice i Lastavice, napravi petlju koja prolazi kroz
    niz i sa svakim objektom niza pozove metode getIme i glasajSe.
 */

public class assignment2Test {

    public static void main(String[] args) {
        assignment2Bird bird = new assignment2Bird();
        bird.setName("Ashley");        
        assignment2Swallow swallow = new assignment2Swallow();
        swallow.setName("Jo");        
        System.out.print("\t- TASK 1 -\nHello, I am a bird named " + bird.getName() + " and I go ");
        bird.makeNoise();        
        System.out.print("Hello, I am a swallow named " + swallow.getName() + " and I go ");
        swallow.makeNoise();
        
        System.out.println("\n\t- TASK 2 -");
        ArrayList<assignment2Animal> taskList = populateList();        
        taskList.forEach(obj -> assignment2Test.printObjects(obj));
    }
    
    public static ArrayList<assignment2Animal> populateList() {
        ArrayList<assignment2Animal> list = new ArrayList<>();
        assignment2Bird bird1 = new assignment2Bird();
        assignment2Bird bird2 = new assignment2Bird();
        assignment2Bird bird3 = new assignment2Bird();
        assignment2Swallow swallow1 = new assignment2Swallow();
        assignment2Swallow swallow2 = new assignment2Swallow();        
        bird1.setName("Anne");
        bird2.setName("Marie");
        bird3.setName("Xena");
        swallow1.setName("Francesca");
        swallow2.setName("Taylor");        
        list.add(bird1);
        list.add(bird2);
        list.add(bird3);
        list.add(swallow1);
        list.add(swallow2);
        return list;
    }
    
    public static void printObjects(assignment2Animal obj) {
        System.out.print("Hello, I am " + obj.getName() + " and I go ");
        obj.makeNoise();
    }
    
}
