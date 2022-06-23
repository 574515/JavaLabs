/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv7;

public class assignment1Test {
    
    public static void main(String[] args) {
        new assignment1RocketThread("Atlas-Agena", new assignment1LaunchPad()).start();
        new assignment1RocketThread("Thor-Ablestar", new assignment1LaunchPad()).start();
        new assignment1RocketThread("Atlas LV-3B", new assignment1LaunchPad()).start();
        
        new assignment1RocketRunnable("Rehbar-I", new assignment1LaunchPad()).run();
        new assignment1RocketRunnable("SM-65E Atlas", new assignment1LaunchPad()).run();
        new assignment1RocketRunnable("Thor-Delta", new assignment1LaunchPad()).run();
    }
    
}
