/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto3;

import java.util.Scanner;

/**
 *
 * @author E. Misael Ortiz
 */
public class TestTriangulo {
    public static void main(String[] args) {
     
        Triangulo lado = new Triangulo();
        Triangulo lado2 = new Triangulo();
        Triangulo lado3 = new Triangulo ();
        Triangulo unTriangulo = new Triangulo();
        Scanner sc = new Scanner(System.in);
        double l1;
        System.out.println("Ingrese lado 1: ");
        l1=sc.nextDouble();
        double l2;
        System.out.println("Ingrese lado 2: ");
        l2=sc.nextDouble();
        double l3;
        System.out.println("Ingrese lado 3: ");
        l3=sc.nextDouble();
        lado.setLado1(l1);
        lado2.setLado2(l2);
        lado3.setLado3(l3);
        unTriangulo.ResolverTriangulo(lado, lado2, lado3);
        
    }
}
