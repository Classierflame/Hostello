package MODEL;

//Classe rappresentativa di una casella della plancia
public class Box {
    //riferimento all'oggetto pedina
    private Pawn pawn;
    //flag di notifica dello stato della Box (occupata o libera)
    private boolean occuped;
    
    //Costruttore che inizializza la casella vuota
    public Box(){
        occuped = false;
    }
    
    //Overload del costruttore in caso si voglia occupare la box in fase di creazione
    public Box(Pawn pawn){
        this.pawn = pawn;
        occuped = true;   
    }
    
    //Metodo per restituire la pedina nella box
    public Pawn getpawn(){
        return pawn;
    }
    
    //Metodo che verifica che la box sia libera o meno
    public boolean getOccuped(){
        return occuped;
    }
}
