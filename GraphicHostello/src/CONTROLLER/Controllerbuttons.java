
package CONTROLLER;

import MODEL.Pawn;
import MODEL.Plancia;
import VIEW.TextualView;


public class Controllerbuttons {

    Plancia p;
    String color;
    TextualView v;
    public Controllerbuttons(Plancia p, String color){
        this.p = p;
        this.color = color;
        v=new TextualView();
    }
    public void Pulsantepremuto(int x, int y) {
            p.putPawn(x, y, new Pawn(color));
            
            p.turnPawn(x, y, color);
           
            
    }
}
