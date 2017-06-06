/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLLER.Giocatore;
import MODEL.Pawn;
import MODEL.Plancia;
import java.util.Scanner;

/**
 *
 * @author bramati.francesco
 */
public class TextualView {
    Giocatore g1;
    Giocatore g2;

    Scanner sc;
    public TextualView(){
        System.out.println("Creata VISTA TESTUALE");

    }
    public void printPlancia(Plancia p){
        int nr=1;
      
        System.out.println("      | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |");
        
        for(int r=0; r<8; r=r+1){
            System.out.println("      |---|---|---|---|---|---|---|---| ");
            System.out.print("  "+nr+"   ");
            for(int c=0; c<8; c=c+1){
                
                printBox(r,c,p);
                
            
            }
            nr=nr+1;
            System.out.println();
        }
        System.out.println("      |---|---|---|---|---|---|---|---| ");
    
    }
    
    public void printFreePlancia(Plancia p){
        int nr=1;
      
        System.out.println("      | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |");
        
        for(int r=0; r<8; r=r+1){
            System.out.println("      |---|---|---|---|---|---|---|---| ");
            System.out.print("  "+nr+"   ");
            for(int c=0; c<8; c=c+1){
                
                printFreeBox(r,c,p);
                
            
            }
            nr=nr+1;
            System.out.println();
        }
        System.out.println("      |---|---|---|---|---|---|---|---| ");
    }
    
    
    public void printBox(int r, int c, Plancia p){
        System.out.print("| "+p.getBox(r, c)+" ");
        if(c==7)
            System.out.print("|");
        if(c!=7)
            System.out.print("");
    }
    
    public void printFreeBox(int r, int c, Plancia p){
        System.out.print("| "+p.getFreeBox(r, c)+" ");
        if(c==7)
            System.out.print("|");
        if(c!=7)
            System.out.print("");
    }
}
