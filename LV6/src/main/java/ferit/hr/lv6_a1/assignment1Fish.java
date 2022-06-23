/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv6_a1;

public class assignment1Fish extends assignment1Animal {
    public assignment1Fish() {
        super.breed = "Riba";
    }
    
    @Override
    public void move() {
        System.out.println(this.breed + " pliva.");
    }
}
