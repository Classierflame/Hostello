package MODEL;
//Classe che raprresenta una pedina
public class Pawn {
    //variabile che rappresenta il colore della pedina
    private String color;
    //Costruttore per assegnare un colore alla pedina
    public Pawn(String color){
        this.color=color;   
    }
    //Metodo di restituzione della stinga color
    public String getColor(){
        return color;
    }
    //Metodi per far cambiare colore alla pedina
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
