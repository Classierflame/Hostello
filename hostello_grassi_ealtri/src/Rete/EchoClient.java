package Rete;
import java.io.*;
import java.net.*;
public class EchoClient {
    private static String t;
    public static boolean continua = true;
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("10.1.33.17", 2000);
        BufferedReader sock_in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter sock_out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
        BufferedReader std_in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter std_out = new PrintWriter(new OutputStreamWriter(System.out), true);
        
        while (continua) {
            System.out.println("Scrivi 0 per scegliere il colore della pedia e 1 per uscire");
            t = std_in.readLine();
            sock_out.println(t);            
            //std_out.println(sock_in.readLine());
            String zio = sock_in.readLine();
            std_out.println(zio);
            
            if("1".equals(t)){
                        continua=false;
            }
        }
        
    }
}