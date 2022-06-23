/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferit.hr.lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
    1. NapisaT jednostavni primjer chat poslužitelja (prima jednog korisnika). ImplemenTraT poslužitelj aplikaciju koja
    od korisnika prima poruku (svaki korisnik ima svoj ID - u ovom slučaju jedan korisnik). Poslužitelj treba provjeriT
    da li poruka sadržava riječi koje nisu primjerene za chat sobu (korisTT psovka1, psovka2, psovka3, uvreda1, uvreda2,
    uvreda3 koje će predstavljaT nedozvoljene riječi). Ukoliko poruka sadrži neku od riječi zamjeniT sva slova s ‘*’ znakom
    i kao takvu vraTT korisniku. NapisaT primjer korisnik aplikacije koja će se spojiT i poslaT poruku na poslužitelj (chat sobu). 
 */

public class Server {

    public static void main(String[] args) {
        ServerSocket echoServer = null;
        String linija;
        BufferedReader is;
        PrintWriter os;
        Socket clientSocket;
        try {
            echoServer = new ServerSocket();
            echoServer.bind(new InetSocketAddress("127.0.0.1", 9999));
            System.out.println("Set server: " + echoServer.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            clientSocket = echoServer.accept();
            System.out.println("Server -> Client connected: " + clientSocket.getInetAddress());
            is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            os = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
            boolean done = false, allowed;
            while (!done && (linija = is.readLine()) != null) {
                allowed = checkAllowed(linija);
                if (linija.trim().equals("Kraj")) done = true;
                if (allowed && !done) os.println("Echo: " + linija);
                else if (!allowed && !done) os.println("Echo: *******");
                else os.println("Zavrsetak razgovora.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean checkAllowed(String linija) {
        String[] notAllowed = { "psovka1", "psovka2", "psovka3", "uvreda1", "uvreda2", "uvreda3" };
        for (String word : notAllowed) if (linija.equals(word)) return false;
        return true;
    }
}
