/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv6_a1;

public abstract class assignment1Animal {
    protected String breed;
    
    public assignment1Animal() {
        this.breed = "Zivotinja";
    }
    
    public void move() {
        System.out.println(this.breed + " se krece.");
    }
}
