/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial;


public class Calculador implements ICalculador{
    int m,n,o,p;
     public Punto punto1=new Punto(n,m);
     public Punto punto2=new Punto(o,p);

    @Override
    public double calcularDistancia() {
        int x=n-o;
        int y=m-p;
        
       return Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));
       
    }

    @Override
    public double calcularArea() {
        return ((n-o)*(m-p));
    }

    @Override
    public double calcularPendiente() {
        m=((p-m)/(o-n));
        return m;
    }
     
}
