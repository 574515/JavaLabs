/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv6_a2;

public class assignment2Manager extends assignment2Worker {

    public assignment2Manager(String ID, String firstName, String lastName) {
        super(ID, firstName, lastName);
    }
    
    @Override
    public void work() {
        System.out.println("Odlucujem!");
    }
    
    /*@Override
    public void introduce() {
        super.introduce();
        System.out.println(this.getClass().getSimpleName());
    }*/
}
