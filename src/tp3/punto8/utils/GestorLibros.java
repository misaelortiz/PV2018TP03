/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.punto8.utils;

import java.util.ArrayList;
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
    
    public void agregarLibro(Libro a, Libro b, Libro c, Libro d){
        
        this.libros.add(a);
        this.libros.add(b);
        this.libros.add(c);
        this.libros.add(d);
        
    }
    
}
