/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv2;

/*
    2. Napiši klasu „Zaposlenik“ koja ima privatne podatkovne članove „staz“, „starost“ i „placa“. Napiši konstruktor koji inicijalizira
    podatkovne članove prilikom stvaranja objekta. Napiši pristupne metode kojima se mogu promijeniti podatkovni članovi kao i metode
    kojima se može dobiti njihova vrijednost. Napiši 2 metode koje računaju koliko je do sada zaradio zaposlenik. Jedna metoda ne prima
    nikakav parametar pri pozivu nego računa sa podacima objekta koji ju poziva, a druga metoda je statična i prima referencu na objekt
    klase Zaposlenik za koji onda radi izračun. Obje metode računaju koliko je zaposlenik ukupno zaradio za vrijeme rada (mjeseci broj
    godina staža mjesečna plaća).
 */

public class Zaposlenik {
    
    private int staz, starost;
    private double placa;
    
    public Zaposlenik(int staz, int starost, double placa) {
        this.staz = staz;
        this.starost = starost;
        this.placa = placa;
    }
    
    public void CaluclateWithNoData() {
        System.out.println("Zaposlenik je za " + this.staz + " godina staza zaradio " + (this.staz * 12) * this.placa + " kn.");
    }
    
    public static void CalucalteWithData(Zaposlenik zap) {
        System.out.println("Zaposlenik je za " + zap.staz + " godina staza zaradio " + (zap.staz * 12) * zap.placa + " kn.");
    }

    public int getStaz() { return staz; }

    public void setStaz(int staz) { this.staz = staz; }

    public int getStarost() { return starost; }

    public void setStarost(int starost) { this.starost = starost; }

    public double getPlaca() { return placa; }

    public void setPlaca(double placa) { this.placa = placa; }
        
}
