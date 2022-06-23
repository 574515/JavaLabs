/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv1;

import javax.swing.JOptionPane;

/*
6. Napisite program koji uzima dva broja (korisnik unosi) te ispisuje na ekran njihovu sumu, razliku, umnozak, rezultat dijeljenja i ostatak pri dijeljenju.
    Testni podaci:
        Input first number: 125
        Input second number: 24
    Ocekivani izlaz:
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
 */

public class assignment6 {

    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
    }
    
}
