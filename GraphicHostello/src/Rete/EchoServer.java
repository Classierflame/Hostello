package Rete;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    public static void main(String[] args) throws IOException {
        System.out.println("Apertura Server");
        ServerSocket ss = new ServerSocket(2000);
        // mi aspetto due giocatori
        Socket soccarr[] = new Socket[2];
        int n_gioc = 0;
        while (n_gioc < 2) {
            Socket socc = ss.accept();
            System.out.println("ho accettato un cliente. ");
            soccarr[n_gioc] = socc;
            n_gioc++;
            System.out.println("clienti connessi: " + n_gioc);
            System.out.println("client 1: " + socc);
            System.out.println("client 2: " + socc);
        }
        EchoThread threaddigestione = new EchoThread(soccarr);
        threaddigestione.start();
    }
}
