 package Rete;

import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EchoThread extends Thread {
    String end;
    int pedineb;
    int pedinew;
    private String place;
    private String update;
    private Socket clienti[];
    private boolean continua=true;
    BufferedReader in[] = new BufferedReader[2];
    PrintWriter out[] = new PrintWriter[2];
    String colort;
    int pedine;
    final boolean GIOCATORE1 =true;
    final boolean GIOCATORE2 =false;
    boolean turno = GIOCATORE1;
    String round;
    boolean connection = true;
    boolean clientconnessi=false;
    int nclientconnessi =0;
    String start; 
    int nturno;
    public String coordinate[];
    public EchoThread(Socket socchet[]) {
        clienti = socchet;
        colort="B";
    
    }
    @Override
    public void run() {
        
        try {
            in[0] = new BufferedReader(new InputStreamReader(clienti[0].getInputStream()));
            out[0] = new PrintWriter(new OutputStreamWriter(clienti[0].getOutputStream()), true);
            in[1] = new BufferedReader(new InputStreamReader(clienti[1].getInputStream()));
            out[1] = new PrintWriter(new OutputStreamWriter(clienti[1].getOutputStream()), true);
            while(nclientconnessi!=2){
                if(turno == GIOCATORE1){
                        String ricevuta1 = in[1].readLine();
                        if(ricevuta1.equals("connected")){
                            System.out.println("nero connesso");
                            nclientconnessi++;
                            turno = GIOCATORE2;
                            start = "<nome1>, <B>";
                            out[1].println(start);
                        }

                }else{
                        String ricevuta2 = in[0].readLine();
                        if(ricevuta2.equals("connected")){
                             System.out.println("bianco connesso");
                            nclientconnessi++;
                            start = "<nome2>, <W>";
                            out[0].println(start);
                        }
                }
                
            }    
            turno = GIOCATORE1;
            while(pedine<64){
                if(turno==GIOCATORE1){
                    nturno = 0;
                }else{
                    nturno = 1;
                }    
                if(nturno==0){
                    System.out.println("Questo è il turno nero e sono il client "+nturno);
                    round="B";
                    out[0].println(round);
                    out[1].println(round);
                    
                    place = in[1].readLine();
                    
                    
                    update = "<"+round+">, "+place;
                    
                    out[0].println(update);
                    turno=GIOCATORE2;
                    pedineb++;
                    pedine++;
                }else{
                    System.out.println("Questo è il turno bianco e sono il client "+nturno);
                    round="W";
                    out[0].println(round);
                    out[1].println(round);
                    System.out.println("Attendo place");
                    place = in[0].readLine();
                    update = "<"+round+">, "+place;
                    out[1].println(update);
                    turno=GIOCATORE1;
                    pedinew++;
                    pedine++;
                }  
            }
            end = "black, <"+pedineb+">, white, <"+pedinew+">;";
            out[0].println(end);
            out[1].println(end);
      
            
            
        } catch (IOException ex) {
            Logger.getLogger(EchoThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}