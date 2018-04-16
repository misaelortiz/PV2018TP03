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
        Rectangulo puntoy1 = new Rectangulo();
        Rectangulo base= new Rectangulo();
        Rectangulo altura=new Rectangulo();
        Rectangulo diagonal=new Rectangulo();
        Rectangulo v2 = new Rectangulo();
        Rectangulo v3 = new Rectangulo();
        Rectangulo v4 = new Rectangulo();
        Rectangulo s = new Rectangulo();
        Rectangulo p = new Rectangulo();
        
        Scanner sc = new Scanner (System.in);
        double x1;
        System.out.println("Ingrese X del punto del vertice 1: ");
        x1=sc.nextDouble();
        puntox1.setPuntox1(x1);
        double y1;
        System.out.println("Ingrese Y del punto del vertice 1: ");
        y1=sc.nextDouble();
        puntoy1.setPuntoy1(y1);
        
        double b;
        System.out.println("Ingrese base del rectangulo: ");
        b=sc.nextDouble();
        base.setBase(b);
        double h;
        System.out.println("Ingrese altura del rectangulo: ");
        h=sc.nextDouble();
        altura.setAltura(h);
        double d;
        d=diagonal.ObtenerDiagonal(b, h);
        System.out.println("La diagonal del rectangulo es:  " + d );
        System.out.println("Vertice1= x: " + x1 + " y: " + y1 );
        v2.ObtenerVertice2(puntox1,puntoy1, altura);
        v3.ObtenerVertice3(puntox1, puntoy1, base, altura);
        v4.ObtenerVertice4(puntoy1,puntox1, base);
        //s.ObtenerSuperficie(base, altura);
        System.out.println("La superficie del rectangulo es: " +s.ObtenerSuperficie(base, altura) );
        //p.ObtenerPerimetro(base, altura);
        System.out.println("El perimetro del rectangulo es: " + p.ObtenerPerimetro(base, altura));
        
    }
}
