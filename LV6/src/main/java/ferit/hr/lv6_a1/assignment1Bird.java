/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv6_a1;

public class assignment1Bird extends assignment1Animal {
    public assignment1Bird() {
        super.breed = "Ptica";
    }
    
    @Override
    public void move() {
        System.out.println(this.breed + " leti.");
    }
}
