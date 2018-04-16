/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.test;

import java.util.Scanner;
import tp3.punto8.modelo.Libro;
import tp3.punto8.utils.GestorLibros;

/**
 *
 * @author E. Misael Ortiz
 */
public class TestLibro {
    public static void main(String[] args) {
        
        Libro isbn = new Libro();
        Libro autor = new Libro();
        Libro titulo = new Libro();
        Libro precio = new Libro();
        Scanner sc = new Scanner(System.in);
       
        long codigo;
        System.out.println("Ingrese ISBN del libro ");
        codigo=sc.nextLong();
        isbn.setIsbn(codigo);
        
        String libro;
        System.out.println("Ingrese titulo del libro ");
        libro=sc.next();
        titulo.setTitulo(libro);    
        
        String at;
        System.out.println("Ingrese autor del libro ");
        at=sc.next();
        autor.setAutor(at);
        
        double pc;
        System.out.println("Ingrese precio del libro ");
        pc=sc.nextDouble();
        precio.setPrecio(pc);
        
             
        
        GestorLibros gl = new GestorLibros();
        
        gl.agregarLibro(isbn);
        gl.agregarLibro(titulo);
        gl.agregarLibro(autor);
        gl.agregarLibro(precio);
        
        for (Libro libr: gl.getLibros()){
            System.out.println("ISBN:" + libr.getIsbn());
            System.out.println("TITULO:" + libr.getTitulo());
            System.out.println("AUTOR:" + libr.getAutor());
            System.out.println("PRECIO: "+ libr.getPrecio());
        }
    }
}