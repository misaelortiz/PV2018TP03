/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto8.test;

import java.util.Scanner;
import tp3.punto8.modelo.Libro;
import tp3.punto8.utils.GestorLibros;

/**
 *
 * @author E. Misael Ortiz
 */
public class TestLibro {
    public static void main(String[] args) {
        GestorLibros gl = new GestorLibros();
        Libro isbn = new Libro();
        Libro autor = new Libro();
        Libro titulo = new Libro();
        Libro precio = new Libro();
        
        Scanner sc = new Scanner(System.in);
        int resp;
        do{
            int op=0;
             Libro unLibro = new Libro();
             resp=gl.MenuRegistro(op);
            switch(resp){
                case 1:{         
                    long codigo;
                    System.out.println("Ingrese ISBN del libro ");
                    codigo=sc.nextLong();
                    unLibro.setIsbn(codigo);
                    String libro;
                    System.out.println("Ingrese titulo del libro ");
                    libro=sc.next();
                    unLibro.setTitulo(libro);    
                    String at;
                    System.out.println("Ingrese autor del libro ");
                    at=sc.next();
                    unLibro.setAutor(at);
                    double pc;
                    System.out.println("Ingrese precio del libro ");
                    pc=sc.nextDouble();
                    unLibro.setPrecio(pc);
                    
        
                    gl.agregarLibro(unLibro);
                    for(Libro l: gl.getLibros()){
                    System.out.println(" " + l.getIsbn());
                    System.out.println(" " + l.getTitulo());
                    System.out.println(" " + l.getAutor());
                    System.out.println(" " + l.getPrecio());
        
                     }
                }break;
                default: System.out.println("fin del regristo");
                
            }
        
    }while(resp!=2);
         
    }         
        
    

}