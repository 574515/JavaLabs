/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lvvjezba;

public class assignment2Bird implements assignment2Animal {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }   

    @Override
    public void makeNoise() {
        System.out.println("chirp-chirp.");
    }
    
}
