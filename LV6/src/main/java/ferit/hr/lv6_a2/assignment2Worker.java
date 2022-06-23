/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv6_a2;

public class assignment2Worker {
    private String ID, firstName, lastName;
    
    public assignment2Worker(String ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void introduce(assignment2Worker obj) {
        System.out.println("ID: " + obj.ID + "\nIme: " + obj.firstName + "\nPrezime: " + obj.lastName + 
                "\nObjekt: " + obj.getClass().getSimpleName());
    }
    
    public void work() {}
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
