/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author E. Misael Ortiz
 */
public class TestBusqueda {
    public static void main(String[] args) {
        ArrayList<Libro> libros  = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
       Libro libro1 = new Libro();
       Libro libro2 = new Libro();
       Libro libro3 = new Libro();
       Libro libro4 = new Libro();
     
       libro1.setIsbn(423478);
       libro1.setTitulo("Poema");
       libro1.setAutor("Pablo C");
       libro1.setPrecio(43.50);
       libro1.setEditorial("Editorial WR");
       libros.add(libro1);
       
       libro2.setIsbn(1528452);
       libro2.setTitulo("Entredosuniversos");
       libro2.setAutor("Andrea Tome");
       libro2.setPrecio(470);
       libro2.setEditorial("Plataforma NEO");
       libros.add(libro2);
       
       libro3.setIsbn(1342547);
       libro3.setTitulo("Asylum");
       libro3.setAutor("Roux Madeleine");
       libro3.setPrecio(235);
       libro3.setEditorial("Editorial Game");
       libros.add(libro3);
       
       libro4.setIsbn(999998);
       libro4.setTitulo("Eljuegoinfinito");
       libro4.setAutor("John Dashner");
       libro4.setPrecio(175.50);
       libro4.setEditorial("Montena");
       libros.add(libro4);
       /*Metodo para mostrar el ArrayList */
        //libro1.visualizarLibros(libros);
       
        System.out.println("Que libro desea buscar? Por favor ingrese un titulo");
        String buscado;
        buscado=sc.next();
        
        /* Busqueda de un libro en el ArrayList 
           En caso de que exista mostrara lo correspondiente.
           De otro modo mostrara un mensaje de que el libro no existe.
        */
        
        
        for(int i = 0 ; i < libros.size(); i++) {
            if(libros.get(i).getTitulo().equals(buscado)==true) {
                //System.out.println("Si existe");
                System.out.println("ISBN: " + libros.get(i).getIsbn());
                System.out.println("AUTOR: " +libros.get(i).getAutor());
                System.out.println("PRECIO: " +libros.get(i).getPrecio());
                System.out.println("EDITORIAL: " +libros.get(i).getEditorial());
                } 
                  
            }   
        System.out.println("Este libro no existe");
    }
}
