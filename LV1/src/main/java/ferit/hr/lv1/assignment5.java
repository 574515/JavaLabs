/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv1;

import javax.swing.JOptionPane;

/*
5. Napisite program koji uzima dva broja (korisnik unosi) i ispisuje njihov umnozak na ekran.
    Testni podaci:
        Unesite prvi broj: 25
        Unesite drugi broj: 5
    Ocekivani izlaz:
        25 x 5 = 125
 */

public class assignment5 {

    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
    }
    
}
