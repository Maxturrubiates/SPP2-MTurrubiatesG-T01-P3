/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mturrubiatesg.t01.p3;
import java.util.Scanner;
/**
 *
 * @author Max
 */
public class SPP2MTurrubiatesGT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        double x1, y1, x2, y2, d;
        
        System.out.print("Introdusca x1:");
        x1= teclado.nextDouble();
        System.out.println(" ");
        System.out.print("Introdusca y1:");
        y1= teclado.nextDouble();
        System.out.println(" ");
        System.out.print("Introdusca x2:");
        x2= teclado.nextDouble();
        System.out.println(" ");
        System.out.print("Introdusca y2:");
        y2= teclado.nextDouble();
        
        d= Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        
        System.out.println("La distancia de punto a punto es= "+ d);
        // TODO code application logic here
    }
    
}
