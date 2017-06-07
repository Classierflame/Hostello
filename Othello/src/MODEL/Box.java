/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author bramati.francesco
 */
public class Box {
    private Pawn pawn;
    
    private boolean occuped;
    
    public Box(){
        occuped = false;
    
    }
    
    
    public Box(Pawn pawn){
        this.pawn = pawn;
        
        occuped = true;
    
    
    }
    public Pawn getpawn(){
        return pawn;
    }
    
    public boolean getOccuped(){
        
        return occuped;
        
    }
    
    
}
