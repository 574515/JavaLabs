/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv3;

import java.util.Random;
import javax.swing.JOptionPane;

/*
    1. Napisati program koji će imati sljedeće mogućnosti odabira (koristiti switch):
        (1) Izračunati aritmetičku sredinu sporedne dijagonale.
        (2) Izračunati sumu neparnih elemenata prvog retka i prvog stupca matrice. Ukoliko ne postoje neparni elementi ispisati da nije bilo moguće izračunati sumu.
        (3) Ispisati sve brojeve na parnim indeksima vektora V (koristiti continue).
    Program na početku treba od korisnika zatražiti unos maksimalnog broja elemenata (n) vektora V kao i dimenzije kvadratne matrice (mxm).
    Koristeći do-while petlju ograničiti unos broja elemenata (n) na interval između 2 i 10, a za kvadratnu matricu broj (m) ograničiti na
    interval između 1 i 5. Unos se mora ponavljati sve dok nije unesen broj u traženom intervalu. Koristiti try-catch blokove za zaštitu od
    grešaka kao što je npr. unos znaka na mjesto unošenja dimenzija vektora i matrice.
*/

public class assignment1 {

    public static void main(String[] args) {
        int choice = 0, n = 0, m = 0;
        do {
            try {
                n = Integer.parseInt(JOptionPane.showInputDialog("Unesite m [2, 10]"));
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Mora biti broj u intervalu [2, 10].");
            }
        } while(n < 2 || n > 10);        
        do {
            try {
                m = Integer.parseInt(JOptionPane.showInputDialog("Unesite m [1, 5]"));
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Mora biti broj u intervalu [1, 5].");
            }
        } while(m < 1 || m > 5);          
        
        int[] vector = new int[n];
        int[][] matrix = new int[m][m];        
        GenerateVectorValues(vector, n, 0, 100);
        GenerateMatrixValues(matrix, m, 0, 100);    
        
        while(true) {
            do {
                System.out.println("[1] Izracunati aritmeticku sredinu sporedne dijagonale.");
                System.out.println("[2] Izracunati sumu neparnih elemenata prvog retka i prvog stupca matrice");
                System.out.println("[3] Ispisati sve brojeve na parnim indeksima vektora V");
                System.out.println("[4] Izlaz");
                try {
                    choice = Integer.parseInt(JOptionPane.showInputDialog("Odabir [1, 4]"));
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("Mora biti broj u intervalu [1, 4].");
                }
            } while(choice < 1 || choice > 4);
            switch(choice) {
                case 1 -> ArithmeticAverage(matrix, m);
                case 2 -> OddElementsOfMatrix(matrix, m);
                case 3 -> EvenVectorIndexPrint(vector, n);
                case 4 -> System.exit(0);
            }
        }
    }
    
    public static void GenerateVectorValues(int[] vector, int n, int min, int max) {
        Random rnd = new Random();
        for(int i = 0; i < n; i++) vector[i] = rnd.nextInt(max - min) + min;
    }
    
    public static void GenerateMatrixValues(int[][] matrix, int m, int min, int max) {
        Random rnd = new Random();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) matrix[i][j] = rnd.nextInt(max - min) + min;
        }
    }
    
    public static void ArithmeticAverage(int[][] matrix, int m) {
        float avg = 0.0f;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) if((i + j) == (m - 1)) avg += matrix[i][j];
        }
        System.out.println("\nAritmeticka sredina sporedne dijagonale je " + (avg / m) + ".\n");
    }
    
    public static void OddElementsOfMatrix(int[][] matrix, int m) {
        int i, sum = 0;
        for(i = 0; i < m; i++) if((matrix[0][i] % 2) != 0) sum += matrix[0][i];
        for(i = 0; i < m; i++) if((matrix[i][0] % 2) != 0) sum += matrix[i][0];
        System.out.println("\nSuma neparnih brojeva prvog retka i prvog stupca je " + sum + ".\n");
    }
    
    public static void EvenVectorIndexPrint(int[] vector, int n) {
        System.out.print("\nVrijednosti na parnim indexima vektora su: [ ");
        for(int i = 0; i < n; i++) if((i % 2) == 0) System.out.print(vector[i] + " ");
        System.out.println("].\n");            
    }    
}
