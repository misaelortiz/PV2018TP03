/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto6;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alumno
 */
public class Rectangulo {
    
    private int base;
    private int altura;
    private int x1;
    private int y1;
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }
    
    public void visualizarRectangulos(ArrayList<Rectangulo> rectangulos){
        for(int i=0; i<rectangulos.size(); i++){
            System.out.println("El rectangulo N°: "+(i+1));
            rectangulos.get(i).obtenerUnPunto();
            System.out.println("Base: "+rectangulos.get(i).getBase());
            System.out.println("Altura: "+rectangulos.get(i).getAltura());
            rectangulos.get(i).obtenerArea();
            rectangulos.get(i).obtenerSuperficie();
    }}
    
    public void obtenerUnPunto(){
        System.out.println("El punto encontrado es: "+" "+x1+" "+(y1-altura)); 
    }
    
    public void obtenerSuperficie(){
        System.out.println("La superficie es: "+((base*2)+(altura*2)));
    }
    public  void obtenerArea(){
        System.out.println("El area es: "+(base*altura));
    }
}
