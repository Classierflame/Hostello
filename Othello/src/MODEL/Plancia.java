
package MODEL;

public class Plancia {
    
    private Box field[][];
    public boolean freefield[][];
    
    public Plancia(){
        field = new Box[8][8];
        freefield = new boolean[8][8];
        for(int r=0; r<8; r=r+1){
            for(int c=0; c<8; c=c+1){
                if(c==3&&r==3){
                    field[r][c]=new Box(new Pawn("W"));   
                }else{
                    if(c==4&&r==4){
                        field[r][c]=new Box(new Pawn("W"));
                    }else{
                        if(c==4&&r==3){
                            field[r][c]=new Box(new Pawn("B"));
                        }else{
                            if(c==3&&r==4){
                                field[r][c]=new Box(new Pawn("B"));
                            }else{
                                field[r][c]=new Box();
                            }
                        }
                    }
                }   
            }
        }
        for(int r=0; r<8; r=r+1){
            for(int c=0; c<8; c=c+1){
                freefield[r][c]=false;
            }
        }    
    }
    
    public void putPawn(int x, int y, Pawn pawn){
        field[x][y]= new Box(pawn);
    }
     
    public void turnPawn(int x, int y, String color){
        boolean w = false;
        boolean finddifferentpown=false;
        
        //RIGHE
        for(int c=y-1; c>=0 && w==false; c=c-1){
            
            if(field[x][c].getOccuped()){
                
                if(field[x][c].getpawn().getColor().equals(getnotcolor(color))){
                    finddifferentpown=true;
                }
                if(field[x][c].getpawn().getColor().equals(color) && finddifferentpown == true){
                    for(int co=c+1; co<y; co=co+1){
                        
                        field[x][co].getpawn().switchColor();
                        w = true;
                    }
                    
                }
            }    
        }
        finddifferentpown=false;
        w=false;
        
        for(int c=y+1; c<=7 && w==false; c=c+1){
            if(field[x][c].getOccuped()){
                
                if(field[x][c].getpawn().getColor().equals(getnotcolor(color))){
                    finddifferentpown=true;
                }
                if(field[x][c].getpawn().getColor().equals(color) && finddifferentpown == true){
                    for(int co=c-1; co>y; co=co-1){
                        
                        field[x][co].getpawn().switchColor();
                        w=true;
                    }
                }
            }
        }
        finddifferentpown=false;
        w=false;
        
        //COLONNE
        
        for(int r=x-1; r>=0 && w==false; r=r-1){
            if(field[r][y].getOccuped()){
                if(field[r][y].getpawn().getColor().equals(getnotcolor(color))){
                    finddifferentpown=true;
                }
                if(field[r][y].getpawn().getColor().equals(color) && finddifferentpown == true){
                    for(int ro=r+1; ro<x; ro=ro+1){
                        field[ro][y].getpawn().switchColor();
                        w=true;
                        
                    }
                }
            }    
        
        }
        finddifferentpown=false;
        w=false;
        
        for(int r=x+1; r<8 && !w; r=r+1){
            if(field[r][y].getOccuped()){
                if(field[r][y].getpawn().getColor().equals(getnotcolor(color))){
                    finddifferentpown=true;
                }
                if(field[r][y].getpawn().getColor().equals(color) && finddifferentpown){
                    for(int ro=r-1; ro>x; ro=ro-1){
                        field[ro][y].getpawn().switchColor();
                        w=true;
                    }
                }
            }    
        
        }
        finddifferentpown=false;
        w=false;
        
        
        //DIAGONAle UP DX
        
        for(int i=1; (x-i)>=0 && (y+i)<8 && !w; i=i+1){
            if(field[x-i][y+i].getOccuped()){
                if(field[x-i][y+i].getpawn().getColor().equals(getnotcolor(color))){
                    finddifferentpown=true;
                }
                if(field[x-i][y+i].getpawn().getColor().equals(color) && finddifferentpown){
                    for(int d=i-1; d>=0; d=d-1){
                        if(field[(x-i)+d][(y+i)-d].getpawn().getColor().equals(getnotcolor(color))){
                            field[(x-i)+d][(y+i)-d].getpawn().switchColor();
                            w=true;
                        }
                        if(field[(x-i)+d][(y+i)-d].getpawn().getColor().equals(color)){
                            finddifferentpown=false;
                        }
                    }
                }
            }
            if(!field[x-i][y+i].getOccuped()){
                w=true;
            }
        }
        finddifferentpown=false;
        w=false;
        
        //DIAGONALE UP SX
        
        for(int i=1; (x-i)>=0 && (y-i)<8 && !w; i=i+1){
            if(field[x-i][y-i].getOccuped()){
                if(field[x-i][y-i].getpawn().getColor().equals(getnotcolor(color))){
                    finddifferentpown=true;
                }
                if(field[x-i][y-i].getpawn().getColor().equals(color) && finddifferentpown){
                    System.out.println(i);
                    for(int d=i-1; d>=0; d=d-1){
                        if(field[(x-i)+d][(y-i)+d].getpawn().getColor().equals(getnotcolor(color))){
                            field[(x-i)+d][(y-i)+d].getpawn().switchColor();
                            w=true;
                        }
                        if(field[(x-i)+d][(y-i)+d].getpawn().getColor().equals(color)){
                            finddifferentpown=false;
                        }
                    }
                }
            }
            if(!field[x-i][y-i].getOccuped()){
                w=true;
            }
        }
        finddifferentpown=false;
        w=false;
        
        //DIAGONALE DOWN DX
        
        for(int i=1; (x+i)>=0 && (y+i)<8 && !w; i=i+1){
            if(field[x+i][y+i].getOccuped()){
                System.out.println(field[x+i][y+i].getpawn().getColor());
                if(field[x+i][y+i].getpawn().getColor().equals(getnotcolor(color))){
                    
                    finddifferentpown=true;
                }
                if(field[x+i][y+i].getpawn().getColor().equals(color) && finddifferentpown){
                    
                    for(int d=i-1; d>=0; d=d-1){
                        if(field[(x+i)-d][(y+i)-d].getpawn().getColor().equals(getnotcolor(color))){
                            field[(x+i)-d][(y+i)-d].getpawn().switchColor();
                            w=true;
                        }
                        if(field[(x+i)-d][(y+i)-d].getpawn().getColor().equals(color)){
                            finddifferentpown=false;
                        }
                    }
                }
            }
            if(!field[x+i][y+i].getOccuped()){
                w=true;
            }
        }
        finddifferentpown=false;
        w=false;
        
        //DIAGONALE DOWN SX
        
        for(int i=1; (x+i)>=0 && (y-i)<8 && !w; i=i+1){
            if(field[x+i][y-i].getOccuped()){
                if(field[x+i][y-i].getpawn().getColor().equals(getnotcolor(color))){
                    finddifferentpown=true;
                }
                if(field[x+i][y-i].getpawn().getColor().equals(color) && finddifferentpown){
                    for(int d=i-1; finddifferentpown; d=d-1){
                        if(field[(x+i)-d][(y-i)+d].getpawn().getColor().equals(getnotcolor(color))){
                            field[(x+i)-d][(y-i)+d].getpawn().switchColor();
                            w=true;
                        }
                        if(field[(x+i)-d][(y-i)+d].getpawn().getColor().equals(color)){
                            finddifferentpown=false;
                        }
                    }
                }
            }
            if(!field[x+i][y-i].getOccuped()){
                w=true;
            }
        }
        finddifferentpown=false;
        w=false;
        
    }
    
    
    

