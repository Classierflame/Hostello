
package CONTROLLER;

import MODEL.Pawn;
import MODEL.Plancia;
import VIEW.TextualView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//Classe rappresentate il giocatore (client)
public class Giocatore extends Thread {
    
    private String richiesta;
    private boolean continua = true;
    private Socket s; 
    private BufferedReader sock_in;
    private PrintWriter sock_out;
    private BufferedReader std_in;
    private PrintWriter std_out;
    private String playercolor;
    private int nturno;
    private String myname;
    private String place;
    private Plancia p;
    private Scanner sc;
    private TextualView v;
    private String update;
    private String mosseg2[];
    private boolean c;
    private String nomecolore[];
    private int rg;
    private int cg;
    
    private int pedine;
    
    public Giocatore(TextualView tx) throws IOException{
        v=tx;
        p = new Plancia();
        s = new Socket("192.168.1.13", 2000);
        sock_in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        sock_out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
        std_in = new BufferedReader(new InputStreamReader(System.in));
        std_out = new PrintWriter(new OutputStreamWriter(System.out), true);
        sc = new Scanner(System.in);
    }    
      
    
    
    @Override
    public void run() {
    boolean c = false;
    System.out.println("Connessione in corso...");
    richiesta="connected";
    sock_out.println(richiesta);  
     
    try {
        nomecolore = sock_in.readLine().split(",");
    } catch (IOException ex) {
        Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
    }
    myname=nomecolore[0].substring(1, nomecolore[0].length()-1);
    playercolor=nomecolore[1].substring(2, 3);
    System.out.println("Sei stato connesso, il tuo colore è "+playercolor);
    while(pedine<64){
        try {
            if(sock_in.readLine().equals(playercolor)){
                do{
                    System.out.println("Dove vuoi inserire la pedina ?");
                    v.printPlancia(p);
                    System.out.println();
                    System.out.println();               
                    p.getfreeBox(playercolor);
                    System.out.println();
                    v.printFreePlancia(p);
                    System.out.print("riga = ");
                    rg = sc.nextInt();
                    System.out.print("colonna = ");
                    cg = sc.nextInt();
                    if(p.freefield[rg-1][cg-1]){
                        p.putPawn(rg-1, cg-1, new Pawn(playercolor));
                        p.turnPawn(rg-1, cg-1, playercolor);
                        p.resetfreeplancia();
                        v.printPlancia(p);
                        c=true;
                        place="<"+(rg-1)+">, <"+(cg-1)+">";
                        sock_out.println(place);
                        pedine++;
                        
                    }else{
                        System.out.println("MOSSA NON VALIDA");
                    }
                }while(!c);    
         
            }else{
                update = sock_in.readLine();
                System.out.println(update);
                mosseg2 = update.split(", ");
                System.out.println(Arrays.toString(mosseg2));
                System.out.println("il mio colore è: "+mosseg2[0].substring(1, mosseg2[0].length()-1));
                p.putPawn(Integer.parseInt(mosseg2[1].substring(1, mosseg2[1].length()-1)), Integer.parseInt(mosseg2[2].substring(1, mosseg2[2].length()-1)),new Pawn(mosseg2[0].substring(1, mosseg2[0].length()-1)));
                p.turnPawn(Integer.parseInt(mosseg2[1].substring(1, mosseg2[1].length()-1)), Integer.parseInt(mosseg2[2].substring(1, mosseg2[2].length()-1)), mosseg2[0].substring(1, mosseg2[0].length()-1));              
                v.printPlancia(p);
                pedine++;
            }

            } catch (IOException ex) {
                Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        try {
            System.out.println(sock_in.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
        }
            
         
    }
    
    //Metodo per la restituzione del colore del giocatore
    public String getplayercolor(){
        return playercolor;
    }

    
    
}
