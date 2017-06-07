/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import MODEL.Giocatore;
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
    Plancia p;
    Scanner sc;
    public TextualView(){
        sc= new Scanner(System.in);
        p = new Plancia();
        System.out.println("Creata VISTA TESTUALE");
        /*
        printPlancia();
        System.out.println();
        System.out.println();
        
        
        System.out.println("Ehi giocatore 2 sei un po' sfigato, ti becchi per foza le altre pedine");
       
        boolean c=false;
        
        do{ 
            do{
                System.out.println("Dove vuoi inserire la pedina giocatore 1?");
                p.getfreeBox(g1.getplayercolor());
                System.out.println();
                printFreePlancia();
                System.out.print("riga = ");
                int rg1 = sc.nextInt();
                System.out.print("colonna = ");
                int cg1 = sc.nextInt();
                if(p.freefield[rg1-1][cg1-1]){
                    p.putPawn(rg1-1, cg1-1, new Pawn(g1.getplayercolor()));
                    p.turnPawn(rg1-1, cg1-1, g1.getplayercolor());
                    p.resetfreeplancia();
                    printPlancia();
                    c=true;
                }
                if(!c){
                    System.out.println("MOSSA NON VALIDA");
                
                }
            }while(!c);    
            c=false;
            System.out.println();
            do{
                
                System.out.println("Dove vuoi inserire la pedina giocatore 2?");
                p.getfreeBox(g2.getplayercolor());
                System.out.println();
                printFreePlancia();
                System.out.print("riga = ");
                int rg2 = sc.nextInt();
                System.out.print("colonna = ");
                int cg2 = sc.nextInt();
                if(p.freefield[rg2-1][cg2-1]){
                    p.putPawn(rg2-1, cg2-1, new Pawn(g2.getplayercolor()));
                    p.turnPawn(rg2-1, cg2-1, g2.getplayercolor());
                    p.resetfreeplancia();
                    printPlancia();
                    c=true;
                }
                if(!c){
                    System.out.println("MOSSA NON VALIDA");
                
                }
            }while(!c);
        }while(true);*/    
        
    }
    public void printPlancia(){
        int nr=1;
      
        System.out.println("      | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |");
        
        for(int r=0; r<8; r=r+1){
            System.out.println("      |---|---|---|---|---|---|---|---| ");
            System.out.print("  "+nr+"   ");
            for(int c=0; c<8; c=c+1){
                
                printBox(r,c);
                
            
            }
            nr=nr+1;
            System.out.println();
        }
        System.out.println("      |---|---|---|---|---|---|---|---| ");
    
    }
    
    public void printFreePlancia(){
        int nr=1;
      
        System.out.println("      | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |");
        
        for(int r=0; r<8; r=r+1){
            System.out.println("      |---|---|---|---|---|---|---|---| ");
            System.out.print("  "+nr+"   ");
            for(int c=0; c<8; c=c+1){
                
                printFreeBox(r,c);
                
            
            }
            nr=nr+1;
            System.out.println();
        }
        System.out.println("      |---|---|---|---|---|---|---|---| ");
    }
    
    
    public void printBox(int r, int c){
        System.out.print("| "+p.getBox(r, c)+" ");
        if(c==7)
            System.out.print("|");
        if(c!=7)
            System.out.print("");
    }
    
    public void printFreeBox(int r, int c){
        System.out.print("| "+p.getFreeBox(r, c)+" ");
        if(c==7)
            System.out.print("|");
        if(c!=7)
            System.out.print("");
    }
}
