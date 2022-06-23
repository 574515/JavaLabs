/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/*
    2. Implementirati klasu koja predstavlja studenta (maticni broj, ime, prezime, fakultet, smjer, godina,prosjecna_ocjena).
    Kroz petlju unijeti podatke za 10 studenata, zatim učitati te podatke u datoteku te nakon toga učitati te iste podatke i
    izračunati prosjek ocjena za sve studente. Koristiti serijalizaciju.
 */

public class assignment2 {

    private final static int N = 5;
    private static ObjectOutputStream output;
    private static ObjectInputStream input;

    public static void main(String[] args) throws IOException {
        assignment2 test = new assignment2();
        
        test.openOutputFile(".\\students.ser");
        test.addStudents(N);
        test.closeOutputFile();
        
        test.openInputFile(".\\students.ser");
        System.out.println("Prosjek [" + (test.getAverage(N) / N) + "].\n");
        test.closeInputFile();
    }
    
    public void openOutputFile(String path) {
        try {
            output = new ObjectOutputStream(new FileOutputStream(path));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void openInputFile(String path) {
        try {
            input = new ObjectInputStream(new FileInputStream(path));
        } catch (IOException ioex) {
            throw new RuntimeException(ioex);
        }
    }

    public void addStudents(int n) {
        for(int i = 0; i < n; i++) {
            assignment2Student record;
            String sn = JOptionPane.showInputDialog("Unesite maticni broj");
            String firstName = JOptionPane.showInputDialog("Unesite ime");
            String lastName = JOptionPane.showInputDialog("Unesite prezime");
            String college = JOptionPane.showInputDialog("Unesite fakultet");
            String course = JOptionPane.showInputDialog("Unesite smjer");
            int year = Integer.parseInt(JOptionPane.showInputDialog("Unesite godinu"));
            double avgGrade = Double.parseDouble(JOptionPane.showInputDialog("Unesite prosjek"));
            record = new assignment2Student(sn, firstName, lastName, college, course, year, avgGrade);
            try {
                output.writeObject(record);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    public double getAverage(int n) {
        double avg = 0.0;
        for(int i = 0; i < n; i++) {
            assignment2Student record;
            try {
                record = (assignment2Student) input.readObject();
            } catch (IOException | ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            avg += record.getAvgGrade();
        }        
        return avg;
    }
    
    public void closeOutputFile() {
        if (output != null) try {
            output.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void closeInputFile() {
        if (input != null) try {
            input.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}