/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv8;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Client {

    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = 9999;
        try {
            Socket klijent = new Socket(host, port);
            System.out.println("\t-> Client: " + klijent.getLocalAddress() + ":" + klijent.getLocalPort() + "\n\tZa prekid unesite [Kraj].\n");
            InputStream in = klijent.getInputStream();
            OutputStream out = klijent.getOutputStream();
            BufferedReader bis = new BufferedReader(new InputStreamReader(in));
            PrintWriter ps = new PrintWriter(new PrintStream(out), true);
            String word;
            do {
                word = JOptionPane.showInputDialog("Message");
                ps.println(word);
                String linija;
                if ((linija=bis.readLine()) != null) System.out.println(linija);
            } while(!word.equals("Kraj"));
        } catch (HeadlessException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
