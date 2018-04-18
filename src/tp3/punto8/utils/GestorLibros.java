/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto8.utils;

import java.util.ArrayList;
import java.util.Scanner;
import tp3.punto8.modelo.Libro;

/**
 *
 * @author E. Misael Ortiz
 */
public class GestorLibros {
    private ArrayList<Libro> libros = new ArrayList();
    
    
    
    public ArrayList<Libro> getLibros() {
        return libros;
    }

 
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public void agregarLibro(Libro a){
        
        this.libros.add(a);
       
        
    }
    public  int MenuRegistro (int a){
        int op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Elija una opcion: ");
        System.out.println("1-Registrar libro");
        System.out.println("2- Salir");
        
        op=sc.nextInt();
        return op;
   }
}
