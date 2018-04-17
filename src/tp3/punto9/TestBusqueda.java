/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto9;

import java.util.ArrayList;

/**
 *
 * @author E. Misael Ortiz
 */
public class TestBusqueda {
    public static void main(String[] args) {
        ArrayList<Libro> libros  = new ArrayList<>();
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
       libro2.setTitulo("Entre dos Universos");
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
       libro4.setTitulo("El Juego Infinito");
       libro4.setAutor("John Dashner");
       libro4.setPrecio(175.50);
       libro4.setEditorial("Montena");
       libros.add(libro4);
       
       libro1.visualizarLibros(libros);
       
       
    }
}
