package MAIN;

import CONTROLLER.Giocatore;
import MODEL.Plancia;
import VIEW.GUI;
import java.io.IOException;


public class Othello {

   //metodo principale di avvio dell'applicazione
    public static void main(String[] args) throws IOException {
        //creazione della GUI che a sua volta gestirà la vista grafica e testuale
        GUI g = new GUI();
        
        Giocatore g1 = new Giocatore(g.gettextView());
 
        g1.start();
   
    }
    
}