    public String getBox(int r, int c) {
        
        if(field[r][c].getOccuped()==true){
            
            if(field[r][c].getpawn().getColor().equals("B")){
                
                return "B";
            }
            else{
                return "W";
            }
        }else{
            return " ";
        }
    
    }
    
    public Box[][] getField(){
    
        return field;
    }
    
    
    public void getfreeBox(String color){
        
        boolean findpown=false;
        boolean nofreebox=false;
        
        for(int r=0; r<8; r=r+1){
            for(int c=0; c<8; c=c+1){
                
                if(field[r][c].getOccuped() && !nofreebox){
                    if(field[r][c].getpawn().getColor().equals(color)){
                        
                        
                        
                        
                        
                        
                        //CONTROLLO RIGHE SX
                        for(int i=(c-1); i>=0; i=i-1){
                            if(field[r][i].getOccuped()==true&&nofreebox==false){
                                

                                
                                if(field[r][i].getpawn().getColor().equals(getnotcolor(color)) && nofreebox==false){
                                    
                                    for(int y=i-1; y>=0; y=y-1){
                                        
                                        if(!field[r][y].getOccuped()){
                                            
                                            freefield[r][y]=true;
                                            y=-1;
                                            nofreebox=true;
                                            
                                            
                                        }
                                    }
                                }
                                if(!field[r][i].getpawn().getColor().equals(color) && nofreebox){
                                    
                                    nofreebox=true;
                                }
                            }
                            
                            if(!field[r][i].getOccuped()== false && nofreebox){
                                
                                nofreebox=true;
                                
                            }
                            
                            if(nofreebox){
                                
                                i=-1;
                                nofreebox=false;
                                
                            }
                            
                            
                        }
                        
                        
                        
                        
                        
                        //CONTROLLO RIGHE DX
                        for(int i=(c+1); i<8; i=i+1){
                                
                            if(field[r][i].getOccuped()&&!nofreebox){

                                if(field[r][i].getpawn().getColor().equals(getnotcolor(color)) && nofreebox==false){

                                    for(int y=i; y<8; y=y+1){

                                        if(field[r][y].getOccuped()==false){
                                                
                                            freefield[r][y]=true;
                                            y=8;
                                            nofreebox=true;

                                        }
                                        
                                    }
                                    
                                }
                                if(field[r][i].getpawn().getColor().equals(color) && nofreebox==false){

                                    nofreebox=true;
                                }
                            }

                            if(!field[r][i].getOccuped() && !nofreebox){

                                nofreebox=true;

                            }

                            if(nofreebox){

                                i=8;
                                nofreebox=false;
                            }
                            
                        }
                        
                        
                        
                        
                        //CONTROLLO COLONNE UP
                            for(int i=(r-1); i>=0; i=i-1){
                            if(field[i][c].getOccuped() && !nofreebox){
                                
                                
                                
                                if(field[i][c].getpawn().getColor().equals(getnotcolor(color)) && !nofreebox){
                                    
                                    for(int y=i; y>=0; y=y-1){
                                        
                                        if(!field[y][c].getOccuped()){
                                            
                                            freefield[y][c]=true;
                                            y=-1;
                                            nofreebox=true;
                                            
                                        }
                                    }
                                }
                                if(field[i][c].getpawn().getColor().equals(color) && !nofreebox){
                                    
                                    nofreebox=true;
                                }
                            }
                            
                            if(!field[i][c].getOccuped() && !nofreebox){
                                
                                nofreebox=true;
                                
                            }
                            
                            if(nofreebox){
                                
                                i=-1;
                                nofreebox=false;
                                
                            }
                            
                        }
                                              
                            
                            
                            
                        //CONTROLLO COLONNE DOWN
                        for(int i=(r+1); i<8; i=i+1){
                            if(field[i][c].getOccuped() && !nofreebox){

                                if(field[i][c].getpawn().getColor().equals(getnotcolor(color)) && !nofreebox){
                                    
                                    for(int y=i; y<8; y=y+1){
                                        
                                        if(!field[y][c].getOccuped()){
                                            
                                            freefield[y][c]=true;
                                            y=8;
                                            
                                            nofreebox=true;
                                            
                                        }
                                    }
                                }
                                if(!field[i][c].getpawn().getColor().equals(color) && nofreebox){
                                    
                                    nofreebox=true;
                                }
                            }
                            
                            if(!field[i][c].getOccuped() && !nofreebox){
                                
                                nofreebox=true;
                                
                            }
                            
                            if(nofreebox){
                                i=8;
                                nofreebox=false;
                            }
                            
                        }
                        
                        //CONTROLLO DIAGONALE UP DX
                        for(int i=1; (r-i)>=0 && (c+i)<8; i=i+1){
                            if(field[r-i][c+i].getOccuped() && !nofreebox){
                                if(field[r-i][c+1].getpawn().getColor().equals(getnotcolor(color)) && !nofreebox){
                                    for(int y=i; (r-y)>=0 && (c-y)<8; y=y+1){
                                        if(!field[r-y][c+y].getOccuped()){
                                            freefield[r-y][c+y]=true;
                                            y=8;
                                            nofreebox=true;
                                        }
                                    }
                                }
                                if(field[r-i][c+i].getpawn().getColor().equals(color) && !nofreebox){
                                    nofreebox=true;
                                }
                            }
                            if(!field[r-i][c+i].getOccuped() && !nofreebox){
                                i=9;
                                nofreebox=true;
                            }
                            if(nofreebox){
                                
                                nofreebox=false;
                            }
                        }
                        
                        //CONTROLLO DIAGONALE UP SX
                        for(int i=1; (r-i)>=0 && (c-i)>=0; i=i+1){
                            if(field[r-i][c-i].getOccuped() && !nofreebox){
                                if(field[r-i][c-i].getpawn().getColor().equals(getnotcolor(color)) && !nofreebox){
                                    for(int y=i; (r-y)>=0 && (c-y)<8; y=y+1){
                                        if(!field[r-y][c-y].getOccuped()){
                                            freefield[r-y][c-y]=true;
                                            y=8;
                                            nofreebox=true;
                                        }
                                    }
                                }
                                if(field[r-i][c-i].getpawn().getColor().equals(color) && !nofreebox){
                                    nofreebox=true;
                                }
                            }
                            if(!field[r-i][c-i].getOccuped() && !nofreebox){
                                i=9;
                                nofreebox=true;
                            }
                            if(nofreebox){
                                
                                nofreebox=false;
                            }
                        }
                        
                        //CONTROLLO DIAGONALE DOWN DX
                        for(int i=1; (r+i)<8 && (c+i)>=0; i=i+1){
                            if(field[r+i][c+i].getOccuped() && !nofreebox){
                                if(field[r+i][c+i].getpawn().getColor().equals(getnotcolor(color)) && !nofreebox){
                                    for(int y=i; y<8; y=y+1){
                                        if(!field[r+y][c+y].getOccuped()){
                                            freefield[r+y][c+y]=true;
                                            y=8;
                                            nofreebox=true;
                                        }
                                    }
                                }
                                if(field[r+i][c+i].getpawn().getColor().equals(color) && !nofreebox){
                                    nofreebox=true;
                                }
                            }
                            if(!field[r+i][c+i].getOccuped() && !nofreebox){
                                i=9;
                                nofreebox=true;
                            }
                            if(nofreebox){
                                
                                nofreebox=false;
                            }
                        }
                        
                        //CONTROLLO DIAGONALE DOWN SX
                        for(int i=1; (r+i)<8 && (c-i)>=0; i=i+1){
                            if(field[r+i][c-i].getOccuped() && !nofreebox){
                                if(field[r+i][c-1].getpawn().getColor().equals(getnotcolor(color)) && !nofreebox){
                                    for(int y=i; y<8; y=y+1){
                                        if(!field[r+y][c-y].getOccuped()){
                                            freefield[r+y][c-y]=true;
                                            y=8;
                                            nofreebox=true;
                                        }
                                    }
                                }
                                if(field[r+i][c-i].getpawn().getColor().equals(color) && !nofreebox){
                                    nofreebox=true;
                                }
                            }
                            if(!field[r+i][c-i].getOccuped() && !nofreebox){
                                i=9;
                                nofreebox=true;
                            }
                            if(nofreebox){
                                
                                nofreebox=false;
                            }
                        }
                        
                        
                    }
                }
            }
        }
    }
    
    public boolean[][] getfreefield(){
        return freefield;
    }
    
    public String getFreeBox(int r, int c){
        if(freefield[r][c]==true){
            return "T";
        }else{
            return "F";
        }
    }
    
    public String getnotcolor(String color){
        
        if(color.equals("B")){
            return "W";
        }else{
            return "B";
        }
        
    }
     public void resetfreeplancia(){
            for(int r=0; r<8; r=r+1){
                for(int c=0; c<8; c=c+1){
                freefield[r][c]=false;
            }
        } 
     }
}
