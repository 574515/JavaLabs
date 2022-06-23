/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lvvjezba;

public class assignment4Test {
    
    public static void main(String[] args) {        
        assignment4TestCar car1 = new assignment4TestCar("Mustang", 416, 39);
        assignment4TestCar car2 = new assignment4TestCar("Mercedes", 351, 36);
        assignment4TestCar car3 = new assignment4TestCar("Volkswagen", 412, 32);
        assignment4TestCar car4 = new assignment4TestCar("Honda", 571, 40);
        assignment4TestCar car5 = new assignment4TestCar("Audi", 300, 24);
        assignment4TestCar car6 = new assignment4TestCar("BMW", 300, 24);
        assignment4CompareCar.compare(car1, car2);
        assignment4CompareCar.compare(car3, car4);
        assignment4CompareCar.compare(car5, car6);
    }
}
