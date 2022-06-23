/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv6_a1;

public class assignment1Horse extends assignment1Animal implements assignment1Working {
    public assignment1Horse() {
        super.breed = "Konj";
    }
    
    @Override
    public void move() {
        System.out.println(this.breed + " trci.");
    }

    @Override
    public void works() {
        System.out.println(this.breed + " radi / tegli.");
    }
}
