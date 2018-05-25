
package Parcial;

public class Punto {
    private int x;
    private int y;

    public Punto(int n, int m) {
        if(n>0 & m>0){
          this.x = n;
          this.y = m;  
        }else{
            System.out.println("Las coordenadas no estan en el primer cuadrante");
        }
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
