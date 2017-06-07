 package MODEL;

import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EchoThread extends Thread {
    private String place;
    private String update;
    private Socket clienti[];
    private boolean continua=true;
    BufferedReader in[] = new BufferedReader[2];
    PrintWriter out[] = new PrintWriter[2];
    String colort;

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
                        String ricevuta1 = in[0].readLine();
                        if(ricevuta1.equals("connected")){
                           
                            nclientconnessi++;
                            turno = GIOCATORE2;
                            start = "<nome1>, <B>";
                            out[0].println(start);
                        }

                }else{
                        String ricevuta2 = in[1].readLine();
                        if(ricevuta2.equals("connected")){
                            
                            nclientconnessi++;
                            start = "<nome2>, <W>";
                            out[1].println(start);
                        }
                }
                
            }    
            while(connection){
                nturno = (turno == GIOCATORE1? 0 :1);
                if(nturno==0){
                    round="<B>";
                    out[nturno].println(round);
                    place = in[0].readLine();
                    update = "<"+round+">, "+place;
                    out[1].println(update);
                    turno=GIOCATORE2;
                }else{
                    round="<W>";
                    out[nturno].println(round);
                    place = in[1].readLine();
                    update = "<"+round+">, "+place;
                    out[0].println(update);
                    turno=GIOCATORE1;
                }  
            }
            /*
            while (continua) {
                int nricevuto=0;   
                   
                
                int nturno = (round == GIOCATORE1? 0 :1);
                switch(nricevuto){
                    
                            case 0:
                            out[nturno].println("Siamo connessi");
                             
                                if(nturno==0){
                                    
                                }else{
                                    start = "<nome2>, <W>";
                                }
                                out[nturno].println(start);
                            break;
                                
                            case 1:
                                out[nturno].println("Uscita in corso..");
                                continua=false;
                                clienti[nturno].close();
                            break;
                            
                            default: 
                                //inizio della partita
                                out[nturno].println(colort);
                                place = in[nturno].readLine().
                                update = "<"+colort+">, <"+
                                /*
                                if(nturno == 0)
                                    out[nturno].println("");
                                else
                                    out[nturno].println("Aspetta il tuo round"); 
                                
                            break;
                }
                round = !round;

            }*/
            
            
        } catch (IOException ex) {
            Logger.getLogger(EchoThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}