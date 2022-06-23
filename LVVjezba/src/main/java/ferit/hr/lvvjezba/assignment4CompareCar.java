/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lvvjezba;

public class assignment4CompareCar {
    
    public static void compare(assignment4TestCar firstCar, assignment4TestCar secondCar) {        
        double first = firstCar.getFuelUsage() / (firstCar.getDisTraveled() / 100);
        double second = secondCar.getFuelUsage() / (secondCar.getDisTraveled() / 100);
        if(first > second) {
            System.out.printf(secondCar.getName() + " je efikasniji. Potrosnja je %.2f l/100km.\n", second);
        } else if (first < second) {
            System.out.printf(firstCar.getName() + " je efikasniji. Potrosnja je %.2f l/100km.\n", first);
        } else {
            System.out.printf("Oba auta su jednako efikasna. Potrosnja je %.2f l/100km.\n", ((first + second) / 2));
        }
    }
    
}
