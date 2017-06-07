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
public class Pawn {
    
    
    private String color;
    
    //Costruttore 
    
    public Pawn(String color){
        this.color=color;
        
    }
    
    
    public String getColor(){
        return color;
        
    }
    
    public void switchColor(){
        System.out.println(color);
        if(color=="W"){
            color="B";
            System.out.println(color);
        }else{    
            color="W";
        }    
    
    }
    
    
    
}
