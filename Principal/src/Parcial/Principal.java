/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculador calculador1 = new Calculador();
        Scanner miscanner = new Scanner(System.in);
        int m=0,n = 0,o=0,p=0;
        System.out.println("Ingrese coordenada x del primer punto");
        miscanner.nextInt(n);
        System.out.println("Ingrese coordenada y del primer punto");
        miscanner.nextInt(m);
        System.out.println("Ingrese coordenada x del segundo punto");
        miscanner.nextInt(o);
        System.out.println("Ingrese coordenada y del segundo punto");
        miscanner.nextInt(p);
        
        System.out.println(calculador1.calcularArea());
        System.out.println(calculador1.calcularDistancia());
        System.out.println( calculador1.calcularPendiente());
        
        
        
    }
    
}