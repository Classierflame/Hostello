/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import VIEW.TextualView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bramati.francesco
 */
public class Giocatore extends Thread {
    private String richiesta;
    private boolean continua = true;
    Socket s; 
    BufferedReader sock_in;
    PrintWriter sock_out;
    BufferedReader std_in;
    PrintWriter std_out;
    String playercolor;
    int nturno;
    String myname;
    String place;
    Plancia p;
    Scanner sc;
    TextualView v;
    String update;
    String mosseg2[];
    boolean c;
    String nomecolore[];
    public Giocatore() throws IOException{
        p = new Plancia();
        s = new Socket("192.168.1.13", 2000);
        sock_in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        sock_out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
        std_in = new BufferedReader(new InputStreamReader(System.in));
        std_out = new PrintWriter(new OutputStreamWriter(System.out), true);
    }    
        //Richiesta di connessione
    
        @Override
        public void run() {
        System.out.println("Connessione in corso...");
        richiesta="connected";
        sock_out.println(richiesta);  
        
        try {
            nomecolore = sock_in.readLine().split(",");
        } catch (IOException ex) {
            Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
        }
        myname=nomecolore[0].substring(1, nomecolore[0].length()-1);
        playercolor=nomecolore[1].substring(1, 2);
        System.out.println("Sei stato connesso, il tuo colore è "+playercolor);
        while(true){
            try {
                if(sock_in.readLine().equals(playercolor)){
                    System.out.println("Dove vuoi inserire la pedina ?");
                    p.getfreeBox(playercolor);
                    System.out.println();
                    v.printFreePlancia();
                    System.out.print("riga = ");
                    int rg = sc.nextInt();
                    System.out.print("colonna = ");
                    int cg = sc.nextInt();
                    place="<"+(rg-1)+">, <"+(cg-1)+">";
                    sock_out.println(place);
                    p.putPawn(rg-1, cg-1, new Pawn(playercolor));
                    p.turnPawn(rg-1, cg-1, playercolor);
                    p.resetfreeplancia();
                    v.printPlancia();
                }else{
                    update = sock_in.readLine();
                    mosseg2 = update.split(",");
                    p.putPawn(Integer.parseInt(mosseg2[1].substring(1, mosseg2.length-1)), Integer.parseInt(mosseg2[2].substring(1, mosseg2.length-1)),new Pawn(mosseg2[0].substring(1, mosseg2.length-1)));
                    p.turnPawn(Integer.parseInt(mosseg2[1].substring(1, mosseg2.length-1)), Integer.parseInt(mosseg2[2].substring(1, mosseg2.length-1)), mosseg2[0].substring(1, mosseg2.length-1));
                    p.resetfreeplancia();
                    v.printPlancia();
                }
                /*
                Box field[][] = p.getField();
                for(int x=0; x<8; x++){
                for(int y=0; y<8; y++){
                if(field[x][y].getOccuped()==false){
                c=false;
                }
                if(field[x][y])
                }
                }*/
            } catch (IOException ex) {
                Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
            
            
        
        
        /*
        while (continua) {
            System.out.println("Scrivi 0 per scegliere il colore della pedina e 1 per uscire");
            t = std_in.readLine();
            sock_out.println(t);            
            //std_out.println(sock_in.readLine());
            String zio = sock_in.readLine();
            std_out.println(zio);
            
            if("1".equals(t)){
                continua=false;
            }
        }
        */
    }
    
    public String getplayercolor(){
        return playercolor;
    
    }
    public void getxy(int x, int y){
        place="<"+x+">, <"+y+">;";
    }
    
    
}
