/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto2;

import java.util.Scanner;

/**
 *
 * @author E. Misael Ortiz
 */
public class TestRectagulo {
    public static void main(String[] args) {
        Rectangulo puntox1 = new Rectangulo();
        Rectangulo puntox2 = new Rectangulo();
        Rectangulo base= new Rectangulo();
        Rectangulo altura=new Rectangulo();
        Scanner sc = new Scanner (System.in);
        double x1;
        System.out.println("Ingrese x del punto del vertice: ");
        x1=sc.nextDouble();
        puntox1.setPuntox1(x1);
        double y1;
        System.out.println("Ingrese y del punto del vertice: ");
        y1=sc.nextDouble();
        puntox2.setPuntoy1(y1);
        double b;
        System.out.println("Ingrese base del rectangulo: ");
        b=sc.nextDouble();
        base.setBase(b);
        double h;
        System.out.println("Ingrese altura del rectangulo: ");
        h=sc.nextDouble();
        altura.setAltura(h);
        
        
    }
}
