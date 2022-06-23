/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv7;

/**
 *
 * @author User
 */
public class assignment1RocketThread extends Thread {
    
    String name;
    assignment1LaunchPad pad;
    
    public assignment1RocketThread(String name, assignment1LaunchPad launchPad) {
        this.name = name;
        this.pad = launchPad;
    }
    
    @Override
    public void run() {
        System.out.println("Raketa " + this.name + " zapocinje lansiranje.");
        this.pad.launch();
        System.out.println("Raketa " + this.name + " je poletjela.");
    }    
}
