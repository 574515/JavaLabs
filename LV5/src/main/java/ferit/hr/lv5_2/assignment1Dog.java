/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv5_2;

import ferit.hr.lv5.assignment1Mammal;

public class assignment1Dog extends assignment1Mammal {
    private String breed;
    
    public assignment1Dog(int age, double weight) {
        super(age, weight);
    }
    
    public assignment1Dog(int age, double weight, String breed) {
        super(age, weight);
        this.breed = breed;
    }
    
    public void describeMe() {
        System.out.println("Tezina: " + super.getWeight() + "\nStarost: " + super.getAge() + 
                "\nVrsta: pas" + "\nPasmina: " + getBreed() + "\n");
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
