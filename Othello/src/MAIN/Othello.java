/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

import MODEL.Giocatore;
import VIEW.GUI;
import java.io.IOException;

/**
 *
 * @author bramati.francesco
 */
public class Othello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        GUI g = new GUI();
        Giocatore g1 = new Giocatore();
        Giocatore g2 = new Giocatore();
        g1.start();
        g2.start();
    }
    
}
