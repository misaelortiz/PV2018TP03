/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto6;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Principal {
    private static Object scanner;
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       ArrayList<Rectangulo> rectangulos  = new ArrayList<>();
       Rectangulo rectangulo1 = new Rectangulo();
       Rectangulo rectangulo2 = new Rectangulo();
       Rectangulo rectangulo3 = new Rectangulo();
       Rectangulo rectangulo4 = new Rectangulo();
       Rectangulo rectangulo5 = new Rectangulo();
       rectangulo1.setAltura(5);
       rectangulo1.setBase(6);
       rectangulo1.setX1(3);
       rectangulo1.setY1(7);
       rectangulos.add(rectangulo1);
       rectangulo2.setAltura(6);
       rectangulo2.setBase(3);
       rectangulo2.setX1(1);
       rectangulo2.setY1(1);
       rectangulos.add(rectangulo2);
       rectangulo3.setAltura(7);
       rectangulo3.setBase(3);
       rectangulo3.setX1(0);
       rectangulo3.setY1(9);
       rectangulos.add(rectangulo3);
       rectangulo4.setAltura(4);
       rectangulo4.setBase(2);
       rectangulo4.setX1(-2);
       rectangulo4.setY1(-3);
       rectangulos.add(rectangulo4);
       rectangulo5.setAltura(3);
       rectangulo5.setBase(5);
       rectangulo5.setX1(-4);
       rectangulo5.setY1(4);
       rectangulos.add(rectangulo5);
       rectangulo1.visualizarRectangulos(rectangulos); 
       
        
       System.out.println("Elija el numero del rectangulo a eliminar");
       int op=sc.nextInt()-1;
       rectangulos.remove(op);
       rectangulo1.visualizarRectangulos(rectangulos); 
       
        
    }
    
}
