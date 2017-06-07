package MODEL;

import MODEL.EchoThread;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    public static void main(String[] args) throws IOException {
        System.out.println("Apertura Server");
        ServerSocket ss = new ServerSocket(2000);
        // mi aspetto due giocatori
        Socket socchia[] = new Socket[2];
        int n_gioc = 0;
        while (n_gioc < 2) {
            Socket socchio = ss.accept();
            System.out.println("ho accettato un cliente. ");
            socchia[n_gioc] = socchio;
            n_gioc++;
            System.out.println("clienti connessi: " + n_gioc);
            System.out.println("socchio: " + socchio);
            System.out.println("socchia: " + socchia);
        }
        EchoThread threaddigestione = new EchoThread(socchia);
        threaddigestione.start();
    }
}
