/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lvvjezba;

/*
    4. Napisati klasu TestAutomobila koja ima privatne članove naziv, postrosioGoriva i prijedjenPut. Napisati
    klasu UsporedbaPotrosnje koja u sebi sadrži static metodu usporedi koja prima dva objekta klase TestAutomobila,
    računa i ispisuje prosječnu potrošnju svakog te koji je automobil štedljiviji.
 */

public class assignment4TestCar {
    
    private String name;
    private double fuelUsage, disTraveled;

    public assignment4TestCar(String name, double distance, double fuel) {
        this.name = name;
        this.fuelUsage = fuel;
        this.disTraveled = distance;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public double getDisTraveled() {
        return disTraveled;
    }

    public void setDisTraveled(double disTraveled) {
        this.disTraveled = disTraveled;
    }  
    
}
