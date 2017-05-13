 package Rete;

import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EchoThread extends Thread {

    private Socket clienti[];
    private boolean continua=true;
    BufferedReader in[] = new BufferedReader[2];
    PrintWriter out[] = new PrintWriter[2];
    
    public EchoThread(Socket socchet[]) {
        clienti = socchet;
    }
    final boolean GIOCATORE1 =true;
    final boolean GIOCATORE2 =false;
    boolean turno = GIOCATORE1;
    int i=0;
    @Override
    public void run() {
        
        try {
            in[0] = new BufferedReader(new InputStreamReader(clienti[0].getInputStream()));
            out[0] = new PrintWriter(new OutputStreamWriter(clienti[0].getOutputStream()), true);
            in[1] = new BufferedReader(new InputStreamReader(clienti[1].getInputStream()));
            out[1] = new PrintWriter(new OutputStreamWriter(clienti[1].getOutputStream()), true);
            
            while (continua) {
                
                int x=0;
                
                
                
                
                
                
                
                
                    
                if(turno == GIOCATORE1){
                    String r = in[0].readLine();
                    x =Integer.parseInt(r);
                }else{
                    String s = in[1].readLine();
                    x =Integer.parseInt(s);
                }   
                
                    int pos = (turno == GIOCATORE1? 0 :1);
                switch(x){
                            case 0:
                            String mss;  
                                
                                if(pos==0){
                                    mss = "Sei il giocatre NERO";
                                }else{
                                    mss = "Sei il giocatre BIANCO";
                                }
                                out[pos].println("Ricerca partita in corso...\b" + mss);
                                break;
                                
                            case 1:
                                
                                out[pos].println("Uscita in corso..");
                                continua=false;
                                clienti[pos].close();
                                break;
                            case 2:
                                //creazione terreno
                                //
                                //
                                break;
                            case 3: 
                                //mossa[y];
                                break;
                }
                turno = !turno;

            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(EchoThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}