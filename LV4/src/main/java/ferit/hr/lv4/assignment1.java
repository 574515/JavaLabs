/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv4;

import java.io.File;
import java.io.IOException;

/*
    1. Napisati program koji će ispisivati hijerarhiju sistemskog diska (ispisati dodatne informacije kao što su “direktorij”, “datoteka”).
    Nakon što se ispiše hijerarhija, ponovno proći kroz sve ali prilikom ispisa provjeriti da li naziv direktorija ili datoteke počinje
    slovom između a - n (ako je malo početno prepraviti u veliko), a ako počinje slovom između o - z (ako je zadnje slovo malo prepraviti
    kompletan naziv u velika slova).
 */

public class assignment1 {
    
    public static void main(String[] args) {
        File dir = new File(".");
        System.out.println("\n\t - HIERARCHY -\n");
        firstTask(dir);
        System.out.println("\n\t - TASK -\n");
        secondTask(dir);
    }
    
    public static void firstTask(File dir) {
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file.getCanonicalPath() + " - is directory.");
                    firstTask(file);
                }
                else {
                    System.out.println(file.getCanonicalPath() + " - is file.");
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static void secondTask(File dir) {
        char checkFirst, checkLast;
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) secondTask(file);
                checkFirst = file.getName().charAt(0);
                checkLast = file.getCanonicalPath().charAt(file.getCanonicalPath().length() - 1);
                if (checkFirst >= 'a' && checkFirst <= 'n') {
                    checkFirst -= 32;
                    System.out.println(checkFirst + file.getName().substring(1));
                }
                else if ((checkFirst >= 'o' && checkFirst <= 'z') && (checkLast >= 'a' && checkLast <= 'z')) {
                    System.out.println(file.getName().toUpperCase());
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);            
        }
    }
}
